package week7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine();
        int decimalNumber = convertHexToDecimal(hexNumber.toUpperCase());
        System.out.println("The decimal value of hex number " + hexNumber + " is: " + decimalNumber);
        scanner.close();
    }

    public static int convertHexToDecimal(String hex) {
        int decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int hexValue = hexCharToDecimal(hexChar);
            decimal = decimal * 16 + hexValue;
        }
        return decimal;
    }

    private static int hexCharToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        } else if (hexChar >= 'A' && hexChar <= 'F') {
            return 10 + (hexChar - 'A');
        }
        throw new IllegalArgumentException("Invalid hexadecimal character: " + hexChar);
    }
}
