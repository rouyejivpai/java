import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        System.out.print("Enter a decimal value (0 to 15): ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a <= 15 && a >= 0) {
            System.out.println("The hex value is " + Integer.toHexString(a).toUpperCase());
        } else {
            System.out.println(a + "is an invalid input");
        }
    }
}
