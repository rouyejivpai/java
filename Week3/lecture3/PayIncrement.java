package lecture3;

import java.util.Scanner;

public class PayIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pay: ");
        double pay = sc.nextDouble();
        System.out.println("Your pay without increment is : "+pay);
        System.out.println("Enter your score: ");
        double score = sc.nextDouble();
        if (score > 90) {
            double new_pay = pay + (pay*0.03);
            System.out.println("Your pay with increment is : "+new_pay);
        }
    }
}
