package week8;

public class task17 {
    //两种数据交换方法
    /**Main method */
    public static void main(String[] args) {
        int[] a = {1, 2};
//Swap elements using the swap methodSystem.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
//Swap elements using the swapFirstTwoInArray method
    System.out.println("Before invoking swapFirstTwoInArray");
    System.out.println("array is {"+a[0]+","+a[1]+"}");
    swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + "," + a[1] + "}");
    }

    /**Swap two variables */
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /**Swap the first two elements in the array */
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

    }
}