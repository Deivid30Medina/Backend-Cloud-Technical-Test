# Title

Backend-Cloud-Technical-Test

# Description

This project is part of a technical test for the **Cloud Junior Developer** position. The goal of this test is to build a simple web application for task management, allowing users to create, view, and delete tasks. The backend handles the business logic.

# Table of contents

- [Title](#title)
- [Description](#description)
- [Table of contents](#table-of-contents)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation and Execution Instructions](#installation-and-execution-instructions)
- [Test](#test)
- [Endpoints](#endpoints)
- [Render](#render)
- [Demo Video](#demo-video)

# Technologies Used

- **Java**: Programming language used for backend development.
- **SpringBoot**: Framework for implementing business logic and creating the RESTful API.
- **Docker**: Used for containerization and deployment on the Render platform.

# Prerequisites

Before running the project, ensure the following prerequisites are met:

- **Java 17** installed.
- **Maven** installed.
- **Git Bash** installed (optional for Windows environments).

# Installation and Execution Instructions

1. Clone the repository:
   
   ```bash
   git clone https://github.com/Deivid30Medina/Backend-Cloud-Technical-Test
   ```

2.  Navigate to the project directory and run:
   
    ```bash
    cd Backend-Cloud-Technical-Test
    ```

3.  Run the application:
   
    ```bash
    mvn spring-boot:run
    ```

4.  Open the application
   
    ```bash
    http://localhost:8080/api/v1/tasks
    ```
# Test

To run the tests, ensure you are in the **Backend-Cloud-Technical-Test** project folder.

1.  Run test:
   
    ```bash
    mvn test
    ```

# Endpoints

Here are the available endpoints to interact with the application:

- **POST /tasks:** Create a new task.
  
  ```bash
  http://localhost:8080/api/v1/tasks
  ```

- **GET /tasks:** List all tasks.
  
  ```bash
  http://localhost:8080/api/v1/tasks
  ```

- **DELETE /tasks/{id}:** Delete a task.
  
  ```bash
  http://localhost:8080/api/v1/tasks/{id}
  ```

# Render

The project has been deployed on Render and can be accessed using the following link:

  ```bash
  https://backend-cloud-technical-test.onrender.com/api/v1/tasks
  ```

# Demo Video

In case the deployments are not operational due to limitations in requests or costs associated with the Render platform, a demo video is included to showcase the full functionality of the application.  

  - [Demo Video](https://youtu.be/s_ORDngofDU) 
