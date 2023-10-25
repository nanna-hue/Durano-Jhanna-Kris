import java.util.Scanner;

public class OrderSystem 
{
    public static void main(String[] args) 
    {
    
        // Define the menu items and their prices
        double[] menuPrices = { 100.00, 150.00, 200.00 };
        String[] menuCodes = { "C1", "C2", "C3" };

        // Define the add-ons and their prices
        double[] addOnPrices = { 35.00, 50.00 };
        String[] addOnCodes = { "R1", "R2" };

        Scanner scanner = new Scanner(System.in);
        int totalQuantity = 0;
        double totalPrice = 0.00;

        System.out.println("Menu:");
        for (int i = 0; i < menuPrices.length; i++) {
            System.out.println((i + 1) + ". " + menuCodes[i] + " = Php " + menuPrices[i]);
        }

        System.out.println("\nAdd ons:");
        for (int i = 0; i < addOnPrices.length; i++) {
            System.out.println((i + 4) + ". " + addOnCodes[i] + " = Php " + addOnPrices[i]);
        }

        while (true) {
            System.out.print("\nEnter the item number (0 to checkout): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= menuPrices.length) {
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                totalQuantity += quantity;
                totalPrice += menuPrices[choice - 1] * quantity;
            } else if (choice >= 4 && choice <= (menuPrices.length + addOnPrices.length)) {
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                totalQuantity += quantity;
                totalPrice += addOnPrices[choice - 4] * quantity;
            } else {
                System.out.println("Invalid choice. Please select a valid item.");
            }
        }

        // Calculate dollar conversion (assuming 1 USD = 50 PHP)
        double dollarConversionRate = 50.00;
        double totalAmountInDollars = totalPrice / dollarConversionRate;

        // Display the order summary
        System.out.println("\nOrder(s) Calculation:");
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Price (PHP): Php " + totalPrice);
        System.out.println("Total Amount (USD): $" + totalAmountInDollars);

        scanner.close();
    }
}
