# Jersey JDBC MySQL CRUD API

A RESTful User Management CRUD API built using **Java, Jersey (JAX-RS), Grizzly HTTP Server, JDBC, Maven, and MySQL**.

This project demonstrates how to build REST APIs from scratch **without Spring Boot**, using Jersey with embedded Grizzly server and direct JDBC database connectivity.

---

## 🚀 Features
- Create new user
- Get all users
- Get user by ID
- Update user
- Delete user
- MySQL database integration
- JSON request/response handling
- RESTful endpoint design
- Tested using Postman

---

## 🛠️ Tech Stack
- Java
- Jersey (JAX-RS)
- Grizzly HTTP Server
- JDBC
- Maven
- MySQL
- Postman
- Git & GitHub

---

## 📂 Project Structure
src/main/java/com/api
- Main.java
- DBConnection.java
- User.java
- UserDAO.java
- UserResource.java
- HelloResource.java

---

## 📌 API Endpoints
### GET
- `/hello`
- `/users`
- `/users/{id}`

### POST
- `/users`

### PUT
- `/users/{id}`

### DELETE
- `/users/{id}`

---

## ▶️ How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Update MySQL username and password in `DBConnection.java`
4. Run `Main.java`
5. Test APIs in Postman

Server starts at:

http://localhost:8080/

---

## 🧠 Learning Outcome
This project helped in understanding:
- REST API fundamentals
- Jersey + Grizzly embedded server
- JAX-RS annotations
- JDBC database connectivity
- PreparedStatement
- CRUD operations
- DAO design pattern
- JSON serialization
- Git & GitHub workflow

---

## 👨‍💻 Author
**Vishesh Sharma**
Aspiring Software Development Engineer | Backend & Full Stack Enthusiast
