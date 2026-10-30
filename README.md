# 🏦 BankEase – Banking Management System

**Name:** Yarnakula Lekhana  
**Institute:** Codegnan  
**Batch:** JFS-ONR-004  
**Domain:** Java Full Stack Development
**Project Type:** Core Java Console-Based Mini Project 
**Mentor:** Sairam Sahini

# 📝 About the Project

## 📌 Overview

**BankEase – Banking Management System** is a console-based application developed using Core Java to manage basic banking operations.

The application allows users to create bank accounts, display account details, search for accounts, deposit money, withdraw money, check account balances, view transaction history, and delete accounts.

This project demonstrates important Core Java concepts such as Object-Oriented Programming (OOP), Collection Framework, exception handling, user-defined checked exceptions, loops, switch statements, and console input using the `Scanner` class.

---

## 🎯 Objectives

- Develop a menu-driven banking application using Core Java.
- Create and manage bank accounts.
- Store account information using the Collection Framework.
- Perform deposit and withdrawal operations.
- Validate banking operations using exception handling.
- Implement user-defined checked exceptions.
- Maintain transaction history during program execution.
- Understand object-oriented programming concepts through a practical project.

---

## 📊 Project Structure

The project is organized into the following Java classes under the `com.bankease` package:

```text
BankEase
 |
 +-- src
      |
      +-- com.bankease
             |
             +-- BankEaseApplication.java
             |
             +-- BankAccount.java
             |
             +-- BankService.java
             |
             +-- Transaction.java
             |
             +-- InvalidAmountException.java
             |
             +-- InsufficientBalanceException.java
             |
             +-- AccountNotFoundException.java
             |
             +-- DuplicateAccountException.java
```

### Class Description

| Class | Description |
|---|---|
| `BankEaseApplication.java` | Main class that handles the menu and user input. |
| `BankAccount.java` | Stores account number, account holder name, and balance. |
| `BankService.java` | Handles banking operations and collection management. |
| `Transaction.java` | Stores transaction details. |
| `InvalidAmountException.java` | Handles invalid deposit or withdrawal amounts. |
| `InsufficientBalanceException.java` | Handles withdrawals exceeding the available balance. |
| `AccountNotFoundException.java` | Handles requests for accounts that do not exist. |
| `DuplicateAccountException.java` | Handles duplicate account numbers. |

---

## 🛠️ Tools & Technologies Used

- **Java** – Application development.
- **Core Java** – Programming concepts and application logic.
- **Eclipse IDE** – Writing and executing Java code.
- **Scanner Class** – Reading user input from the console.
- **Collection Framework** – Managing account and transaction data.
- **HashMap** – Storing bank accounts using account numbers as keys.
- **ArrayList** – Storing transaction records.
- **Exception Handling** – Handling runtime and banking-related errors.
- **User-Defined Checked Exceptions** – Handling specific banking errors.

---

## 🧪 Methodology

### 1. Account Creation

- Accept account number, account holder name, and opening balance.
- Create a new bank account.
- Check whether the account number already exists.
- Prevent duplicate account creation.

### 2. Account Management

- Display all available bank accounts.
- Search for an account using its account number.
- Check the current account balance.
- Delete an existing account.

### 3. Deposit Money

- Accept an account number and deposit amount.
- Validate the entered amount.
- Update the account balance.
- Record the deposit in transaction history.

### 4. Withdraw Money

- Accept an account number and withdrawal amount.
- Validate the withdrawal amount.
- Check the available account balance.
- Update the balance if sufficient funds are available.
- Record the withdrawal in transaction history.

### 5. Transaction History

- Store deposit and withdrawal records.
- Display transaction details for an account.
- Maintain transaction records using `ArrayList`.

### 6. Exception Handling

The application uses user-defined checked exceptions to handle banking-related errors:

- `InvalidAmountException`
- `InsufficientBalanceException`
- `AccountNotFoundException`
- `DuplicateAccountException`

---

## 📚 Core Java Concepts Implemented

| Concept | Usage |
|---|---|
| Classes and Objects | Represent bank accounts and transactions. |
| Encapsulation | Organize account data and access methods. |
| Constructors | Initialize account and transaction objects. |
| HashMap | Store accounts using account numbers. |
| ArrayList | Maintain transaction records. |
| Scanner | Accept input from users. |
| Switch Statement | Handle menu selections. |
| Loops | Repeat the menu and display records. |
| Try-Catch | Handle exceptions. |
| Custom Exceptions | Handle banking-specific errors. |

---

## 📈 Results & Analysis

The BankEase application demonstrates how Core Java can be used to develop a simple banking management system.

The application successfully demonstrates:

- Creating and managing bank accounts.
- Searching and displaying account details.
- Depositing and withdrawing money.
- Validating account numbers and transaction amounts.
- Handling insufficient balance and other banking errors.
- Maintaining transaction history during program execution.

The project provides practical experience with Java classes, objects, collections, and exception handling.

---

## ✅ Deliverables

- Java source files organized under the `com.bankease` package.
- Account creation and management functionality.
- Deposit and withdrawal operations.
- Transaction history management.
- Collection Framework implementation using `HashMap` and `ArrayList`.
- User-defined checked exception classes.
- Console-based menu-driven application.
- Project presentation.

---

## 🙌 Acknowledgments

This project was developed as a Core Java mini-project to practice object-oriented programming, collection handling, exception handling, and console-based application development.

Special thanks to **Codegnan** and the mentors for their guidance and support throughout the learning process.

---

## 🚀 How to Run

1. Install Java JDK (Java 17 or a compatible version).
2. Install or open Eclipse IDE.
3. Create or import the `BankEase` Java project.
4. Ensure all Java files are placed inside the `com.bankease` package.
5. Open `BankEaseApplication.java`.
6. Run the application as a **Java Application**.
7. Use the console menu to perform banking operations.

---

## 📌 Notes

- This is a console-based Java application.
- Account and transaction data are stored in collections.
- Data is maintained in memory only while the application is running.
- Account and transaction records are not permanently stored in a database.
- The project is intended for learning Core Java concepts and is not a production banking application.

---

## 📤 Output

The application displays a menu in the Eclipse console:

<img width="1917" height="1077" alt="image" src="https://github.com/user-attachments/assets/268ccc23-ae6d-4b28-b79c-4bf40b6301f9" />


---

**#Java #CoreJava #BankEase #BankingManagementSystem #JavaProject #EclipseIDE #OOP #CollectionFramework #ExceptionHandling**

