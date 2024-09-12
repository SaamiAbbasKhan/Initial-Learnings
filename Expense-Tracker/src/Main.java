public class Main {
    public static void main(String[] args) {
        var expenseTracker = new ExpenseTracker();
        expenseTracker.add(new Expenses("Market", 1000));
        expenseTracker.add(new Expenses("Clothes", 80));
        expenseTracker.add(new Expenses("Food", 80));
        expenseTracker.add(new Expenses("Shopping", 80));
        expenseTracker.add(new Expenses("Dinner", 80));

        expenseTracker.categorize();
        expenseTracker.sort();
        expenseTracker.printData();

    }
}
