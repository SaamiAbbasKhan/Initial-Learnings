public interface BankInterface {
    void deposit(double amount); // just deposits the amount
    void withdraw(double amount); // just withdraws the amount
    void viewBalance(); // prints the total valance

}

class SavingsAccount implements BankInterface{ // general class for savings account like other mazeBank account could add functionality

    public static int withdrawalsPerDay; // will decrease this and when 0 withdrawals are left we'll not support any more withdrawals

    protected double amount; // the initial balance in the account could be zero
    // protected as mazeBank should also be able to accesses this

    public SavingsAccount(double amount, int withdrawalsPerDay) {
        this.amount = amount;
        SavingsAccount.withdrawalsPerDay = withdrawalsPerDay;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Deposited Successfully $ " + amount);
    }

    @Override
    public void withdraw(double amount) {

        if (SavingsAccount.withdrawalsPerDay == 0) {
            System.out.println("Maximum withdrawals limit reached!");
            return;
        }


        if (this.amount >= amount) {
            this.amount -= amount;
            SavingsAccount.withdrawalsPerDay--;
            System.out.println("Withdrawn Successfully $ " + amount);
        }
        else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public void viewBalance() {
        System.out.printf("Total Balance: %f", this.amount);
    }
}

class CurrentAccount implements BankInterface{

    protected double amount;
    private boolean shouldOperate = false; // flag if true then only the functions should operate

    public CurrentAccount(double amount) {
        if (amount >= 10_000) {
            this.amount = amount;
            shouldOperate = true;
        }
        else {
            System.out.println("Minimum balance not reached, Current account requires more.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (shouldOperate) {
            this.amount += amount;
            System.out.println("Deposited Successfully $ " + amount);
        }
        else System.out.println("Minimum balance not reached, Current account requires more.");

    }

    @Override
    public void withdraw(double amount) {
        if (!shouldOperate) {
            System.out.println("Minimum balance not reached, Current account requires more.");
            return;
        }

        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Withdrawn Successfully $ " + amount);
        }
        else {
            System.out.println("Insufficient Funds!");
        }

    }

    @Override
    public void viewBalance() {
        if (shouldOperate) System.out.printf("Total Balance: %f", this.amount);
    }
}

