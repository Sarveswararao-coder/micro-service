# Department Service and User Service

This project consists of two Spring Boot Microservices: Department Service and User Service. These services interact with each other using RESTful communication via the RestTemplate.

## Services

### Department Service

This service is responsible for managing the information related to departments. It exposes the following endpoints:

- `GET /departments/{id}` - Retrieve a department by its ID.
- `POST /departments` - Add a new department.

### User Service

This service is responsible for managing user information. It communicates with the Department Service to fetch related department data. It exposes the following endpoints:

- `GET /users/{id}` - Retrieve a user by their ID to display user info and department info
- `POST /users` - Add a new user.

## Running the Applications

These applications are packaged as jar files. They can be run via the following commands:

#   step1
import the project and run mvn clean install. once build is success run the project.

- `java -jar target/department-service.jar`
- `java -jar target/user-service.jar`

**Note:** Both applications use the H2 in-memory database. No additional setup is required for the database.

## Communication

The two services communicate with each other using REST API calls through RestTemplate. The User Service makes calls to the Department Service to get department-related information for a user.

## Swagger Documentation

Both services are integrated with Swagger for API documentation. The Swagger UI for each service can be accessed at:

- Department Service: `http://localhost:8081/swagger-ui.html`
- User Service: `http://localhost:8082/swagger-ui.html`


## Development

This project is developed using Spring Boot, Hibernate and H2 in-memory database. We welcome any contributions or suggestions to the project.
