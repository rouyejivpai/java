package lecture1;

import java.util.Scanner;
public class FahrenheiToCelius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in fahrenhei: ");
        double fahrenhei = input.nextDouble();
        double celius = 5.0/9 *(fahrenhei -32);
        System.out.println("Fahrenheit "+fahrenhei +" is " + celius+" in Celcius.");
    }
}
