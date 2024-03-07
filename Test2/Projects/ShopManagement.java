package Test2.Projects;

import java.util.ArrayList;
import java.util.Scanner;

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

public class ShopManagement {

    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Product> cart = new ArrayList<>();
    public static void main(String[] args) {
        initializeProducts();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shop Management System");
            System.out.println("1. Display Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    calculateTotal();
                    break;
                case 5:
                    System.out.println("Exiting the Shop Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void initializeProducts() {
        products.add(new Product("Apple", 10.0));
        products.add(new Product("Orange", 20.0));
        products.add(new Product("Bananna", 30.0));
    }

    private static void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Rs" + product.getPrice());
        }
    }

    private static void addToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name to add to cart: ");
        String productName = scanner.nextLine();

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.add(product);
                System.out.println("Product added to cart: " + product.getName());
                return;
            }
        }

        System.out.println("Product not found in the list.");
    }

    private static void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart:");
            for (Product product : cart) {
                System.out.println(product.getName() + " - Rs" + product.getPrice());
            }
        }
    }

    private static void calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("Total cost of items in the cart: Rs" + total);
    }
}

