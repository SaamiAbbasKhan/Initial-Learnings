public class Main {
    public static void main(String[] args) {
        // Example code 
        var expenseTracker = new ExpenseTracker();
        expenseTracker.add(new Expenses("Market", 1000));
        expenseTracker.add(new Expenses("Clothes", 780));
        expenseTracker.add(new Expenses("Food", 980));
        expenseTracker.add(new Expenses("Shopping", 700));
        expenseTracker.add(new Expenses("Dinner", 120));

        expenseTracker.categorize();
        expenseTracker.sort();
        expenseTracker.printData();

    }
}
