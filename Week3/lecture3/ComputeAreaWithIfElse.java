package lecture3;

import java.util.Scanner;

public class ComputeAreaWithIfElse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the a number of the radius: ");
        double radius= input.nextDouble();
        if (radius>=0){
            double area= Math.PI*radius*radius;
            System.out.println("The area for circle of radius "+radius+" is "+area);
            input.close();
        }
        else{
            System.out.println("Negative input ");
        }
    }
}
