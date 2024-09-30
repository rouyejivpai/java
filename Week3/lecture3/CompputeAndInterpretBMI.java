package lecture3;
import java.util.Scanner;
public class CompputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = sc.nextDouble();
        final double KILLOGRAMS_PRE_POUND=0.45359237;
        final double KILLOGRAMS_PRE_INCHES=0.0254;;
        double weightInkillograms=weight*KILLOGRAMS_PRE_POUND;
        double heightInMeters=height*KILLOGRAMS_PRE_INCHES;
        double bmi =weightInkillograms/(heightInMeters*heightInMeters);
        System.out.println("BMI is "+bmi);
        if (bmi<18.5){
            System.out.println("Underweight");
        }
        else if (bmi<=25){
            System.out.println("Normal");
        }
        else if (bmi<=30){
            System.out.println("Overweight");
        }
        else if (bmi<=35){
            System.out.println("Obese");
        }
    }
}
