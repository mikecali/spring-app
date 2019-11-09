# Spring-App

Run the Microservice locally -  

Prerequisites
- Maven
- PostgreSQL
- Browser or Postman

Step 1 - Download the code from github

   ``` git clone https://github.com/SM43/Spring-App.git```

Step 2 - Build the project
  Open the project in any editor like Intellij or Eclipse and the build from terminal run the following command.  
   
   ```mvn install ```

Step 3 - Launch the Application
  Before launching the Application, Edit ```application.properties``` as per your postgres credentials.
  
  ``` mvn spring-boot:run ```

Note : Running the app``` Users ```table will be created in Database and few Users will be added.Stopping the application will delete the database.
  
Step 4 - Use Curl or Postman to test the REST apis created.
  By default it runs on port 8080.

APIs for PostgreSql usage - 

- Get list of Users - ```http://localhost:8080/users/list```

- Add a User - ```http://localhost:8080/users/add/<name>/<city>```
  
- Delete a User - ```http://localhost:8080/users/delete/<id of user>```
  
- Users Count - ```http://localhost:8080/users/count```
