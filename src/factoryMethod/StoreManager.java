package factoryMethod;

import factoryMethod.concreteCreator.ChocolateCupcakeFactory;
import factoryMethod.concreteCreator.StrawberryCupcakeFactory;

import java.util.Scanner;

public class StoreManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cupcake Store!");
        while (true) {
            System.out.println("What kind of cupcake would you like to order?");
            System.out.println("1. Strawberry");
            System.out.println("2. Chocolate");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    CupcakeChefs strawberryChef = new CupcakeChefs(new StrawberryCupcakeFactory());
                    strawberryChef.giveCommandToChef("Strawberry", "Vanilla", 190, 20);
                    break;
                case 2:
                    CupcakeChefs chocolateChef = new CupcakeChefs(new ChocolateCupcakeFactory());
                    chocolateChef.giveCommandToChef("Chocolate", "Chocolate", 190, 20);
                    break;
                case 0:
                    System.out.println("Thank you for visiting the Cupcake Store!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
