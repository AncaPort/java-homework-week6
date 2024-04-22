package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme7_FerenhitToCelsius {
    //Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double feh = scanner.nextDouble();
        double cel = (feh - 32) * 5 / 9;//converting Fahrenheit to celsius
        System.out.println("The temperature in Celsius is: " + cel + "`C");
        scanner.close();
    }
}


