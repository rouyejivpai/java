package week8;

public class task05 {
    public static void main(String[] args) {
        // 创建一个数组
        double[] myList = new double[5];

        // 用随机值初始化数组
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 10;
        }

        // 将所有元素相加
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
            total += myList[i];
        }
        System.out.println();
        System.out.printf("Sum of all elements is: %.2f", total);
    }
}
