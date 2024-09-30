package lecture1.exercise;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the subtotal
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        int gratuityRatePercent = scanner.nextInt();

        // Convert the gratuity rate from a percentage to a decimal
        double gratuityRateDecimal = gratuityRatePercent / 100.0;

        // Calculate the gratuity
        double gratuity = subtotal * gratuityRateDecimal;

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the results
        System.out.println("The gratuity is $"+String.format("%.1f",gratuity)+" and total is $"+String.format("%.1f",total));

        // Close the scanner
        scanner.close();
    }
}
