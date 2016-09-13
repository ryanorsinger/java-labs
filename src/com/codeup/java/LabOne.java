package com.codeup.java;

import java.util.Scanner;

public class LabOne {

    public static void main(String[] args) throws java.io.IOException {

        System.out.println("Welcome to the Codeup Room Detail Generator!\n");
        Scanner scan = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("Input the room width");
            double width = scan.nextDouble();
            System.out.println("Input the room length");
            double height = scan.nextDouble();
            double area = width * height;
            double perimeter = 2 * width + 2 * height;
            System.out.println("The perimeter is " + perimeter + ".");
            System.out.println("The area of the room is " + area);
            // Prompt to calculate another room
            System.out.println("Do you want to continue to calculate area? Press y to continue, n to exit");
            userChoice = scan.next();
        } while (userChoice.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the Codeup room size calculator!");
    }
}
