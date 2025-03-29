package week12.task6;

import week12.task4.CircleWithPrivateDataFields;



public class ArrayOfObjects {
    // Main method
    public static void main(String[] args) {
        // Declare a circle array
        CircleWithPrivateDataFields[] circleArray;
        // Create Circle Array
        circleArray = createCircleArray();
        // Print circleArray
        printCircleArray(circleArray);
    }

    // Method to create an array of circle objects
    public static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 10);
        }
        return circleArray;
    }

    // Print an array of circles and their Area.
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
    }

}