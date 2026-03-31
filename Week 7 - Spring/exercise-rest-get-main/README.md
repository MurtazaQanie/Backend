# Exercises REST: HTTP GET

## Exercise 1

* Convert this project to a Spring Boot application: add the `spring-boot-starter-parent` and the
  `spring-boot-starter-web` dependency in the pom.xml.
* Remember that the Application class with the main method is the entry point of our application. Ensure that Spring
  Boot is started here.
* Start-up the project by running the Application class. Try to answer the following questions:
    1. Check the logs: on which port has the application started?
    2. Which 'embedded' server was started?
    3. Did the application terminate after executing the main method? Why or why not?
    4. What happens if you attempt to start the application a second time while the first instance is still running?
    5. Why do we need to call SpringApplication.run(Application.class, args)?

## Exercise 2

Implement the endpoint: Get user by email. The API table below provides an overview of the requirements.

| Field                    | Details                                                        |
|:-------------------------|:---------------------------------------------------------------|
| **Request**              | GET                                                            |
| **URL**                  | `http://localhost:8080/users/search?email={email}`             |
| **Request Parameter**    | email of the user to be searched                               |
| **Output: happy case**   | A JSON user                                                    |
| **Output: unhappy case** | null when no user is found                                     |
| **Acceptance Criteria**  | Returns the (first) user with the given email (case sensitive) |

Follow the steps below:

1. In `UserRepositoy` implement a new method `getUserWithEmail(String email)` that returns a single User.
2. In `UserService` implement a new method `getUserWithEmail(String email)` that calls the UserRepository.
3. Implement a new endpoint in `UserRestController` to handle GET requests on the path `/search`. Note that the ? in
   `/search?email={email}` denotes the use of a request parameter.
4. Restart your Spring Boot application.
5. In Postman create a new request for the URL `http://localhost:8080/users/search?email=c@c.be`. The answer should be a
   JSON representation of user "Charles";
6. Test the endpoint for a non-existing e-mail address. The result should be `null`.
7. Write unit tests for the "happy" and "unhappy" paths of UserRepository.getUserWithEmail. The happy path should test
   that the correct user is returned for an existing e-mail. The unhappy path should test that null is returned for a
   non-existing e-mail.

## Exercise 3

Implement the endpoint: Get users with name containing.

| Field                    | Details                                                                                        |
|:-------------------------|:-----------------------------------------------------------------------------------------------|
| **Request**              | GET                                                                                            |
| **URL**                  | `http://localhost:8080/users/search/containing/{name}`                                         |
| **Request Parameter**    | sequence of letters to be searched                                                             |
| **Output: happy case**   | A JSON list of users                                                                           |
| **Output: unhappy case** | empty list when no user is found                                                               |
| **Acceptance Criteria**  | Returns a list of users whose name contains the given sequence of letters (not case sensitive) |

## Exercise 4

Analyze the traffic between Postman and your server for the request “Get users with a name containing”.
By executing a search request, inspect the URL parameters, HTTP headers, and the JSON response body to understand
exactly what data is being exchanged over the wire. Try to answer the following questions:

1. Who is the **client**, who is the **server**?
2. Look at the URL bar in Postman. How is the 'name' parameter attached to the base URL?
3. In the 'Headers' tab of your request, look for the 'Accept' header. What is its value, and what does it tell the
   server?
4. Execute the request for a name that exists. Look at the response body: does it start with a curly brace (`{`) or a
   square
   bracket (`[`)? Why?
5. Execute the request for a name that exists. What is the HTTP status code and what does it mean?

