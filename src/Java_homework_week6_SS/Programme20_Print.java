package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme20_Print {
    // Write a Java Program to print as below.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date (e.g., 2015-03-29 04:38PM): ");
        String date = scanner.nextLine();

        System.out.println("Enter the number of gallons: ");
        double gallon = scanner.nextDouble();

        System.out.println("Enter price per gallon: $");
        double gallonPrice = scanner.nextDouble();

        //calculate the fuel total
        double fuel = gallon * gallonPrice;

        //print the corner store Receipt
        System.out.println("+------------------------------------+");
        System.out.println("|                                    |");
        System.out.println("|      CORNER STORE                  |");
        System.out.println("|                                    |");
        System.out.println("|   Date: " + date + "          |");
        System.out.println("|                                    |");
        System.out.println("|   Gallons: " + gallon + "                    |");
        System.out.println("|   Price/gallon: $" + gallonPrice + "              |");
        System.out.println("|                                    |");
        System.out.println("|   Fuel total: $" + fuel + "             |");
        System.out.println("|                                    |");
        System.out.println("+------------------------------------+");

        scanner.close();
    }
}
