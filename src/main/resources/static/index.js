//OPPGAVE 2


//JS Display the object you create


function saveCitizen(){

    //create js object:

    const citizen ={
        firstName : $(#firstName).val(),
        sureName :  $(#sureName).val(),
        DOB : $(#DOB).val(),
        SSN :  $(#SSN).val(),
        phoneNr : $(#phoneNr).val(),
        email :  $(#email).val(),
        city :  $(#city).val(),
        street :  $(#street).val()
    };

    //show in console
    console.log(citizen);


    //create call towards endpoint saveCitizen!, with error message back if it doesnt work

    $.post("/saveCitizen",citizen, function(){

        //Dont need anything here for now.


        //added som error messages:
    }).fail(function (jqXHR){
        const json = $.parseJSON(jqXHR.responseText);
        $("errorTextFirstName").html(json.message);
    });



    //Oppgave 7

    //GET THE DATA IN BROWSER and conect to endpoint
// IN MY JS FILE::


//this write to browser in a good formated way.


    function getCitizens(){
        $.get("/getAllCitizensRemoveUnderAged", function(citizens){

            let out = "<table><tr><th><Firstname></th><th><Surename></th><th><DOB>/<th><th><SSN></th><th><PhoneNr></th><th><Email></th><th><City></th><th><Street></th></tr>"

            for(const citizen of citizens){
                out+="<tr><td>" + citizen.firstname + "</td>" +
                "<td>" + citizen.surename + "</td>" +
                "<td>" + citizen.DOB + "</td>" +
                "<td>" + citizen.SSN + "</td>" +
                "<td>" + citizen.phoneNr + "</td>" +
                "<td>" + citizen.email + "</td>" +
                "<td>" + citizen.city + "</td>" +
                "<td>" + citizen.street + "</td></tr>"

                out+="</table>";

                //show in browser:

                $("citizens").html(out);
            }

        }).fail(function(status) {
            if (status.satus = "404") {
                $("#errorTextFirstName").html("You have to log inn to se the citizens!");
            }
        }}}
