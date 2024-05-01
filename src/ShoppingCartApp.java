public class ShoppingCartApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item item1 = new Item("Item 1", 10.0);
        Item item2 = new Item("Item 2", 20.0);

        cart.addItem(item1);
        cart.addItem(item2);

        // Виведення вмісту корзини
        System.out.println("Items in the cart:");
        for (Item item : cart.getItems()) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
}
