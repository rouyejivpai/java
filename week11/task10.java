package week11;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = sc.nextInt();
            int hour = sc.nextInt();
            double temperature = sc.nextDouble();
            double humidity = sc.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

        // find the average daily temperature and humidity
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;

            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }

            // display result
            System.out.println("Day " + (i + 1) + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + (i + 1) + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }
}

