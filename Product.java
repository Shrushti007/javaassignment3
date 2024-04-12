package assignment3;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayCartContents() {
        if (products.isEmpty()) {
            System.out.println("The shopping cart is empty.");
        } else {
            System.out.println("Products in the shopping cart:");
            for (Product product : products) {
                System.out.println(product.getName() + ":  " + product.getPrice());
            }
        }
    }
}

