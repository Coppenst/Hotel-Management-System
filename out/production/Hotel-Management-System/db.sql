USE hoteldb;
drop table tbl_Bookings;
CREATE TABLE tbl_Bookings(id INT not null auto_increment PRIMARY KEY, -- Auto-increment allows a unique number to be generated automatically when a new record is inserted into a table.
phone varchar(15),
email varchar(30),
bookingDate datetime,
guestsTotal INT);

insert into tbl_Bookings(phone, email, bookingDate, guestsTotal) values ('123-234-4567','abc@mail.com','2020-04-30 10:10:00',5);
insert into tbl_Bookings(phone, email, bookingDate, guestsTotal) values ('234-567-7890','def@mail.com','2020-05-05 11:10:00',10);

select * from tbl_Bookings;

drop table tbl_Hotel; -- The DROP TABLE statement is used to drop an existing table in a database.
create table tbl_Hotel(
    id int not null auto_increment primary key ,
    hotelName varchar(50),
    address varchar(100),
    area varchar(50),
    roomTotal int);

insert into tbl_Hotel(hotelName, address, area, roomTotal) VALUES ('Marriot','Ladenburgstrasse','Frankfurt',25);
insert into tbl_Hotel(hotelName, address, area, roomTotal) VALUES ('Limsa','pilzstrasse','Hamburg',40);

select * from tbl_Hotel;

create table tbl_Employees(
    employeeID int not null primary key,
    name varchar(30),
	role varchar(20),
	phone varchar(15),
	email varchar(50),
	wage float,
	hotel_id int,
    foreign key (hotel_id) references tbl_Hotel(id));

insert into tbl_Employees(employeeID, name, role, phone, email, wage, hotel_id) VALUES (123,'employee1','reception','232-232-2323','ad@mail.com',23.50,1);
insert into tbl_Employees(employeeID, name, role, phone, email, wage, hotel_id) VALUES (223,'employee2','cleaner','555-888-2323','aas@mail.com',15.50,2);

select * from tbl_Employees;

create table tbl_Guest(
    id int not null auto_increment primary key ,
    name varchar(30),
    nationality varchar(40),
    age int,
    reservationID int,
    foreign key (reservationID) references tbl_Bookings(id)
    );

insert into tbl_Guest(name, nationality, age, reservationID) values ('guest1','German',35,1);
insert into tbl_Guest(name, nationality, age, reservationID) values ('guest2','American',24,1);

select * from tbl_Guest;

create table tbl_Payments(
    id int not null primary key auto_increment,
    reservationID int,
    amount float,
	paymentmethod varchar(20),
	paymentDate date,
	foreign key (reservationID) references tbl_Bookings(id)
);

insert into tbl_Payments(reservationID, amount, paymentmethod, paymentDate) VALUES (1,100.00,'Cash','2020-05-05');

select * from tbl_Payments;

drop table tbl_rooms;
create table tbl_rooms(
    id int not null auto_increment primary key ,
    roomNo int not null ,
    type varchar(20),
	pricePerNight float,
	bedTotal int,
	hotel_id int,
	isbooked boolean,
	floornumber int,
	foreign key (hotel_id) references tbl_Hotel(id)); -- Different Hotels can have same roomId (foreign Key)

insert into tbl_rooms(roomNo, type, pricePerNight, bedTotal, hotel_id, isbooked,floornumber) VALUES (100,'Luxury',500,3,1,false,1);
insert into tbl_rooms(roomNo, type, pricePerNight, bedTotal, hotel_id, isbooked,floornumber) VALUES (101,'Luxury',600,4,1,false,1);
insert into tbl_rooms(roomNo, type, pricePerNight, bedTotal, hotel_id, isbooked,floornumber) VALUES (102,'Luxury',700,5,1,false,1);

select * from tbl_rooms;

drop table if exists tbl_maintenance_company;
create table tbl_Maintenance_Company(
    id int not null auto_increment primary key ,
    Name varchar(50),
	Address varchar(100)
);

insert into tbl_maintenance_company(name, address) values ('maintainance company 1','address1');
select * from tbl_maintenance_company;

drop table if exists tbl_Repair;
create table tbl_Repair(
    id int not null auto_increment primary key ,
    roomId int,
    cmpID int,
    dates varchar(100),
	description varchar(200),
	repair_type varchar(100),
    foreign key (roomId) references tbl_rooms(id)
);

insert into tbl_Repair(roomId, cmpID, dates, description, repair_type) values (2,1,'2020-04-20 to 2020-04-22','Maintainance','Maintainance');

select * from tbl_Repair;







