import java.util.Scanner;

public class ShoppingCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prodName;
        float prodPrice;
        int qty;
        float amtPaid;
        float subtotal;
        float change;

        System.out.print("Enter product name: ");
        prodName = scanner.nextLine();
        System.out.print("Enter Price: ");
        prodPrice = scanner.nextFloat();
        System.out.print("Enter quantity: ");
        qty = scanner.nextInt();
        System.out.print("Enter amount paid: ");
        amtPaid = scanner.nextFloat();

        subtotal = prodPrice * qty;
        change = amtPaid - subtotal;

        System.out.println("===== SALES TRANSACTION =====");
        System.out.println("Product: " + prodName);
        System.out.printf("Price: %.2f%n", prodPrice);
        System.out.println("Quantity: " + qty);
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Amount Paid: %.2f%n", amtPaid);
        System.out.printf("Change: %.2f%n", change);
    }
}