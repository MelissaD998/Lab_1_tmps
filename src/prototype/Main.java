package prototype;
import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        Bill bill = null;
        String input = "";
        List<Bill> bills = new ArrayList<>();

        while (true) {
            System.out.println("1. Add bill");
            System.out.println("2. Show bills");
            System.out.println("3. Clone bill");
            System.out.println("4. Exit");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.println("Enter customer address: ");
                    String customerAddress = scanner.nextLine();
                    System.out.println("Enter customer phone: ");
                    String customerPhone = scanner.nextLine();
                    System.out.println("Enter products separated by commas: ");
                    String products = scanner.nextLine();
                    List<String> productsList = Arrays.asList(products.split(","));
                    System.out.println("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Customer customer = new Customer(customerName, customerAddress, customerPhone);
                    bill = new Bill(id, customer, productsList, price);
                    bills.add(bill);
                    break;
                case "2":
                    if (bills.isEmpty()) {
                        System.out.println("No bills");
                        break;
                    }

                    System.out.println("There are " + bills.size() + " bills");
                    for (Bill b : bills) {
                        System.out.println("Bill id: " + b.getId());
                        System.out.println("Customer name: " + b.getCustomer().getName());
                        System.out.println("Customer address: " + b.getCustomer().getAddress());
                        System.out.println("Customer phone: " + b.getCustomer().getPhone());
                        System.out.println("Products: " + b.getProducts());
                        System.out.println("Price: " + b.getTotal());
                    }
                    break;
                case "3":
                    if (bills.isEmpty()) {
                        System.out.println("No bills available to clone");
                    } else {
                        System.out.println("Enter the ID of the bill you want to clone: ");
                        int billIdToClone = Integer.parseInt(scanner.nextLine());
                        Bill billToClone;
                        for (Bill b : bills) {
                            if (b.getId() == billIdToClone) {
                                billToClone = b.clone();
                                billToClone.setId(bills.size() + 1);
                                bills.add(billToClone);
                                break;
                            }
                        }
                    }
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}