import java.util.Scanner;

public class ActivityThreeDurano 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int totalQuantity = 0;
        double totalPricePHP = 0.00;

        double[] orderPrices = { 100.00, 150.00, 200.00 };
        String[] orderCodes = { "C1", "C2", "C3" };

        double[] addOnPrices = { 35.00, 50.00 };
        String[] addOnCodes = { "R1", "R2" };

        System.out.println("Good day! Welcome to Durano's Fastfood!");
        System.out.println("Here, you can find what your stomach is looking for!");
        System.out.println("\nMenu:");
        for (int i = 0; i < orderPrices.length; i++) {
            System.out.println((i + 1) + ". " + orderCodes[i] + " = Php " + orderPrices[i]);
        }

        System.out.println("\nAdd ons:");
        for (int i = 0; i < addOnPrices.length; i++) {
            System.out.println((i + 4) + ". " + addOnCodes[i] + " = Php " + addOnPrices[i]);
        }

        System.out.println("6. Cancel Order");

        while (true) {
            System.out.print("\nEnter the number of your order (0 if done): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= orderPrices.length) {
                System.out.print("Enter the quantity: ");
                int qty = scanner.nextInt();
                totalQuantity += qty;
                totalPricePHP += orderPrices[choice - 1] * qty;
            } else if (choice >= 4 && choice <= (orderPrices.length + addOnPrices.length)) {
                System.out.print("Enter the quantity: ");
                int qty = scanner.nextInt();
                totalQuantity += qty;
                totalPricePHP += addOnPrices[choice - 4] * qty;
            } else if (choice == 6) {
                System.out.println("You canceled your order.");
                break;
            } else {
                System.out.println("Choice not found. Please select a valid choice.");
            }
        }

        double dollarRate = 56.00;
        double totalPriceUSD = totalPricePHP / dollarRate;

        System.out.println("\nOrder(s) Calculation:");
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.printf("Total Price (PHP): Php %.2f%n", totalPricePHP);
        System.out.printf("Total Amount (USD): $ %.2f%n", totalPriceUSD);
        System.out.println("\nThank you for choosing Durano's Fastfood! Come back all you want!");
    }
}
