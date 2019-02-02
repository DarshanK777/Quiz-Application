create table users
(
	id int auto_increment primary key,
    name varchar(500),
    username varchar(100),
    password varchar(100)
);

create table userdata(
	id int auto_increment primary key,
    question varchar(1000),
    answer varchar(3000)
);

create table serverdata
(
	id int auto_increment primary key,
    question varchar(1000),
    answer varchar(1000)
);

 create table questiontable
 (
 
	id int auto_increment primary key,
    question varchar(1000)
 );
 
insert into questiontable(question) values ('what is Operating System?');
insert into questiontable(question) values ('what is Engineering?');
 
 select * from questiontable;
 
insert into serverdata(question,answer) values ('what is Operating System?','An operating system (OS) is system software that manages computer hardware and software resources and provides common services for computer programs. the operating system acts as an intermediary between programs and the computer hardware. Operating systems are found on many devices that contain a computer.');
insert into serverdata(question,answer) values ('what is Engineering?','The creative application of scientific principles to design or develop structures, machines, apparatus, or manufacturing processes, or works utilizing them singly or in combination. To construct or operate the same with full cognizance of their design or to forecast their behavior under specific operating conditions. All as respects an intended function, economics of operation and safety to life and property');
 
 truncate table serverdata;
 select * from serverdata;
 
insert into userdata(question,answer) values ('what is Operating System?','An operating system (OS) is system software that manages computer hardware and software resources and provides common services for computer programs. the operating system acts as an intermediary between programs and the computer hardware. Operating systems are found on many devices that contain a computer.');
insert into userdata(question,answer) values ('what is Engineering?','The creative application of scientific principles to design or develop structures, machines, apparatus, or manufacturing processes, or works utilizing them singly or in combination. To construct or operate the same with full cognizance of their design; or to forecast their behavior under specific operating conditions. all as respects an intended function, economics of operation and safety to life and property');
 
 
 select * from userdata;
 
 
ALTER TABLE serverdata ADD keywords varchar(3000);


UPDATE serverdata
SET keywords='system software computer intermediary hardware'
WHERE ID = 1;

UPDATE serverdata
SET keywords='design develop construct conditions functions safety'
WHERE ID = 2;