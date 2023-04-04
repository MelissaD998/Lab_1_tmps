package singletonBuilder;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        GroceryManager groceryManager = GroceryManager.getInstance(); // creates a singleton instance of the GroceryManager class.
        ProductBuilder productBuilder = new ProductBuilder();  // creates an instance of the ProductBuilder class.

        System.out.println("--Welcome to the grocery store--");
        System.out.println("Enter 1 to add a product");
        System.out.println("Enter 2 to view all products");
        System.out.println("Enter 3 to remove a product");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------");
            System.out.println("Enter your choice");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Enter the id of the product");
                    int productId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the name of the product");
                    String name = scanner.nextLine();
                    System.out.println("Enter the price of the product");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the production date");
                    LocalDate date = LocalDate.parse(scanner.nextLine());
                    Product product = productBuilder.withProductId(productId).withName(name).withYear(price).withLocalDate(date).build();  // uses the ProductBuilder class to create a new Product object with the user's input.
                    groceryManager.addProduct(product); // adds the new Product object to the GroceryManager.
                    System.out.println("Product added");
                    break;
                case "2":
                    for (Product product1 : groceryManager.getProducts()) {
                        System.out.println("Product id: " + product1.getProductId());
                        System.out.println("Product name: " + product1.getName());
                        System.out.println("Product price: " + product1.getPrice());
                        System.out.println("Production date: " + product1.getDate());
                        System.out.println("-----------");
                    }
                    break;
                case "3":
                    System.out.println("Enter the id of the product you want to remove");
                    int productId1 = Integer.parseInt(scanner.nextLine());
                    for (Product product1 : groceryManager.getProducts()) {
                        if (product1.getProductId() == productId1) {
                            groceryManager.removeProduct(product1);
                            System.out.println("Product removed");
                            break;
                        }
                    }
                    break;
            }
        }
    }
}