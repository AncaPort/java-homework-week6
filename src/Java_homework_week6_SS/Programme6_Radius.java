package Java_homework_week6_SS;

import java.util.Scanner;

public class Programme6_Radius {
    //Write a program to enter any radius value of the circle and find out the area.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;//calculate the area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);//for result display
        scanner.close();
    }

}
