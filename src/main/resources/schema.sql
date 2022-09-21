DROP TABLE IF EXISTS Role cascade;
CREATE TABLE Role (
          id  Long NOT NULL,
           name VARCHAR(50) NOT NULL,
           PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Persons cascade;
CREATE TABLE Persons(
        userid  Long  Not NULL,
        firstname VARCHAR(50) NOT NULL,
        lastname VARCHAR(50) NOT NULL,
        email VARCHAR(50) NOT NULL,
        password VARCHAR(50) NOT NULL,
        PRIMARY KEY (userid)
);



DROP TABLE IF EXISTS Seat cascade;
CREATE TABLE Seat(
        seatid Long Not NULL,
        avaiable BOOLEAN Not NULL DEFAULT TRUE,
        seatnumber VARCHAR Not NULL,
        seatuser int NOT NULL,
        fk_user int NOT NULL,

        PRIMARY Key (seatid),
       FOREIGN KEY (fk_user) REFERENCES Persons(userid)
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
             FOREIGN KEY (fk_user) REFERENCES Persons(userid),
             FOREIGN Key (fk_seat) REFERENCES Seat(seatid)

);