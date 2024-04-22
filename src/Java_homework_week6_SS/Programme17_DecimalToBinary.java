package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme17_DecimalToBinary {
    //Write a Java program to convert a decimal number to binary number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal1 = scanner.nextInt();

        String binary1 = Integer.toBinaryString(decimal1);

        System.out.println("The binary result of " + decimal1 + " is:" + binary1);

        scanner.close();
    }


}
