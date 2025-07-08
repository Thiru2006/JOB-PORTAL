# Job Portal System

## 📌 Introduction

This is a simplified Job Portal System built using Java, JDBC, MySQL, and Visual Studio Code (VS Code). The project is designed for students or beginners looking to understand basic full-stack development, including database integration and CRUD operations using simple tools.

---

## 📄 Abstract

The Job Portal System allows users to register and insert their basic information (name, email, password) into a MySQL database. The goal of this project is to demonstrate the creation of a backend Java application that connects to a MySQL database using JDBC for basic data operations.

---

## 🛠️ Tools & Technologies Used

- **Java (JDK 17+)**: Core programming language.
- **MySQL**: Database to store user information.
- **JDBC**: Java API to connect and execute queries with MySQL.
- **Visual Studio Code**: Code editor for development.
- **MySQL Connector/J (v9.3.0)**: JDBC driver to connect Java to MySQL.

---

## 🏗️ Project Structure

```
job-portal/
├── src/
│   ├── App.java                 // Entry point of the program
│   ├── db/DBConnection.java     // Handles DB connection
│   ├── dao/UserDAO.java         // Logic to insert data
│   └── model/User.java          // POJO class for user
├── out/                        // Compiled classes
├── README.md                   // This file
```

---

## ⚙️ Setup Instructions

### Step 1: Install Required Software

- Java JDK (17 or later)
- MySQL Server (Create a database named `job_portal`)
- MySQL Workbench (optional, for GUI)
- Visual Studio Code (with Java Extension Pack)

### Step 2: Download MySQL Connector/J

- Extract the `.jar` file (e.g., `mysql-connector-j-9.3.0.jar`)

### Step 3: Create MySQL Database

```sql
CREATE DATABASE job_portal;
USE job_portal;
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  password VARCHAR(100)
);
```

### Step 4: Compile the Project

```bash
javac -d out src/db/DBConnection.java src/model/User.java src/dao/UserDAO.java src/App.java
```

### Step 5: Run the Project

```bash
java -cp "out;C:\path\to\mysql-connector-j-9.3.0.jar" App
```

Replace `C:\path\to\...` with the full path of your MySQL connector `.jar` file.

---

## ✅ Output

- When run successfully, you should see:

```
User inserted successfully!
```

---

## 📌 Notes

- Ensure the MySQL server is running.
- Make sure your database credentials in `DBConnection.java` are correct.
- Add exception handling and user input validation for production-level implementation.

---

## 🧠 Next Steps / Extensions

- Add login authentication
- Create a web frontend using JSP or Spring Boot
- Allow multiple roles (admin, recruiter, candidate)
- Add job listing, apply functionality, and more

---

**Author**: Thirugnanam V.S

---

