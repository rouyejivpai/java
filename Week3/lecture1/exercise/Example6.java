package lecture1.exercise;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the monthly saving amount
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        // Define the monthly interest rate
        double monthlyInterestRate = 0.00417;

        // Initialize the account balance to 0
        double accountBalance = 0;

        // Simulate the first 6 months of savings
        for (int month = 1; month <= 6; month++) {
            // Add the monthly saving to the account balance
            accountBalance += monthlySaving;

            // Calculate the interest earned this month (based on the previous balance)
            // and add it to the account balance
            double interestEarned = accountBalance * monthlyInterestRate;
            accountBalance += interestEarned;

            // Optionally, print the account balance after each month for verification
            // Uncomment the next line if you want to see the balance after each month
            // System.out.printf("After month %d, the account balance is: $%.2f\n", month, accountBalance);
        }

        // Display the account balance after the sixth month
        System.out.printf("After the sixth month, the account balance is: $%.2f\n", accountBalance);

        // Close the scanner
        scanner.close();
    }
}
