package src;

public class task09 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) { // 外部循环用于控制行数
            for (int j = 0; j < i; j++) { // 内部循环用于控制每行的星号数量
                System.out.print("* ");
            }
            System.out.println(); // 每行结束后换行
        }
    }
}
