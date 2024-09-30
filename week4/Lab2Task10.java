package week4;


import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double accountValue = 0;

        for (int i = 0; i < 6; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        System.out.println("After the sixth month, the account value is $" + accountValue);
    }
}