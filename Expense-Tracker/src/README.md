# Expense Tracker

This is a simple Java project for tracking and categorizing expenses. The project demonstrates object-oriented programming (OOP) concepts 
such as classes, interfaces, enums, use of records, simple generic concepts like comparators 

## Features:
- Add and delete expenses
- Categorize expenses into different categories using enums
- Sort expenses by amount 
- Calculate the total sum of expenses

## Categories:
- **Market**: Groceries, Shopping, Clothes, etc.
- **Education**: Books, Pen, Pencil, etc.
- **Essentials**: Rent, Electricity, Bills, etc.
- **Requirements**: Medicines, Food, Water, etc.
- **Extras**: Travel, Movies, Gifts, etc.

## How to Run:
1. Clone or download this repository.
2. Open the project in an IDE (IntelliJ, Eclipse, etc.).
3. Navigate to the `src/` folder.
4. Compile and run the `Main.java` file.

## Example Usage:
```java
ExpenseTracker expenseTracker = new ExpenseTracker();
expenseTracker.add(new Expenses("Groceries", 150));
expenseTracker.add(new Expenses("Rent", 1200));
expenseTracker.categorize();
expenseTracker.sort();
expenseTracker.printData();
