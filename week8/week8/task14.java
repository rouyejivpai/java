package week8;

public class task14 {
    public static void main(String[] args) {
        // Create arrays
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        // Copy array using arraycopy
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println("Target array after copying: ");

        // Display array
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }
}