
# Employee Management System - Backend

A simple backend REST API built using **Spring Boot** for managing employee data. This project demonstrates core CRUD operations and is suitable for learning and practicing RESTful API development with Java and Spring Boot.

## 🚀 Features

- Create, Read, Update, and Delete (CRUD) operations on employee data
- RESTful API architecture
- Integrated with MySQL database
- Simple and clean project structure following Spring Boot conventions
- CORS and JSON support for frontend integration

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Maven**

## 📂 Project Structure

```
Ems-back-end
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.sufi.ems
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── service
│   │   └── resources
│   │       └── application.properties
├── pom.xml
```

## 📡 API Endpoints

| Method | Endpoint            | Description              |
|--------|---------------------|--------------------------|
| `GET`  | `/api/employees`    | Get all employees        |
| `GET`  | `/api/employees/{id}` | Get employee by ID     |
| `POST` | `/api/employees`    | Create new employee      |
| `PUT`  | `/api/employees/{id}` | Update employee by ID |
| `DELETE`| `/api/employees/{id}` | Delete employee by ID |

> All data is exchanged in JSON format.

## 🖥️ Setup Instructions

### Prerequisites

- Java 17+
- Maven
- MySQL running locally

### Step-by-step

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sufi111729/Ems-back-end.git
   cd Ems-back-end
   ```

2. **Configure MySQL**
   Update `application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the project**
   ```bash
   mvn spring-boot:run
   ```

4. **Test with Postman or REST Client**
   - Example payload for creating an employee:
   ```json
   {
     "name": "John Doe",
     "email": "john@example.com",
     "designation": "Software Engineer"
   }
   ```

## 📘 License

This project is open source and free to use under the MIT License.

---

## 📄 Author

- [Muhammad Sufiyan](https://github.com/Sufi111729)
