package src;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        //输入两个正整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
