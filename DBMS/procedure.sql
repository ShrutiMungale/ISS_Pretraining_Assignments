use demodb;

ALTER TABLE student
RENAME COLUMN name to student_name;
-- create stored procedure
DELIMITER //
CREATE PROCEDURE INSERT_PROCEDURE(IN Rollno VARCHAR(10), IN student_name VARCHAR(30), IN department VARCHAR(20))
BEGIN
INSERT INTO student(Rollno,student_name,department) VALUES(Rollno,student_name,department);
END //

DELIMITER ;

SELECT * FROM STUDENT;