package com.codeup.java;
import java.util.Scanner;

/*
 * A Java Help System built as part of "Java: A Beginner's Guide"
 */

class LabTwo {
    public static void main(String args[])
            throws java.io.IOException {
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. if/else");
        System.out.println("    3. if/elseif/else");
        System.out.println("    4. switch");
        System.out.println("    5. for");
        System.out.println("    6. while");
        System.out.println("    7. do-while");
        System.out.println("\n");
        System.out.println("Choose one: or q to quit");
        char choice, ignore;

        // for loops that look like a cartoon Cthulu are infinite loops to be broken out of later
        for(;;) {
            do {
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7'  &  choice != 'q');

            if(choice == 'q') break;
            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("The general form of an 'if': \n");
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch(expression) {");
                    System.out.println("    case constant1:");
                    System.out.println("        statement sequence");
                    System.out.println("        break;");
                    System.out.println("    case constant2");
                    System.out.println("        statement sequence");
                    System.out.println("    // etc...");
                    System.out.println("}");
                    break;
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    System.out.println("section under construction");
            }
            System.out.println();
        }
    }
}
