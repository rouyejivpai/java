import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        char CH = sc.next().charAt(0);
        char ch = Character.toLowerCase(CH);

        if ('a' <= ch && ch <= 'z') {
            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
