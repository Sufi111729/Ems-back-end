# 🎓 EMS Back-End – School Management System API

This is the backend system for a role-based **Educational Management System (EMS)** built using **Spring Boot**. It manages user registration, authentication, role-based access (Admin, Teacher, Student), and supports account verification, password management, and user information retrieval.

---

## 📌 Features

- ✅ User registration for Admin, Teacher, and Student roles
- 🔐 JWT-based login/logout & token refresh
- 📧 Email verification with OTP (verify/resend)
- 🔄 Password reset and change flows
- 🧾 Role-based access to authenticated routes
- 👨‍🏫 Teacher & Student DTOs for custom data handling
- 🛠️ Spring Boot + Spring Security + JPA architecture

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Security (JWT)**
- **Spring Data JPA (Hibernate)**
- **MySQL**
- **Lombok**
- **Validation API**
- **ModelMapper**

---

## 📁 Folder Structure

src/
├── auth/ # Login, logout, token, email verification
├── config/ # Security configuration
├── controller/ # REST controllers
├── dto/ # Request and response models
├── entity/ # JPA entities (User, Role, etc.)
├── repository/ # JPA Repositories
├── service/ # Business logic and auth services
├── utils/ # JWT utility, OTP handling, etc.
└── EmsBackEndApplication.java


---

## 🧪 API Endpoints

### 🔐 Auth & JWT

| Method | Endpoint              | Description                        |
|--------|-----------------------|------------------------------------|
| POST   | `/login`              | Login and receive JWT              |
| POST   | `/refresh-token`      | Get a new access token             |
| POST   | `/logout`             | Logout and invalidate refresh token |

### 👤 Registration

| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| POST   | `/register/admin`         | Register an admin               |
| POST   | `/register/teacher`       | Register a teacher              |
| POST   | `/register/student`       | Register a student              |

### 🔒 Password & Email Verification

| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| POST   | `/forgot-password`        | Request password reset OTP      |
| POST   | `/reset-password`         | Reset password with OTP         |
| POST   | `/change-password`        | Change password (logged in)     |
| POST   | `/verify-email`           | Verify OTP for email            |
| POST   | `/resend-verification`    | Resend OTP                      |

### 👤 Profile

| Method | Endpoint   | Description             |
|--------|------------|-------------------------|
| GET    | `/me`      | Get logged-in user info |

---

## 📦 Sample DTOs

### Student Registration

```json
{
  "username": "student1",
  "email": "student1@example.com",
  "password": "password",
  "studentId": "ST123",
  "parentName": "John Doe",
  "parentContact": "9876543210",
  "classroomId": "CLS101"
}
