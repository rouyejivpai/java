package week7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入两个整数
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // 计算GCD
        int gcd = findGCD(num1, num2);

        // 显示GCD
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    // 计算两个整数的GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
