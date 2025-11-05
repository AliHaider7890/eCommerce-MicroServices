# eCommerce-MicroServices
This project is a microservices-based E-Commerce application built with Spring Boot (Java 21) and Angular. It follows a modular architecture to ensure scalability, maintainability, and fault tolerance. Each service handles a specific business responsibility and communicates asynchronously using Apache Kafka for event-driven messaging.

## 🧩 **Microservices**

- ** Product Service** – Manages product catalog, categories, and product details.  
- ** Inventory Service** – Tracks product stock and availability.  
- ** Order Service** – Handles order creation, validation, and processing.  
- ** Notification Service** – Sends notifications (emails) using **Kafka** and **Mailtrap** for testing.  
- ** Keycloak Integration** – Provides authentication and role-based authorization.  
- ** API Gateway** – Routes requests to respective microservices and applies centralized security and logging.  

---

## ⚙️ **Tech Stack**

###  **Backend**
- Java 21  
- Spring Boot (Microservices architecture)  
- Spring Cloud (Eureka, Config Server, OpenFeign, API Gateway)  
- Kafka (Event-driven communication)  
- Keycloak (Authentication & Authorization)  
- Resilience4j / Circuit Breaker (Fault tolerance)  

###  **Frontend**
- Angular  

###  **Containerization**
- Docker & Docker Compose  
---

##  **Observability**

Implemented full observability stack using:
- **Prometheus** – Metrics collection  
- **Grafana** – Dashboard visualization  
- **Loki** – Log aggregation  
- **Tempo** – Distributed tracing

##  **Testing**
- **wireMock and testContainers
---

##  **Features**

-  Event-driven microservices with Kafka  
-  Centralized API Gateway for routing and security  
-  Secure endpoints with Keycloak  
-  Centralized configuration and service discovery  
-  Resilient architecture with fault tolerance  
-  Containerized deployment using Docker  
