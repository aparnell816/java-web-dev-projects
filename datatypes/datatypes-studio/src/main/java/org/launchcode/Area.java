package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radiusEquals = input.nextDouble();
        //double area = 3.14 * radiusEquals * radiusEquals;
        System.out.println("The area is: " + Circle.getArea(radiusEquals));

        input.close();

    }
}
