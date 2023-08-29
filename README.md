# Online Payment Gateway Integration Project

This project implements an online payment gateway that allows initiate payments, and view transaction history. It provides a RESTful API with endpoints for user management, payment initiation, and transaction history retrieval. The project is built using Java Spring and integrates with Swagger for API documentation.

## Project Structure

- `src/main/java/com/ai/codegeneration/`: Main Java source directory.
  - `api/`: Contains the API controllers and related classes.
    - `controller/`: Defines the REST API endpoints.
    - `entity/`: Contains the JPA entity classes.
    - `mapper/`: Contains mapper classes for converting entities and POJOs.
    - `model/`: Defines the request and response POJOs for API endpoints.
    - `repository/`: Contains JPA repositories for database operations.
    - `service/`: Implements the business logic for user and payment operations.
    - `validation/`: Contains validation classes for input data.
  - `config/`: Contains configuration files, including Swagger configuration.
- `src/main/resources/`: Resource directory.
  - `application.yml`: Contains application configuration properties, including database settings.

## API Endpoints

### Payment Initiation

- Endpoint: `/api/payments/initiate`
- Method: POST
- Description: Allows users to initiate a payment by providing the payment amount and credit/debit card details.

### Transaction History

- Endpoint: `/api/transactions/history`
- Method: GET
- Description: Retrieves the transaction history for the authenticated user, including details like transaction amount, timestamp, and status.

## Running the Application

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the application using the IDE's run configuration.

## Dependencies

- Java Spring Boot
- Spring Data JPA
- Lombok
- Swagger (for API documentation)
- H2 Database (for development)

## Database

The application uses an H2 in-memory database for development purposes. The data stored in the database is lost each time the application is restarted. This ensures that the database is always in a clean state for testing and development.

## Documentation

- API documentation is available using Swagger at `http://localhost:8080/swagger-ui.html` when the application is running.