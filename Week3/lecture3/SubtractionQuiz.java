package lecture3;
import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is " + number1 + " and " + number2 + "?");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if(number1-number2==answer){
            System.out.println("Your are correct");
        }
        else{
            System.out.println("Your are incorrect");
            System.out.println(number1+" - "+number2+" should be "+(number1-number2));
        }
    }
}
