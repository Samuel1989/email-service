A restful Java application that accepts JSON containing details on an email and sends the email using the SendGrid API.

To build, package and deploy this program I have used Maven as well as Spring Boot to embed the application and Apache Tomcat into a single executable jar file.

Spring MVC has been used to handle the rest interfacing and Jackson to parse/build JSON objects and/or arrays.

Instructions
------------
* Open a command terminal and clone this repository.
```
git clone https://github.com/Samuel1989/email-service.git
```
* Navigate to the email-service directory.
```
cd email-service
```
* Build the project using Maven.
```
mvn package
```
* Execute the email-service-0.0.1-SNAPSHOT.jar file.
```
java -jar target/email-service-0.0.1-SNAPSHOT.jar
```
* Create a restful post to the following url.
```
http://localhost:8080/rest/sendemail
```

Examples of JSON POST
---------------------
```
{"recipients":["Hello@World.com"],"copyRecipients":[],"blindRecipients":[],"sender":"Info@World.com,"subject":"Hello World","message":"Hey World"}
```
