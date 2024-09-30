package lecture1.exercise;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of a side of the hexagon
        System.out.print("Enter the length of the side: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area of the hexagon
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        // Display the area of the hexagon
        System.out.printf("The area of the hexagon is: %.4f\n", area);

        // Close the scanner
        scanner.close();
    }
}
