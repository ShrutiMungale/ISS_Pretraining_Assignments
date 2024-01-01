use sql_db;

select * from employee;

select * from manager;

create table employee_manager_backup(emp_name varchar(20), manager_name varchar(20));
-- select into
select emp_name into @ename from employee where salary=295000;
select @ename;

-- insert into select
insert into employee_manager_backup 
select employee.emp_name,manager.manager_name from employee join manager on employee.manager_id=manager.manager_id;

select * from employee_manager_backup;