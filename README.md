# WebProgrammering_DATA1700_EksamenORD__2023

## Generell infomasjon

Ordinær Eksamen i  Webprogrammering (DATA1700)

**Karakter**: A

**Emnekode**: DATA1700 Webprogrammering

**Dato**: 22.05.2023

**Vurderingsform**: Skriftlig eksamen under tilsyn

## Oppgaver

In recent years there has been an european trend for digitalisation of the local administrations and government entities. This trend was definitely more noticeable in the east, where countries that were left behind in the IT infrastructure started investing massively. In this scenario you are one of the developers responsible for developing a new simple management system for citizens where they can register their details.

Each task is solved by writing a part of the code that makes up this web application.

Sometimes it may be necessary to enter source code comments to fully answer a task. It is not necessary to implement more input validation, error handling and logging than is explicitly asked for in the tasks, but the web application must be user-friendly and provide the necessary feedback to the user. Consider that the answer fields should contain complete files with neat code, correct syntax and reasonable names of variables, classes, etc. There is no need to import Java classes or JavaScript libraries. Relevant attachments to the tasks are displayed on the left or at the top of the screen. You may need to scroll to see all attachments. In the event of any ambiguities in the assignment text, you must explain the assumptions you make as a basis for the solution in source code comments.

For the tasks that must be solved with JavaScript, you can choose whether you want to use jQuery or not. Note that we haven't gone through everything necessary to use JavaScript exclusively, so for the vast majority of people it will be necessary to use jQuery.

If you wish to use a Repository class in any of the tasks, this can be entered in the same answer field as the Controller class, but no extra points are awarded for this. All Java code can therefore be written directly in the functions of the Controller class.

### Oppgave 1

We start from the presumption that we have already created a new, clean Java Spring Boot project where we added all the necessary dependencies for a basic CRUD(create, read, update, delete) web application.

1. Let’s create a simple UI first. Create a form using HTML,CSS,JS. You should have simple user validation such as check for null on all fields. Please add fields for name, surname, date of birth, Social Security Number, phone number, email address, city, street and an HTML button.  Please also add custom validation for email address and phone number (hint: regex).

### Oppgave 2

2. Create a JS method with a JS object that will take into account all the fields described in the first task.Display the information you get into your new object inside a console log or an alert. (Please make sure to show the proper code for activation of this  method inside the HTML button tag - you can copy the button tag you used in the first task and just add code on top of it). Also, please make a call towards a Java rest endpoint using Jquery where to send the object you just filled. ( We don't have the endpoint for now, but let's imagine it's name is : "/saveCitizen")



### Oppgave 3

Java task: Create your first Controller class with the proper annotations. Create an endpoint “/hello” to test that your controller is configured correctly. The endpoint should return a string with a message that will be displayed on the browser when someone interrogates that particular endpoint. (Be careful about the type of mapping you use for your endpoint).


### Oppgave 4

Java & SQL  task: Create a new model class in Java that would map the input fields you created in the first task. Make sure to have all the field types similar. If you are going to use Hibernate JPA, please make sure you use the proper adnotations. Also, please write the SQL code necessary for the creation of a table that follows the rules mentioned above.

NB: Don't worry if the editor is set for Java, I don't search for SQL sintax perfection:).

### Oppgave 5

Create a new endpoint in your controller that will take care of the input it receives from JS. (The JS object you created at task 2.) Make sure that all the information you received is mapped in the model class that you defined at task 4. Now comes the funny part, you have to save that information into the DB.

Let’s consider that you already set up a connection for the DB and it works fine. You can choose any way you want to save the data in the DB, if you use the “new way” with Hibernate and JPA, please also define the interface. If the transaction with the DB is not  successful make sure to handle the error.

### Oppgave 6

Java task: You have the next scenario: A user who is logged in (let's say an administrator) would like to operate some sensitive changes to the data bases. Let’s think of a situation where you don’t like that citizens < 18 registered. If that’s the case please delete the citizens < 18 from the DB and then logout.

You will need to create 2 endpoints to manage sessions. The first endpoint for login, the second one for logout. ( pay attention on how you use the session object).

You will also have to create an endpoint to operate the changes in the DB. First, check if you are logged in. If you are, then procede with the changes. (Pay attention to the calls you have to make in the Data Base. We first need to retrieve the list, then check the condition (citizen age < 18), and in the end we have to interogate the DB again in order to delete those who don't fit the description).


### Oppgave 7

Retrieve all the citizens from the application using a new endpoint and send them in the browser as a json response. Use a Logger to show all this data in your server. Return the info by sorting alphabetically ascending using a Java method.



