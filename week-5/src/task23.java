import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double r = sc.nextDouble();

        double s = 2 * r * Math.sin(PI / 5);
        Double Area = (5 * Math.pow(s, 2) / (4 * Math.tan(PI/5)));
        System.out.printf("The area of the pentagon is %.2f", Area);
    }
}
