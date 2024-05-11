Backend Application for Managing Assistants
This backend application is built with Java and Spring Boot, and it provides CRUD APIs for managing assistants. It uses MySQL as the database to store assistant details.

Prerequisites
Before running the application, make sure you have the following installed:

Java Development Kit (JDK)
Apache Maven
MySQL Server

1) Clone the Repository:
https://github.com/kunalsupekar/hirademy-backend.git

2)Database Configuration:

Create a MySQL database named assistant .
Update the database configuration in src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/assistant
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

3)Run the Application:
open any editor and import this folder as a maven project ,then right click on the  AssistantApiApplication file and run this file.
The application will start running at http://localhost:8081/assistant/ping.

API Endpoints
POST /assistant: Creates a new assistant record.
GET /assistant/{assistant_id}: Retrieves details of a specific assistant.
PUT /assistant/{assistant_id}: Updates details of a specific assistant.
DELETE /assistant/{assistant_id}: Deletes a specific assistant record.
Testing with Postman
Import the Postman collection JSON file provided in the repository.
Test each API endpoint to ensure proper functionality and error handling.
Demo Recording
Watch the demo recording to see how to interact with the API endpoints using Postman.

Contributor
Kunal Supekar
