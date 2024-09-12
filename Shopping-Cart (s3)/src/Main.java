public class Main {
    public static void main(String[] args) {

        ShoppingCart<Products> shoppingCart = new ShoppingCart<>();

        shoppingCart.addItems(new Products("Apple", 350));
        shoppingCart.addItems(new Products("Charger", 2350));
        shoppingCart.addItems(new Products("Bed Sheet", 850));
        shoppingCart.addItems(new Products("Bucket", 455));

        shoppingCart.makePaymentOnline();
        System.out.println();
        shoppingCart.conformation();

        shoppingCart.sortList(); // Custom sorting using comparator
        System.out.println(shoppingCart.shoppingList);

    }
}
