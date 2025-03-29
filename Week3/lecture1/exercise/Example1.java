package lecture1.exercise;

import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of the cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area=radius * radius* PI;
        double volume=area*length;
        System.out.println("The area is "+String.format("%.1f",area));
        System.out.println("The volume is "+String.format("%.1f",volume));
    }
}
