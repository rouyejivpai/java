package week4;

public class Lab2Task2 {
    public static void main(String[] args) {
        // Assume the number of seconds is 5000
        int seconds = 5000;

        // Calculate the number of minutes
        int minutes = seconds / 60;

        // Calculate the remaining seconds
        int remainingSeconds = seconds % 60;

        // Display the result
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes and " + remainingSeconds + " seconds.");
    }
}
