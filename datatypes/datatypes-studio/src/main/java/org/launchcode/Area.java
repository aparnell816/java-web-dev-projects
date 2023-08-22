package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        if (radius < 0) {
            System.out.println("Error, must be a positive number");
            return;
        } else if (input.equals(" ")) {
            System.out.println("Error, must enter something");
            return;
            
        }
        System.out.println("The area is: " + area);

        input.close();

    }
}
