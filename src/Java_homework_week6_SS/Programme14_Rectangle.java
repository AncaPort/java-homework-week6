package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme14_Rectangle {
    //Write a Java program to print the area and perimeter of a rectangle

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:  ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:  ");
        double width = scanner.nextDouble();

        //calculation of the area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the rectangle is: "+ area);
        System.out.println("The perimeter of the rectangle is: "+perimeter);

        scanner.close();
    }

}
