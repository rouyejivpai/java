package week8;

public class task01 {
    public static void main(String[] args) {
        int[] values = {0, 1, 2, 3, 4};
        for (int i = 1; i < values.length; i++) {
            values[i] = i + values[i-1];
        }
        values[0] = values[1]+values[4];
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}