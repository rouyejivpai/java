package week8;

 public class task16 {
     //无需输入
     public static void main(String[] args) {
         int x = 1;//x represent an int value
         int[] y = new int[10];//y represent an array of int values
         System.out.println("Value of x before:  " + x);
         System.out.println("Value of y[0]before:" + y[0]);
         //Invoke the test method
         test(x, y);
         System.out.println("Value of x after:" + x);
         System.out.println("Value of y[0]after:" + y[0]);
     }

     //Create a test method
     public static void test(int number, int[] numbers) {
         number = 2;//Assign a new value to a number
         numbers[0] = 5;//Assign a new value to array[0]
     }
 }