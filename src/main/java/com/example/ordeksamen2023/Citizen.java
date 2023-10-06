package com.example.ordeksamen2023;

//Java and SQL , Created POJO to match the input fileds and Created table for Citizen so we can add in DB
//OPPGAVE 4
//POJO Citizen JAVA CLASS

public class Citizen{

        //Define the attributs used

        private String firstName;
        private String sureName;
        private int DOB;
        private int SSN;
        private int phoneNr;
        private String email;
        private String city;
        private String street;


        //constructor

        public Citizen(String firstName, String sureName, int DOB, int SSN, int phoneNr, String email, String city, String street){

            this.firstName = firstName;
            this.sureName = sureName;
            this.DOB = DOB;
            this.SSN = SSN;
            this.phoneNr = phoneNr;
            this.email = email;
            this.city = city;
            this.street = street;
        }

        //Empty constructer:

        public Citizen(){

        }

        //GETTERS and SETTERS:

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getSureName(){
            return sureName;
        }

        public void setSureName(String sureName){
            this.sureName = sureName;
        }

        public int getDOB(){
            return DOB;
        }

        public void setDOB(int DOB){
            this.DOB = DOB;
        }

        public int getSSN(){
            return SSN;
        }

        public void setSSN(int SSN){
            this.SSN = SSN;
        }

        public int getPhoneNr(){
            return phoneNr;
        }

        public void setPhoneNr(int phoneNr){
            this.phoneNr = phoneNr;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public String getCity(){
            return city;
        }

        public void setCity(String city){
            this.city = city;
        }

        public String getStreet(){
            return street;
        }

        public void setStreet(String street){
            this.street = street;
        }

}