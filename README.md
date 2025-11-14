🛒 AntaShop – E-Commerce Microservices Platform

A modern Spring Boot microservices backend for an online fashion & footwear store.

🚀 1. Project Overview

AntaShop is a full-featured e-commerce backend built using a Microservices Architecture with Spring Boot (JDK 21).
The platform is designed for scalability, modularity, and clean separation of business domains.
It powers an online store selling shoes, clothing, and accessories, and integrates all essential e-commerce features such as:

Product & category management

Shopping cart

Order processing

Payment flow

Authentication & authorization

Notification & email service

File & cloud storage

This backend is optimized for modern frontends such as React/Vite, Next.js, or mobile applications.

🧩 2. Tech Stack
Component	Technology
Language	Java 21 (JDK 21)
Framework	Spring Boot
Build Tool	Maven
Database	MySQL (utf8mb4 / InnoDB)
Message Queue	RabbitMQ
Cache	Redis
Security	JWT, Spring Security
Architecture	RESTful Microservices
Containerization	Docker / Docker Compose
IDE (recommended)	IntelliJ IDEA
🏗️ 3. Microservices Structure

The project is organized into independent services:

/services
 ├── cart-service
 ├── category-service
 ├── cloud-service
 ├── identity-service
 ├── notification-service
 ├── order-service
 ├── payment-service
 ├── product-service


Each service contains its own:

Controllers

Services & business logic

Repository layer

Configuration

Independent pom.xml

Separate database schema (if required)

🔐 4. Authentication & Authorization

The platform implements:

JWT-based authentication

Role-based access control (User, Admin)

Secure password hashing (BCrypt)

Optional OTP email verification (via Notification Service)

📦 5. Core Features
✅ Product & Category Management

CRUD products

Product variants

Category hierarchy

Inventory tracking

🛒 Cart Service

Add/remove items

Auto-sync between devices

Redis caching for fast performance

📦 Order Service

Create orders

Order status workflow

Payment integration hooks

💳 Payment Service

Payment request creation

Payment gateway callbacks

Transaction logs

🔔 Notification Service

Asynchronous email sending (RabbitMQ)

OTP codes

Order confirmation emails

☁️ Cloud Service

File upload (images/videos)

Cloud storage integration (optional)

🗄️ 6. Database

MySQL is used as the primary database.

Each microservice manages its own schema for full decoupling.

Naming convention: service_name_table_name.

📬 7. Message Queue (RabbitMQ)

RabbitMQ is used for:

Asynchronous email notifications

OTP sending

Event-driven communication between services

⚙️ 8. Build & Run
Requirements

JDK 21

Maven 3.9+

MySQL 8+

RabbitMQ

Redis (optional but recommended)

Build
mvn clean install

Run a specific service
cd identity-service
mvn spring-boot:run

Run with Docker Compose (if configured)
docker-compose up --build

📁 9. Project Goals

Build a scalable real-world e-commerce backend

Apply clean microservices architecture

Practice RabbitMQ, Redis, Docker, Spring Security, and more

Support production-ready frontends

🙌 10. Contributions

Contributions, issues, and feature requests are welcome.
Feel free to open a pull request!
