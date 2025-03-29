package week4;



import java.util.Scanner;

public class Lab2Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int lotteryPick = input.nextInt();
        String formattedPick = String.format("%02d", lotteryPick);
        System.out.println("Your formatted lottery pick is: " + formattedPick);
    }
}
