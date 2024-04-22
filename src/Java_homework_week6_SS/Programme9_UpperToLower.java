package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme9_UpperToLower {
    //Write a program to convert the upper case to lower case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String in uppercase: ");
        String uppercase = scanner.nextLine();
        String lowercase = uppercase.toLowerCase();//convert string into lowercase
        System.out.println("The String in lowercase is: " + lowercase);

        scanner.close();
    }


}
