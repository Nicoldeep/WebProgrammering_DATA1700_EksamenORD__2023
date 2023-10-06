package com.example.ordeksamen2023;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//OPPGAVE 3, 5,6 AND 7


//JAVA Controller class, endpoint "/hello"
//OPPGAVE 3



@RestController
public class Controller{

    @GetMapping("/hello")
    public String hello(){
        return  "It worked brother!";
    }



    //Oppgave 5

    //WE wil continiu from this controller that we started:


    //gets connection to the db

    //gets connection to the db

    @Autowired
    private CitizenRepository rep;
    //to use cookies
    @Autowired
    private HttpSession session;



    //Save in DB:


    //save citizen in db, if it works. if it dossen we get a good error messsage back

    //Save in DB with good error messages if it doesent work
    @PostMapping("/saveCitizen")          //USE THE POJO We created
    public void saveCitizen(Citizen citizen, HttpServletResponse response) throws IOException{

        if(!rep.saveCitizen(citizen)){  //If we get a error back, this happens if the repository retruns false
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error in DB, try again later!");
        }
    }

    //NEW TASK:


    @PostMapping("/login")
    public boolean login(Citizen User){

        if(rep.checkNameAndPassword(User)){
            session.setAttribute("LoggedInn", User);
            return true;
        }
        else{
            return false;
        }

    }

    @GetMapping("/getAllCitizensRemoveUnderAged")
    public List<Citizen> allCitizensRemoveUnderAged(HttpServletResponse response) throws IOException{


        if((session.getAttribute("LoggedInn"))!=null){

            List<Citizen> allCitizensRemoveUnderAged = rep.getAllCitizensRemoveUnderAged();

            if(allCitizensRemoveUnderAged ==null){
                response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Error in getAllCitizensRemoveUnderAged, try again later ");
            }

            return allCitizensRemoveUnderAged;
        }
        else{
            response.sendError(HttpStatus.NOT_FOUND.value(),"Not logged inn");
            return null;
        }

    }

    @GetMapping("/logout")
    public void logut(){
        session.removeAttribute("Logged out!"):
    }



}


