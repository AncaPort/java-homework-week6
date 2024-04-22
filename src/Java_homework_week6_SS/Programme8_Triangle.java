package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme8_Triangle {
    //Write a program to calculate the area of a triangle.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle: ");

        System.out.println("Enter the length of side a: ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        double sideB = scanner.nextDouble();
        System.out.println("Enter the length of side c: ");
        double sideC = scanner.nextDouble();

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }


}



