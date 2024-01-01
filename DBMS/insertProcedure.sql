Create procedure myProcedure (IN Rollno VARCHAR(10), IN name VARCHAR(30), IN department VARCHAR(20)) 
   BEGIN
   INSERT INTO student(rollno, name,departement) VALUES (Rollno,name,department);
   END

