package lecture3.exercise;
import java.util.Random;
import java.util.Scanner;

public class Exampl1 {
    public static void main(String[] args) {
        // 创建一个Random对象用于生成随机数
        Random random = new Random();

        // 生成一个10到99之间的随机数作为彩票号码（包含10和99）
        int lotteryNumber = random.nextInt(90) + 10;

        // 创建一个Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入一个两位数的号码
        System.out.print("Enter your lottery pick (two digits): ");
        int userInput = scanner.nextInt();

        // 变量用于记录是否中奖以及奖金
        String awardMessage = "Sorry: no match";
        double award = 0;

        // 判断是否中奖
        if (userInput == lotteryNumber) {
            // 号码完全匹配（顺序也相同）
            awardMessage = "Exact match: you win $ 10,000";
            award = 10000;
        } else if (String.valueOf(userInput).chars().allMatch(c -> String.valueOf(lotteryNumber).chars().anyMatch(c2 -> c == c2))) {
            // 所有数字都匹配（不考虑顺序）
            awardMessage = "Math all digits: you win $ 3,000";
            award = 3000;
        } else if (String.valueOf(userInput).chars().anyMatch(c -> String.valueOf(lotteryNumber).chars().anyMatch(c2 -> c == c2))) {
            // 至少有一个数字匹配
            awardMessage = "Match one digit: you win $ 1,000";
            award = 1000;
        }

        // 显示结果
        System.out.println("彩票号码是: " + lotteryNumber);
        System.out.println(awardMessage);

        // 关闭Scanner对象
        scanner.close();
    }
}