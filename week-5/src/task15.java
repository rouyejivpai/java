import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        // Compare the cities and display them in alphabetical order
        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " + city1 + " and " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " + city2 + " and " + city1);
        }

        input.close(); // Good practice to close the scanner
    }
}
