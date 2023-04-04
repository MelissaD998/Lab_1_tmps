package abstractFactory;

import abstractFactory.client.Miro;
import abstractFactory.concreteFactory.ChocolateCakeFactory;
import abstractFactory.concreteFactory.VelvetCakeFactory;
import abstractFactory.concreteFactory.VanillaCakeFactory;

import java.util.Scanner;

public class CakeOrders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        System.out.println("Welcome to Miro!");

        while (true) {
            System.out.println("We have the following cakes available:");
            System.out.println("1. Chocolate cake");
            System.out.println("2. Velvet cake");
            System.out.println("3. Vanilla cake");
            System.out.println("0. Exit");
            System.out.println("Please choose your cake: ");
            int cakeType = scanner.nextInt();
            scanner.nextLine();
            switch (cakeType) {
                case 1:
                    Miro miro = new Miro(new ChocolateCakeFactory());
                    miro.cakeIngredients();
                    System.out.println("Do you want to order this cake? (yes/no)");
                    choice = scanner.nextLine();
                    miro.orderCake(choice);
                    break;
                case 2:
                    Miro miro1 = new Miro(new VelvetCakeFactory());
                    miro1.cakeIngredients();
                    System.out.println("Do you want to order this cake? (yes/no)");
                    choice = scanner.nextLine();
                    miro1.orderCake(choice);
                    break;

                case 3:
                    Miro miro2 = new Miro(new VanillaCakeFactory());
                    miro2.cakeIngredients();
                    System.out.println("Do you want to order this cake? (yes/no)");
                    choice = scanner.nextLine();
                    miro2.orderCake(choice);
                    break;
                case 0:
                    System.out.println("Thank you for visiting Miro!");
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid cake type!");
            }
        }
    }
}
