package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme18_NumberCalculate {
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number : ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second number : ");
        double num2 = scanner.nextDouble();

        //calculate mathematics operation
        double sum = num1 + num2;
        double multiply = num1 * num2;
        double subtract = num2 - num1;
        double divide = num1 / num2;
        double reminder = num1 % num2;

        //Print the results of calculate operations
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + reminder);

        scanner.close();
    }
}
