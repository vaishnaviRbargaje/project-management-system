📌 Project Management System (Spring Boot + PostgreSQL)

🚀 Overview

This is a Project & Task Management REST API System built using Java, Spring Boot, and PostgreSQL.

It allows managing projects, tasks, and team members using RESTful APIs with proper layered architecture.

🛠️ Tech Stack

Java 21

Spring Boot

Spring Data JPA

PostgreSQL

Maven

REST APIs

📁 Project Structure

com.projectmanagement

│

├── controller

├── service

├── serviceImpl

├── repository

├── entity

├── dto (optional)

└── exception

⚙️ Features

📌 Project Management


Create Project

Get All Projects

Get Project by ID

Update Project

Delete Project

📌 Task Management (Future Scope)

Create Task

Assign Task

Update Task

Delete Task

Get Tasks


📌 Team Member Management (Future Scope)

Add Member

Update Member

Delete Member

Get All Members

🗄️ Database Configuration (PostgreSQL)

Update application.properties:


spring.datasource.url=jdbc:postgresql://localhost:5432/projectdb

spring.datasource.username=postgres

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.format_sql=true

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect


▶️ How to Run the Project

Step 1: Clone Repository

Step 2: Open in Eclipse / IntelliJ

Step 3: Setup Database

Create PostgreSQL database:

CREATE DATABASE projectdb;

Step 4: Run Spring Boot Application

mvn spring-boot:run


📮 API Endpoints

Project APIs

Method	URL	Description

POST	/api/projects	Create project

GET	/api/projects	Get all projects

GET	/api/projects/{id}	Get project by ID

PUT	/api/projects/{id}	Update project

DELETE	/api/projects/{id}	Delete project

📌 Sample JSON (Project)

{

  "projectName": "E-Commerce App",
  
  "description": "Online shopping system",
  
  "startDate": "2026-01-01",
  
  "endDate": "2026-06-01",

  
  "status": "IN_PROGRESS"
}

❗ Exception Handling

Resource Not Found Exception

Global Exception Handler (recommended)

Proper HTTP status codes

👨‍💻 Author


Vaishnavi Bargaje
