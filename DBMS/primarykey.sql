use sql_db;
CREATE TABLE Persons (
    Personid int NOT NULL AUTO_INCREMENT,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    City varchar(255) DEFAULT 'Mumbai',
    PRIMARY KEY (Personid),
    CHECK(AGE>=18)
);

CREATE TABLE Orders (
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);
-- age>=18 and PersonID autoincrements
INSERT INTO Persons (FirstName,LastName,Age,City)
VALUES ('Shruti','Mungale',21,'Pune');
-- default value for city is used and PersonID autoincrements
INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Palak','Chropra',21);

INSERT INTO Persons (FirstName,LastName,Age,City)
VALUES ('Riddhi','Arya',23,'Surat');

INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Rahi','Pati;',22);

INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Mihika','Dakapaggari;',22);
INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Niyati','Rolia;',22);
INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Ruta','Kulkarni;',22);
INSERT INTO Persons (FirstName,LastName,Age)
VALUES ('Anannya','Khedekar;',22);
INSERT INTO Persons (FirstName,LastName,Age,City)
VALUES ('Smita','Naik',22,Pune);
SET SQL_SAFE_UPDATES = 0;
Update Persons set FirstName='Rahi' where FirstName='Rahi;';
Update Persons set FirstName='Rahi' where FirstName='Rahi;';
UPDATE PERSONS SET LastName = REPLACE(LastName, ';', '');


INSERT INTO Orders
VALUES (101,1001,1);
INSERT INTO Orders
VALUES (102,1002,1);
INSERT INTO Orders
VALUES (303,3003,2);


select * from persons;
select * from orders;
-- create index 
CREATE INDEX idx_lastname
ON Persons (LastName);
select * from persons;
-- drop index 
ALTER TABLE Persons
DROP INDEX idx_lastname;

-- Alter table
ALTER TABLE Orders
ADD OrderDate date DEFAULT (CURRENT_DATE());

-- Views
CREATE OR REPLACE VIEW Mumbai_Customers AS
SELECT * FROM PERSONS
WHERE CITY='MUMBAI';

Select * from Mumbai_Customers;

DROP VIEW Mumbai_Customers;

-- Group by
Select count(PersonID),City FROM PERSONS GROUP BY CITY;
-- Having
Select count(PersonID),City FROM PERSONS GROUP BY CITY HAVING count(PERSONID)=1;

