# Shopping Cart System
This is a simple Java project for managing a shopping cart and processing payments. The project demonstrates object-oriented programming (OOP's) concepts
such as records, interfaces, generics, and custom sorting with comparators.

## Features:
Add items to the shopping cart
Sort items by price using a custom comparator
Calculate total payment amount from the cart
Make payments via card or online
Confirm successful payments

## How to Run:
Clone or download this repository.
Open the project in an IDE (IntelliJ, Eclipse, etc.).
Navigate to the src/ folder.
Compile and run the Main.java file.

## Project Tag: s3 (Simple 3)
This project is categorized as Simple 3 due to its straightforward use of Java records, interfaces for payment processing, and generic programming for shopping cart items. 
It represents foundational OOP concepts with modern Java features like records and pattern matching.

Demo
```java
ShoppingCart<Products> shoppingCart = new ShoppingCart<>();

shoppingCart.addItems(new Products("Apple", 350));
shoppingCart.addItems(new Products("Charger", 2350));
shoppingCart.addItems(new Products("Bed Sheet", 850));
shoppingCart.addItems(new Products("Bucket", 455));

shoppingCart.makePaymentOnline();
shoppingCart.conformation();

shoppingCart.sortList(); // Custom sorting using comparator
System.out.println(shoppingCart.shoppingList);
