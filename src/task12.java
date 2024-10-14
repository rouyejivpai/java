package src;

public class task12 {
    public static void main(String[] args) {
        //无需输入
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                System.out.printf("%-5d", number); // 打印质数，保持格式美观
                count++;
                if (count % 10 == 0) {
                    System.out.println(); // 每10个数字换行
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
