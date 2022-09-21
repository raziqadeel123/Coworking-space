
INSERT INTO Role (id , name)  VALUES
('01', 'amdin'),
('02', 'tester');

INSERT INTO Persons(userid, firstname, lastname, email, password) VALUES
(1L,'test', 'tester', 'tester@gmail.com', 'uewz892342'  ),
(2L,'test2', 'tester2', 'tester2@gmail.com', 'uewz890342');

INSERT INTO Seat(seatid, avaiable, seatnumber, seatuser, fk_user) VALUES
('001', true , 'p1' ,'1' , '1'),
('002', true, 'p2' , '2' , '2');

INSERT INTO  Booking (id, checkin, checkout, total_price, fk_user , fk_seat)  VALUES
('0001', '2022-09-20', '2020-09-21', '60' , '1', '001'),
('0002', '2022-09-21', '2020-09-22', '50', '2', '002');