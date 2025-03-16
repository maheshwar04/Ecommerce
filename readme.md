# **E-Commerce Microservices Application**

This is a **Spring Boot-based microservices project** for an **E-Commerce System**.  

It consists of the following microservices:  

- **Product Service** - Manages product-related operations.  

- **Customer Service** - Handles customer details.  

- **Order Service** - Manages orders and fetches product details from Product Service.  

- **Eureka Server** - Service discovery for microservices.

---

## **🛠 Technologies Used**

- **Spring Boot**  

- **Spring Cloud Eureka (Service Discovery)**  

- **Spring Web (RestTemplate for Inter-Service Communication)**  

- **MySQL (Database)**  

- **Maven (Build Tool)**  

- **Swagger (API Documentation)**

---

## **📌 Microservices Overview**

Each microservice runs independently on a different port and communicates with others using **REST APIs**.

| Service          | Port  | Description |

|-----------------|------|------------|

| **Eureka Server** | 8761 | Service Discovery |



| **Product Service** | 8081 | Manages Products |

| **Customer Service** | 8082 | Manages Customers, Fetches Products from Product Service |

| **Order Service** | 8083 | Manages Orders, Fetches Products from Product Service |

---

## **📌 API Endpoints**

### **🔹 Product Service (`http://localhost:8081`)**

| Method | Endpoint         | Description |

|--------|----------------|-------------|

| GET    | `/products`      | Fetch all products |

| GET    | `/products/{id}` | Get product by ID |

| POST   | `/products`      | Add new product |

---

### **🔹 Customer Service (`http://localhost:8082`)**

| Method | Endpoint              | Description |

|--------|---------------------|-------------|

| GET    | `/customers`         | Fetch all customers |

| POST   | `/customers`         | Create a new customer |

| GET    | `/customers/products` | Fetch products from Product Service |

| GET    | `/customers/orders` | Fetch products from Product Service |

---

### **🔹 Order Service (`http://localhost:8083`)**

| Method | Endpoint                | Description |

|--------|-----------------------|-------------|

| GET    | `/orders`              | Fetch all orders |

| POST   | `/orders`              | Create a new order |

| GET    | `/orders/products`     | Fetch products from Product Service |

| GET    | `/orders/products/{id}` | Get product details by ID |

---

## 📖 API Documentation with Swagger

Each microservice includes **Swagger UI** for easy API testing.  

Links below to access Swagger documentation:
```sh
Product Service API:http://localhost:8081/swagger-ui.html

Customer Service API:http://localhost:8082/swagger-ui.html

Order Service API:http://localhost:8083/swagger-ui.html
```


## **🚀 Setup Instructions**

### **1️⃣ Clone the Repository**

```sh

git clone https://github.com/maheshwar04/Ecommerce.git

cd ecommerce

Run the following commands in separate terminals:

# Start Eureka Server

cd eurekaserver

mvn spring-boot:run

# Start Product Service

cd productservice

mvn spring-boot:run

# Start Customer Service

cd customerservice

mvn spring-boot:run

# Start Order Service

cd orderservice

mvn spring-boot:run
