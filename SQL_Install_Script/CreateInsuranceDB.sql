CREATE DATABASE taylorsInsurance;

USE taylorsInsurance;

CREATE TABLE driver (
	driverName VARCHAR(30) NOT NULL,
   age INT NOT NULL,
   numberOfAccidents INT,
   address VARCHAR (100) NOT NULL,
   PRIMARY KEY (driverName)
);

SELECT * FROM driver;