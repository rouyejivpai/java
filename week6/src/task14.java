package src;

public class task14 {
    public static void main(String[] args) {
        //无需输入
        double tuition = 10000;
        double rate = 0.07;
        int years = 0;

        while (tuition < 20000) {
            tuition = tuition * (1 + rate);
            years++;
        }

        System.out.println("The tuition will be doubled in " + years + " years.");
        System.out.println("The tuition will be " + String.format("%.2f", tuition) + " tuition points.");
    }
}