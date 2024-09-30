package lecture1;

import java.util.Scanner;
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of radius : ");
        double radius = input.nextDouble();
        double area = PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
