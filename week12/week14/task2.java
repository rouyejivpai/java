package week14;

public class task2 {
    private String name;
    private int age;
    private double weight; // in kg
    private double height; // in cm
    final double METERS_PER_CM = 0.01;

    // Constructor with specified name, age, weight, and height.
    public task2(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with the specified name, weight, height, and a default age 20.
    public task2(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight / Math.pow(height * METERS_PER_CM, 2);
        return Math.round(bmi * 100) / 100.0;
    }
    // Get Status of BMI
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        if (bmi < 25)
            return "Normal";
        if (bmi < 30)
            return "Overweight";
        else
            return "obese";
    }

    // Get Name
    public String getName() {
        return name;
    }

    // Get Age
    public int getAge() {
        return age;
    }

    // Get Weight
    public double getWeight() {
        return weight;
    }

    // Get Height
    public double getHeight() {
        return height;
    }
}
class TestBMI {
    public static void main(String[] args) {
        // 创建BMI对象bmi1
        task2 bmi1 = new task2("Irfan", 30, 75, 185);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        // 创建BMI对象bmi2
        task2 bmi2 = new task2("Uman", 75, 175);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
