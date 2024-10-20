create database university_management_system1;
use university_management_system1;

create table login(ID varchar(20),PW varchar(20));
insert into login value("Swayam","160905");
insert into login value("Ayush","010406");
insert into login value("Vinayak","041205");
select * from login;

create table teacher (name varchar(40),fname varchar(40),empID varchar(40),dob varchar(40),address varchar(40),phone varchar(40),email varchar(40),class_X varchar(40),class_XII varchar(40),aadhar varchar(40),education varchar(40),department varchar(40));
select * from teacher;

create table student1 (name varchar(40),fname varchar(40),empID varchar(40),dob varchar(40),address varchar(40),phone varchar(40),email varchar(40),class_X varchar(40),class_XII varchar(40),aadhar varchar(40),course varchar(40),department varchar(40));
select * from student1;

create table teacherleave(empID varchar(20),date varchar(20),time varchar(20));  
select * from teacherleave;

create table studentleave(rollno varchar(20),date varchar(20),time varchar(20));  
select * from studentleave;

create table subject(rollno varchar(20),semester varchar(20),subj1 varchar(20),subj2 varchar(20),subj3 varchar(20),subj4 varchar(20),subj5 varchar(20));
select * from subject;

create table marks(rollno varchar(20),semester varchar(20),mrk1 varchar(20),mrk2 varchar(20),mrk3 varchar(20),mrk4 varchar(20),mrk5 varchar(20));
select * from marks;

create table fee(course varchar(20),semester1 varchar(20),semester2 varchar(20),semester3 varchar(20),semester4 varchar(20),semester5 varchar(20),semester6 varchar(20),semester7 varchar(20),semester8 varchar(20));
insert into fee values("BTech", "49000", "43000","43000","43000","43000","43000","43000","43000");
insert into fee values("Bsc", "44000", "35000","35000","35000","35000","35000","","");
insert into fee values("BCA", "39000", "34000","34000","34000","34000","34000","","");
insert into fee values("MTech", "70000", "60000","60000","60000","","","","");
insert into fee values("MSc", "44000", "45000","45000","45000","","","","");
insert into fee values("MCA", "66000", "42000","42000","49000","","","","");
insert into fee values("Bcom", "32000", "20000","20000","20000","20000","20000","","");
insert into fee values("Mcom", "46000", "30000","30000","30000","","","","");
select * from fee;

create table feecollege(rollno varchar(20),course varchar(20),department varchar(20),semester varchar(20),total varchar(20));
select * from feecollege;
