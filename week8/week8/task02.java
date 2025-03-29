package week8;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        //输入五个数
        double[] arr = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " Values");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
    }
}
