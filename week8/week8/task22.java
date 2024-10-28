package week8;

import java.util.Scanner;

public class task22 {
    //输入十个实数返回最小值
    // Method: Find the smallest element in an array
    public static double min(double[] array) {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Test program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Call min method to find the smallest value
        double minValue = min(numbers);
        System.out.println("The smallest value is: " + minValue);
    }
}
