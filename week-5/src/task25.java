import java.util.Arrays;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = sc.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = sc.nextLine();

        String[] cities = {s1, s2, s3};

        Arrays.sort(cities);

        System.out.println("The three cities in alphabetical order are：");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
