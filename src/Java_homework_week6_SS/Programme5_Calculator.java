package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme5_Calculator {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods
     */

    //Instance Variable
    double instanceVar1;
    double instanceVar2;

    //Static variable
    static double staticVar1 = 20;
    static double staticVar2 = 50;

    //constructor
    public Programme5_Calculator(double instanceVar1, double instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    //addition method
    public static String add(double num1, double num2) {
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    // Subtraction method
    public static String subtract(double num1, double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    //Multiplication method
    public String multiply() {
        double result = instanceVar1 * instanceVar2;
        return instanceVar1 + " * " + instanceVar2 + " = " + result;
    }

    //Division method
    public String divide() {
        if (instanceVar2 == 0) {
            return "Cannot divide by zero!";
        }
        double result = instanceVar1 / instanceVar2;
        return instanceVar1 + " / " + instanceVar2 + " = " + result;
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //Test static addition
        System.out.println("Static Addition: " + add(num1, num2));

        //Test static subtraction
        System.out.println("Static Subtraction: " + subtract(num1, num2));

        //Test Instance multiplication
        System.out.println("Enter the first number for instance multiplication: ");
        double instNum1 = scanner.nextDouble();
        System.out.println("Enter the second number for instance multiplication: ");
        double instNum2 = scanner.nextDouble();

        Programme5_Calculator calculator = new Programme5_Calculator(instNum1, instNum2);
        System.out.println("Instance multiplication: " + calculator.multiply());

        //test instance division
        System.out.println("Enter the first number for instance division: ");
        double instDivNum1 = scanner.nextDouble();
        System.out.println("Enter the second number for instance division: ");
        double instDivNum2 = scanner.nextDouble();

        Programme5_Calculator calculator1 = new Programme5_Calculator(instDivNum1, instDivNum2);
        System.out.println("Instance Division: " + calculator1.divide());

        //close the scanner
        scanner.close();
    }
}