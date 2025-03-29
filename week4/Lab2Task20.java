package week4;



import java.util.Scanner;

public class Lab2Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        int index = year % 12;
        System.out.println("The Chinese Zodiac sign for year " + year + " is " + zodiac[index] + ".");
    }
}
