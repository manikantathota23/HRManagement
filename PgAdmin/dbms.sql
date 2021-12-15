CREATE TABLE employee (
  empId varchar primary key,
  fname varchar,
  lname varchar,
  gender varchar,
  dob date,
  emailId varchar not null,
  phno varchar not null,
  city varchar,
  zipcode integer,
  datejoined date CHECK (datejoined > dob),
  salary integer CHECK (salary >0),
  role varchar,
  qualification varchar,
    dept varchar,
    dept_id varchar,
    training varchar,
	score1 varchar,
	score2 varchar
);
alter table employee add column training2 varchar
COPY employee FROM 'D:\Subjects\project\Application\Employeedata.csv' DELIMITER ',' CSV HEADER;
select * from employee


create table promotions(
    id varchar primary key
);

COPY promotions FROM 'D:\Project\num.csv' DELIMITER ',' CSV HEADER;
alter table promotions add column adm varchar
alter table promotions add column promo varchar


create table query(
    id varchar primary key,
    ans varchar
);
insert into query values (1,'Honesty,Integrity,Trustworthiness,Loyality,Fairness,Concern for others,Respect For others'),
                 (2,'In your profile, down left u can click on the blue button it will redirect to the promotion requst page'),
                 (3,'U can contact admin'),
                 (4,'You can either find them in your profile or in Traning Panel'),
                 (5,'With a Span of 2 Hours You Can go to Cantee'),
                 (6,'4.5/5')
select * from test

create table test(
    id varchar primary key
);

COPY test FROM 'D:\Project\num.csv' DELIMITER ',' CSV HEADER;

alter table test add column ans1 varchar
alter table test add column ans2 varchar
alter table test add column ans3 varchar
alter table test add column ans4 varchar
alter table test add column ans5 varchar