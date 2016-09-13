package com.codeup.java;
import java.util.Scanner;

/**
 * Created by Moravia on 9/13/16.
 */
public class LabFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        String choice = "y";

        do {
            System.out.println("Enter a number between 1 and 10");
            num = scan.nextInt();

            if (num > 0 && num <= 10) {
                int result = 1;
                for (int i = 1; i <= num; i += 1) {
                    result = (result * i);
                    factorial = result;
                }

                System.out.println("The factorial of " + num + " is " + factorial);

            } else {
                System.out.println("Actually enter an integer between 1 and 10");

            }

            System.out.println("Continue type y or n");
            choice = scan.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("bye bye");


    }
}
