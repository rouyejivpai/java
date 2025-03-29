package week4;



import java.util.Scanner;

public class Lab2Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double accountValue = 0;

        for (int i = 0; i < months; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        System.out.println("After " + months + " months, the account value is $" + accountValue);
    }
}