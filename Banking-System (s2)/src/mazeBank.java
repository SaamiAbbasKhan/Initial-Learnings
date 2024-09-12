public class mazeBank { // bank name like chase bank

    BankInterface bankType; // will be either savings / current

    public mazeBank(String type, double amount, int withdrawalsPerDay) {
        bankType = new SavingsAccount(amount, withdrawalsPerDay);
    }

    // type argument is just for the user easiness.

    public mazeBank(String type, double amount) {
        bankType = new CurrentAccount(amount);
    }
}
