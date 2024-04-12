package assignment3;

public class TestProduct {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Headphones", 49.99);
        Product product3 = new Product("Smartphone", 699.99);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayCartContents();

        System.out.println("\nTotal cost: " + cart.calculateTotalCost());

	}

}
