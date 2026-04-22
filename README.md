# SecureCart
Spring Boot E-Commerce API with JWT authentication, role-based security, cart, order and payment modules.

# 🛒 SecureCart - E-Commerce REST API

SecureCart is a production-ready backend application built using Spring Boot.  
It provides secure REST APIs for managing users, products, carts, orders, and payments with JWT-based authentication.

---

## 🚀 Live Demo

🔗 Swagger UI: https://securecart.onrender.com/swagger-ui/index.html  
🔗 API Docs: https://securecart.onrender.com/v3/api-docs  

---

## 📌 Features

- 🔐 JWT Authentication & Authorization (ADMIN, USER)
- 👤 User Management (CRUD APIs)
- 📦 Product Management with Pagination & Sorting
- 🛒 Cart Management (Add / Remove / View)
- 📑 Order Management & History
- 💳 Payment Module (Dummy Gateway Simulation)
- 📄 Swagger API Documentation
- ⚠️ Global Exception Handling
- 🧾 DTO + MapStruct Mapping
- 🔍 Validation using annotations
- 🧱 Clean Architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT (Authentication)
- Hibernate / JPA
- H2 / MySQL
- MapStruct
- Lombok
- Swagger (OpenAPI)
- Maven

---

## 📂 Project Structure

com.securecart
├── config
├── controller
├── service
├── service.impl
├── repository
├── entity
├── dto
├── mapper
├── security
├── exception
├── enums
└── util


---

## 🔐 Authentication Flow (JWT)

1. User registers using `/auth/register`
2. User logs in via `/auth/login`
3. JWT token is generated
4. Token is sent in header:

5. Filter validates token for secured APIs

---

## 📦 API Modules

### 🔐 Auth APIs
- POST /auth/register
- POST /auth/login

### 👤 User APIs
- GET /users
- GET /users/{id}
- PUT /users/{id}
- DELETE /users/{id}

### 📦 Product APIs
- GET /products?page=0&size=10&sort=name
- POST /products
- PUT /products/{id}
- DELETE /products/{id}

### 🛒 Cart APIs
- POST /cart/add
- DELETE /cart/remove
- GET /cart

### 📑 Order APIs
- POST /orders
- GET /orders/history

### 💳 Payment APIs
- POST /payment/process

---

## 💳 Payment Flow

- Dummy payment service simulates real gateway
- Returns:
- SUCCESS
- FAILED
- PENDING

---

## ⚠️ Exception Handling

- GlobalExceptionHandler handles all exceptions
- Custom exceptions:
- ResourceNotFoundException
- UnauthorizedException
- ValidationException

---

## 🧾 DTO & Mapper

- DTO used to hide entity structure
- MapStruct used for mapping:


---

## 🔍 Validation

- @NotNull
- @Email
- @Size

---

## 🧪 Testing APIs

You can test APIs using:

- Swagger UI (recommended)
- Postman

---

## 🛠️ Run Locally

### Step 1 Clone repo

https://github.com/noorsonu/SecureCart.git

### Step 2 Run project

mvnw spring-boot:run


### Step 3 Open Swagger

http://localhost:8080/swagger-ui/index.html


---

## ☁️ Deployment

- Hosted on Render (Docker)
- Uses H2 database for demo
- Auto build using Maven

---

## 🧠 Learnings

- Implemented secure JWT authentication
- Built scalable REST APIs
- Applied clean architecture
- Integrated Swagger documentation
- Hands-on cloud deployment

---

## 📬 Contact

👨‍💻 Developer: Noor Mohammad  
📧 Email: (your email here)  
🔗 GitHub: https://github.com/noorsonu  

---

## ⭐ Give a Star

If you like this project, please ⭐ the repo!