package week4;



import java.util.Scanner;

public class Lab2Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * side * side;
        System.out.println("The area of the hexagon is " + area);
    }

}
