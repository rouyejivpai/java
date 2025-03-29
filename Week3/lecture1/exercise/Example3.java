package lecture1.exercise;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for weight in pounds  
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Convert pounds to kilograms  
        double weightKg = weightPounds * 0.45359237;

        // Prompt the user for height in inches  
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert inches to meters  
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI  
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display BMI  
        System.out.printf("BMI is: %.4f\n", bmi);

        // Close the scanner  
        scanner.close();
    }
}