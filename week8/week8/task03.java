package week8;

public class task03 {
    public static void main(String[] args) {
        // Create an array
        double[] mylist = new double[5];

        // Initializing arrays with random values:
        for(int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 10;
        }
    }
}

