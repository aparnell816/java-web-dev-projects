package org.launchcode;
import java.util.Scanner;

public class GasUse {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many miles have you driven? ");
    Double miles = input.nextDouble();
    System.out.println("How much gas have you consumed (in gallons)? ");
    Double gasUsed = input.nextDouble();
    input.close();
    Double mpg = miles/gasUsed;
    System.out.println("You got " + mpg + " miles per gallon");
    }
}
