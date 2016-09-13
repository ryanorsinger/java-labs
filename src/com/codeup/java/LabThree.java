package com.codeup.java;
import java.util.Scanner;

/**
 * Created by Moravia on 9/13/16.
 */
public class LabThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        int numberSquared = 0;
        int numberCubed = 0;
        String choice = "n";

        do {

            // Prompt the user for an integer
            System.out.println("Please enter an integer to square and cube \n");

            // Get the number from the user.
            number = scan.nextInt();

            // Print out formatting stuff
            System.out.println("Number    Squared     Cubed \n");
            System.out.println("======    =======     ===== \n");

            for(int i = 1; i <= number; i+=1) {
                numberSquared = i * i;
                numberCubed = i * i * i;
                System.out.println(i + "         " + numberSquared + "         "   + numberCubed);

            }

            System.out.println("Continue? Type y or n");

            choice = scan.next();

            System.out.println();

        } while (choice.equalsIgnoreCase("y"));

        scan.close();
        System.out.println("Thanks for playing!");

    }
}
