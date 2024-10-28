package week8;

public class task07 {
    public static void main(String[] args) {
        // Create an array
        float[] mylist = new float[5];

        // Initialize array with random values
        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float) Math.random() * 10;
        }

        // Display an array
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }

        // 查找数组中的最大元素
        float max = mylist[0];
        int indexOfMax = 0;
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
                indexOfMax = i;
            }
        }
        System.out.println();
        System.out.println("Largest element in the array is: " + max);
        System.out.println("The index of the largest element: " + indexOfMax);
    }
}
