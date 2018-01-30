/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * This class interacts with user to display
 * employee's of  information of the Beam Me Up! Transportation Company 
 */
package program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program2
{

    public static void main(String[] args)
    {
        //scanner for keyboard
        Scanner kb = new Scanner(System.in);

        //try block to catch file not found expception
        try
        {
            File file = new File("employeeData.txt");
            Scanner inputFile = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            System.out.println("File \"employeeData.txt\" not found! Place file in project directory and restart application.");
            //program can't function without the file so exit
            System.exit(0);
        }

        //title header of ui
        System.out.printf("\n\tEmployee Lookup Program");
        //print options for first level of program
        System.out.println("\nA) Find all employees with a given title");
        System.out.println("\nB) Find a single empployee");
        System.out.println("\nX) Exit the Program");
        String topInput = kb.next();
        topInput.toUpperCase();
        //while the user doesn't want to exit
        while (!topInput.equals("X"))
        {
            //switch statement to decide what to do.
            switch (topInput)
            {
                case "A":
                    optionA(/* TODO make array from file and put it here */);
                    break;
                case "B":
                    optionB(/* TODO make array from file and put it here */);
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }

            //title header of ui
            System.out.printf("\n\tEmployee Lookup Program");
            //print options for first level of program
            System.out.println("\nA) Find all employees with a given title");
            System.out.println("\nB) Find a single empployee");
            System.out.println("\nX) Exit the Program");
            //get input from user
            topInput = kb.next();
            //put it to uppercase to simplify things
            topInput.toUpperCase();
        }
    }

    //separating some routines into smaller functions to make main easier to debug
    private static void optionA(ArrayList<Employee> employeeList)
    {
        // TODO write everything for option A
    }

    private static void optionB(ArrayList<Employee> employeeList)
    {
        // TODO write everything for option A
    }
}
