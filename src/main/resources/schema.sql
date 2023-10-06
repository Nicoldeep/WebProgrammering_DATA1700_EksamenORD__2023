
//Oppgave 4
//Java and SQL , Created POJO to match the input fileds and Created table for Citizen so we can add in DB

//SCHEMA.sql

//SQL to create the citizen table
CREATE TABLE Citizen
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    firstName VARCHAR(255) NOT NULL,
    sureName VARCHAR(255) NOT NULL,
    DOB INTEGER NOT NULL,
    SSN INTEGER NOT NULL,
    phoneNr INTEGER NOT NULL,
    email VARCHAR(225) NOT NULL,
    city VARCHAR(225) NOT NULL,
    street VARCHAR(255) NOT NULL,

    PRIMARY KEY (id)
);