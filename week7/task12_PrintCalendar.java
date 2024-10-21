package week7;

import java.util.Calendar;
import java.util.Scanner;

public class task12_PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
    }

    private static void printCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        System.out.println("\n    " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        int daysInMonth = getDaysInMonth(month, year);
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if ((firstDayOfWeek + day) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    private static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
