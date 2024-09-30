package week4;



public class Lab2Task22 {
    public static void main(String[] args) {
        int x = 5;
        int a = 3;
        switch (a) {
            case 1:
                x += 1;
                break;
            case 2:
                x += 10;
                break;
            case 3:
                x += 16;
                break;
            case 4:
                x += 34;
                break;
        }
        System.out.println("x = " + x);
    }
}