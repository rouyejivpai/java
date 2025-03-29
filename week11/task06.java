package week11;

public class task06 {
    public static void main(String[]args) {
        int[][] matrix = new int[3][3];
//Insert random values in 2D array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
            }
        }
        int maxofRow = 0;

//Get sum of the elements in the first row
        for (int column = 0; column < matrix[0].length; column++) {
            maxofRow += matrix[0][column];
        }
        int indexofMaxRow = 0;
        int total0fThisRoW = 0;
        for (int row = 1; row < matrix.length; row++) {

            total0fThisRoW=0;
            for (int column = 0; column < matrix[0].length; column++) {
                total0fThisRoW += matrix[row][column];
            }
            if (total0fThisRoW > maxofRow) {
                maxofRow = total0fThisRoW;
                indexofMaxRow = row;
            }
        }

        System.out.println("Row " + indexofMaxRow + " has the maximum sum of " + maxofRow);
    }
}