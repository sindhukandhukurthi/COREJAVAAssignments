package question5;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
public class PreCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueProgram = true;

            while (continueProgram) {
                System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertNewPrice();
                        break;
                    case 2:
                        viewPurchaseTotal();
                        break;
                    case 3:
                        continueProgram = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please select 1, 2, or 3.");
                }
            }
        }
    }

    private static void insertNewPrice() {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalPrice = 0.0;
            int itemCount = 0;

            boolean continueInserting = true;

            while (continueInserting) {
                System.out.print("Insert price: ");
                double price = scanner.nextDouble();

                try {
                    Files.writeString(Path.of("prices.txt"), String.valueOf(price) + System.lineSeparator(), StandardOpenOption.APPEND);
                    totalPrice += price;
                    itemCount++;

                    System.out.println("Price has been saved to the file.");
                } catch (IOException e) {
                    System.err.println("An error occurred while saving the price.");
                    e.printStackTrace();
                }

                System.out.print("Do you want to enter price for more items? (Yes/No): ");
                String moreItems = scanner.next().toLowerCase();
                if (!moreItems.equals("yes")) {
                    continueInserting = false;
                }
            }

            if (itemCount > 0) {
                try {
                    Files.writeString(Path.of("total.txt"), "Total Price of all items is: " + totalPrice, StandardOpenOption.CREATE);
                } catch (IOException e) {
                    System.err.println("An error occurred while saving the total price.");
                    e.printStackTrace();
                }
            }
        }
    }

    private static void viewPurchaseTotal() {
        try {
            String total = Files.readString(Path.of("total.txt"));
            System.out.println(total);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the total price.");
            e.printStackTrace();
        }
    }
}
