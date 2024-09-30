package lecture1.exercise;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入要驾驶的距离（以英里为单位）
        System.out.print("Enter the driving distance : ");
        double distance = scanner.nextDouble();

        // 提示用户输入汽车的燃油效率（以每加仑英里数表示）
        System.out.print("Enter miles per gallon : ");
        double mpg = scanner.nextDouble();

        // 提示用户输入每加仑燃油的价格
        System.out.print("Enter price per gallon : ");
        double pricePerGallon = scanner.nextDouble();

        // 计算旅行所需的燃油量（以加仑为单位）
        double gallonsNeeded = distance / mpg;

        // 计算旅行的总成本
        double totalCost = gallonsNeeded * pricePerGallon;

        // 显示旅行的总成本
        System.out.printf("The cost of driving is: $%.2f\n", totalCost);

        // 关闭scanner
        scanner.close();
    }
}