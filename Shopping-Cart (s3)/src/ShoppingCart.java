import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShoppingCart<T extends Products> implements PaymentInterface {


    protected List<T> shoppingList; // item will be the products (record)

    static class ShoppingComparator<T extends Products> implements Comparator<T> { // generic T in case eof ShoppingComparator is different from hierarchical parent class T
        @Override
        public int compare(T o1, T o2) {
            return (o1.price() - o2.price());
        }
    }


    public ShoppingCart() {
        shoppingList = new ArrayList<>();
    }

    public void addItems(T item) {
        shoppingList.add(item);
    }

    public void sortList() {
        var comp = new ShoppingCart.ShoppingComparator<>();
        shoppingList.sort(comp);
    }

    @Override
    public double paymentAmount() { // Payment amount to be calculated from the arraylist
        double amount = 0.0;

        for (var i : shoppingList) {
            if (i instanceof Products p) { // important if not would've used i.price showing error
                amount += p.price();
            }
        }

        return amount;
    }

    @Override
    public void makePaymentCard() {
        // Trying to keep the method simple as I want to sleep :)
        System.out.printf("Payment of %f successful via card.", paymentAmount());
    }

    @Override
    public void makePaymentOnline() {
        System.out.printf("Payment of %f successful via online mode.", paymentAmount());

    }

    @Override
    public void conformation() {
        System.out.println("Payment received");
    }
}


