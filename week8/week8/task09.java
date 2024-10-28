package week8;

public class task09 {
    public static void main(String[] args) {
        // Create an array
        int[] mylist = new int[5];

        // Insert elements in the array
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (int) (Math.random() * mylist.length);
        }

        // Array before shifting
        System.out.println("Array before shifting: ");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }

        // Shift the array
        int temp = mylist[0]; // Retain the first element
        for (int i = 1; i < mylist.length; i++) {
            mylist[i - 1] = mylist[i];
        }
        // Move the first element to fill the last position
        mylist[mylist.length - 1] = temp;

        // Array after shifting
        System.out.println("\nArray after shifting: ");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
    }
}
