package week8;

public class task15 {
    public static void main(String[] args) {
        // Invoke the printArray method
        int[] myArray = {1, 3, 5};
        printArray(myArray); // Alternative-1
        System.out.println();
        printArray(new int[] {3, 1, 2, 6, 4, 2}); // Alternative-2
    }

    // Create a printArray method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}