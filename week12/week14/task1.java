package week14;
import java.util.Scanner;
import java.util.Date;

public class task1 {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // 默认构造函数
    public task1() {
        this(2.5, 1, 1000);
    }

    // 带参数的构造函数
    public task1(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    // 获取年利率的方法
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // 设置新的年利率的方法
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    // Return number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Set a new number of years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Return loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Set a new loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        double f = (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        double monthlyPayment = loanAmount * monthlyInterestRate / f;
        return monthlyPayment;
    }
    // Find Total amount
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    // Return loan date
    public Date getLoanDate() {
        return loanDate;
    }
}

class TestLoanClass {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        // Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // Enter loan payment
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        input.close();

        // Create a loan object
        task1 loan = new task1(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n", loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", loan.getTotalPayment());
    }
}