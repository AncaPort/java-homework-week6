package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme13_Average {
    //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three Numbers: ");
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;    //calculate the average
        System.out.println("The average of the three number is: " + average);

        scanner.close();
    }
}

