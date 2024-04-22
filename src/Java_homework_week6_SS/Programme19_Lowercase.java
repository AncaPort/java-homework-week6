package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme19_Lowercase {
    //Write a Java program to convert a given string into lowercase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s1 = scanner.nextLine();

        String s2 = s1.toLowerCase();//converting the string to lowercase

        System.out.println("The lowercase string is: " + s2);

        scanner.close();
    }
}
