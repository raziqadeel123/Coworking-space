DROP TABLE IF EXISTS Role cascade;
CREATE TABLE Role (
          id  Long NOT NULL,
           name VARCHAR(50) NOT NULL,
           PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Persons cascade;
CREATE TABLE Persons(
        userId  Long NOT NULL ,
        firstName VARCHAR(50) NOT NULL,
        lastName VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        password VARCHAR(50) NOT NULL,
        PRIMARY KEY (userId)
);



DROP TABLE IF EXISTS Seat cascade;
CREATE TABLE Seat(
        seatId Long Not NULL,
        avaiable BOOLEAN Not NULL DEFAULT TRUE,
        SeatNumber VARCHAR Not NULL,
        seatuser int NOT NULL,
        fk_user int NOT NULL,

        PRIMARY Key (seatId),
       FOREIGN KEY (fk_user) REFERENCES Persons(userId)
);

DROP TABLE if EXISTS Booking cascade;
CREATE TABLE Booking (
             id long NOT NULL,
             checkin DATE NOT NULL,
             checkout DATE NOT NULL,
             total_price VARCHAR(50) NOT NULL,
             fk_user LONG NOT NULL,
             fk_seat LONG NOT NULL,
             PRIMARY KEY (id) ,
             FOREIGN KEY (fk_user) REFERENCES Persons(userId),
             FOREIGN Key (fk_seat) REFERENCES Seat(seatId)

);