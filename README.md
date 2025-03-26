# Spring Boot Blog Application

A simple REST API for managing blog posts built with Spring Boot and PostgreSQL.

## Quick Start

1. Make sure you have Java 21 and PostgreSQL installed
2. Configure your database connection in `application.properties`
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Available Endpoints

### 1. Check Application Status
```bash
curl http://localhost:8080/
```
Returns current timestamp

### 2. Get All Blogs
```bash
curl http://localhost:8080/blogs
```
Returns a list of all blog posts

### 3. Get Blog by ID
```bash
curl http://localhost:8080/{id}
```
Example: `curl http://localhost:8080/1`
Returns a specific blog post

### 4. Delete Blog
```bash
curl -X DELETE http://localhost:8080/{id}
```
Example: `curl -X DELETE http://localhost:8080/1`
Deletes a specific blog post

## Blog Model
Each blog post contains:
- id (auto-generated)
- author
- title
- createdAt (timestamp)

## Tech Stack
- Spring Boot 3.4.4
- PostgreSQL
- JPA
- Lombok 
