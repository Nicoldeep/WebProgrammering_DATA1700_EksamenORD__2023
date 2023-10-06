package com.example.ordeksamen2023;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.*;


//OPPGAVE 5 AND 6
//Citizen repository:
@Repository
public class CitizenRepository{

    @Autowired
    private JdbcTemplate db;

    private Logger logger = LoggerFactory.getLogger(CitizenRepository.class);

    public boolean saveCitizen(Citizen citizen){

        String sql = "INSERT INTO Citizen(firstName, sureName, DOB, SSN, phoneNr, email, city, street) VALUES(?,?,?,?,?,?,?,?)";

        try{
            db.update(sql, citizen.getFirstName(), citizen.getSureName(), citizen.getDOB(), citizen.getSSN(), citizen.getPhoneNr(), citizen.getEmail(), citizen.getCity(), citizen.getStreet());
            return true;

        }
        catch(Exception e){
            logger.error("Error in saveCitizen, could not save!" + e);
            return false;
        }
    }


    //OPPGAVE 7
    //THIS REQUIERS THAT WE NEED TO ADD PASSORD IN DB AS WELL, AND IN POJO, AND HTML AND JS, SINCE THIS IS AN "JAVA TASK" I diddent do that and only wrote the java code:

    private boolean checkPassword(String innPassword, String password){
        boolean ok = BCrypt.checkpw(password, innPassword);
        return ok;
    }

    private boolean checkNameAndPassword(String password){

        String sql = "SELECT * FROM Citizen WHERE firstName=?";

        try{
            Citizen dbCitizen = db.queryForObject(sql, BeanPropertyRowMapper.newInstance(Citizen.class), new Object[]{Citizen.getFirstName()}); //gets the right name from db

            return checkPassword(dbCitizen.getPassoword(), dbCitizen.getPassword()); //checks the passoword we send inn vs. the one in DB

        }
        catch(Exception e){
            return false;
        }
    }




    //Gets all the citizens


    public List<Citizen> getAllCitizensRemoveUnderAged(){

        String sql = "DELETE FROM Citizen WHERE (YEAR(DOB)>'2005')"; //delete all under age 18. or birthyear is bigger than 205
        String sql1 = "SELECT * FROM Citizen ORDER BY sureName ASC, lastName ASC";   //Aplhabeticly ASC

        try{
            List<Citizen> allCitizens = db.query(sql1, new BeanPropertyRowMapper(Citizen.class));

            return allCitizens;
        }
        catch(Exception e){
            logger.error("Error in getAllCitizens:" + e);
            return null;
        }
    }

}
