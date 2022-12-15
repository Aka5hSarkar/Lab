use mydb;
create table register(reg_id bigint(8)primary key,password varchar(6));
create table admission (reg_id bigint(8),fname varchar(25),lname varchar(25),address varchar(30),ph_no numeric(10),
course varchar(50),10th_marks double(3,2),12th_marks double(3,2),yop_12th int(4),foreign key 
(reg_id) references register(reg_id));

