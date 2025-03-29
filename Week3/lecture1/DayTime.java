package lecture1;

import java.util.Scanner;

public class DayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for day: ");
        int day = input.nextInt();
        day+=100%7;
        if (day>=7)
            day=day%7;
        System.out.print("The day in 100 days is "+day);
    }
}
