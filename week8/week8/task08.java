package week8;

public class task08 {
    public static void main(String[] args) {
        // Create an array
        int[] mylist = new int[10];

        // Array before shuffling
        System.out.println("Array before shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (int) (Math.random() * mylist.length);
            System.out.print(mylist[i] + " ");
        }

        // Array after shuffling
        System.out.println("\nArray after shuffling: ");
        for (int i = 0; i < mylist.length; i++) {
            int j = (int) (Math.random() * mylist.length);
            // Swap mylist[i] with mylist[j]
            int temp = mylist[i];
            mylist[i] = mylist[j];
            mylist[j] = temp;
            System.out.print(mylist[i] + " ");

        }
    }
}

