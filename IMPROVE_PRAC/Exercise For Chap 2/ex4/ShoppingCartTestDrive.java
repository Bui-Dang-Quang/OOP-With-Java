public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addToCart("Milk");
        cart1.addToCart("Avocado");
        cart1.addToCart("Tomato");
        cart1.removeFromCart("Tomato");
        cart1.checkOut();
    }
}
