package lecture3;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class GradesWithNestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your socre : ");
        double socre = input.nextDouble();
        if (socre>=90){
            System.out.println("You are A");
        }
        else if (socre>=80){
            System.out.println("You are B");
        }
        else if (socre>=70){
            System.out.println("You are C");
        }
        else if (socre>=60){
            System.out.println("You are D");
        }
        else {
            System.out.println("You are E");
        }
    }
}
