package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme15_SwapNumber {

    //Write a Java program to swap two variables.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:  ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:  ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping number:");
        System.out.println("First number: "+num1);
        System.out.println("second number: "+num2);

        //swap the values of the variables
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping number:");
        System.out.println("First number: "+num1);
        System.out.println("second number: "+num2);

        scanner.close();
    }
}
