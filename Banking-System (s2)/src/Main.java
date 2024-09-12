public class Main {
    public static void main(String[] args) {
        mazeBank accountSaami = new mazeBank("current", 5000, 2);
        accountSaami.bankType.deposit(10000);
        accountSaami.bankType.withdraw(1000);
        accountSaami.bankType.withdraw(100);
        accountSaami.bankType.withdraw(100);

        accountSaami.bankType.viewBalance();

    }
}
