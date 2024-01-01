create database sql_db;

use sql_db;

create table employee(
emp_id int PRIMARY KEY,
emp_name varchar(20) NOT NULL,
salary int,
dept_id varchar(5),
manager_id varchar(5));

create table manager(
manager_id varchar(5),
manager_name varchar(20),
dept_id varchar(5));

create table dept(
dept_id varchar(5) primary key,
dept_name varchar(20) unique);

create table projects(
project_id varchar(5),
project_name varchar(40),
team_member_id varchar(5));




