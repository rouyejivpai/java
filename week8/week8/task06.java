package week8;

public class task06 {
    public static void main(String[] args) {
        // Create an array
        float[] mylist = new float[5];

        // Initialize array with random values
        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float) Math.random() * 10;
        }

        // Display an array
        for (int i = 0; i < mylist.length; i++) {
            System.out.printf("%.2f ", mylist[i]);

        }

        // 查找最大的元素
        float max = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
            }
        }
        System.out.println();
        System.out.printf("Largest element in the array is: %.2f", max);
    }
}