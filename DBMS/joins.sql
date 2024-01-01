use sql_db;
select * from employee;
select * from dept;
-- Inner Join
-- Fetch employee name and the name of department they belong to
select e.emp_name,d.dept_name
from employee e join dept d on e.dept_id=d.dept_id;
-- Left join
select e.emp_name,d.dept_name
from employee e left join dept d on e.dept_id=d.dept_id;
-- Right join
select e.emp_name,d.dept_name
from employee e right join dept d on e.dept_id=d.dept_id;

-- Fetch details of all employees, their manager,department and project they work on


select * from manager;
select e.emp_name,d.dept_name,m.manager_id,p.project_name from employee e 
left join dept d on e.dept_id=d.dept_id
join manager m on e.manager_id=m.manager_id
left join projects p on e.emp_id=p.team_member_id;

-- Full Join
(select e.emp_name,d.dept_name
from employee e 
left join dept d on d.dept_id=e.dept_id)
UNION 
 (select e.emp_name,d.dept_name
from employee e 
right join dept d on d.dept_id=e.dept_id);




