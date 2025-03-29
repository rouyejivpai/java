package lecture1;

public class MilesTokilometer {
    public static void main(String[] args) {
        double miles =100;
        final double KILOMETERS_PRE_MILES= 1.609;
        double kilometers = miles*KILOMETERS_PRE_MILES;
        System.out.println("There are "+kilometers+" kilometers in "+miles+" miles.");
    }
}
