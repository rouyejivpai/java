package week4;

public class Lab2Task1 {
    public static void main(String[] args) {
        // 第1步：声明一个名为miles的双变量，初始值为100。
        double miles = 100.0;

        // 第2步：用值声明一个名为KILOMETERS_PER_MILE的双常量1.609。
        final double KILOMETERS_PER_MILE = 1.609;

        // 第3步：声明一个名为kilometers的双变量，乘以英里和KILOMETERS_PER_MILE，并将结果分配给kilometers。
        double kilometers = miles * KILOMETERS_PER_MILE;

        // 第4步：向控制台显示公里数。
        System.out.println("公里数: " + kilometers);
    }
}
