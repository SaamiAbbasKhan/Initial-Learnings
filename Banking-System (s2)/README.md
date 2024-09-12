# Banking System
This is a simple Java project simulating a bank system with both savings and current accounts. The project demonstrates object-oriented programming 
(OOP) concepts such as interfaces, encapsulation, and constructor overloading.

## Features:
**Savings Account:** Limits the number of withdrawals per day.
**Current Account:** Enforces a minimum balance to operate.
Deposit and withdraw funds from both account types.
View the current balance with validation.

## How to Run:
Clone or download this repository.
Open the project in an IDE (IntelliJ, Eclipse, etc.).
Navigate to the src/ folder.
Compile and run the Main.java file.

## Project Tag: s3 (Simple 3)
This project is categorized as Simple 3 due to the straightforward implementation of banking logic, account validation, and use of OOP principles.
It’s a foundational project showcasing simple business rules.

Demo
```java
var accountS = new mazeBank("current", 5000, 2);
accountS.bankType.deposit(10000);
accountS.bankType.withdraw(1000);
accountS.bankType.withdraw(100);
accountS.bankType.viewBalance();
