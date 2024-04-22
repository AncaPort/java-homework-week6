package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme16_AddTwoBinary {
    // Write a Java program to add two binary numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First binary number: ");
        String first = scanner.next();
        System.out.println("Enter First binary number: ");
        String second = scanner.next();

        // converting binary to integer number
        int num1 = Integer.parseInt(first, 2);
        int num2 = Integer.parseInt(second, 2);
        int sum = num1 + num2;// add two numbers

        String numberSum = Integer.toBinaryString(sum);//convert sum back to binary

        System.out.println("The sum of two binary numbers is : " + numberSum);

        scanner.close();
    }
}
