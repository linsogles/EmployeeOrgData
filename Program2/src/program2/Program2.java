/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * This class interacts with user to display employee's
 * information of the Beam Me Up! Transportation Company 
 */
package program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Program2
{

    public static void main(String[] args)
    {
        //scanner for keyboard
        Scanner kb = new Scanner(System.in);

        //arraylist of employee objects to hold employee data from source file
        ArrayList<Employee> employees = new ArrayList<>();
        
        //try block opens the source file and fills employees with its contents
        //if the file isnt found it catches that exception and, since this
        //program is useless without the source file it exits the program.
        try
        {
            //intsantiate file
            File file = new File("employeeData.txt");
            //scanner for file
            Scanner inputFile = new Scanner(file);
            //loop to get contents of file into employees ArrayList
            while (inputFile.hasNext())
            {
                //take in next line
                String nextLine = inputFile.nextLine();
                //scanner for next line
                Scanner separation = new Scanner(nextLine);
                //change delimiter to semicolon
                separation.useDelimiter(";");
                //take in title
                String title = separation.next();
                //check which title the next employee has
                switch (title)
                {
                    case "Hourly":
                    {
                        //take in each field one at a time and put them in variables
                        String employeeType = title;
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal hourlyPayRate = new BigDecimal(separation.nextDouble());
                        int hoursWorked = separation.nextInt();
                        //add a new employee to employees with the input data
                        employees.add(new Hourly(employeeType, name, address, idNum, bossID, hourlyPayRate, hoursWorked));
                        break;
                    }
                    case "Salaried":
                    {
                        //take in each field one at a time and put them in variables
                        String employeeType = title;
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal annualSalary = new BigDecimal(separation.next());
                        //add a new employee to employees with the input data
                        employees.add(new Salaried(employeeType, name, address, idNum, bossID, annualSalary));
                        break;
                    }
                    case "Supervisor":
                    {
                        //take in each field one at a time and put them in variables
                        String employeeType = title;
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal annualSalary = new BigDecimal(separation.next());
                        BigDecimal bonus = new BigDecimal(separation.next());
                        //add a new employee to employees with the input data
                        employees.add(new Supervisor(employeeType, name, address, idNum, bossID, annualSalary, bonus));
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e)
        {
            System.out.print("\n\n!!! File \"employeeData.txt\" not found! Place file in project directory and restart application. !!!"
                    + "/nPlease press enter to exit the program: ");
            kb.next();
            //program can't function without the file so exit
            System.exit(0);
        }

        //title header of ui
        System.out.printf("\n\tEmployee Lookup Program");
        //print options for first level of program
        System.out.println("\nA) Find all employees with a given title");
        System.out.println("\nB) Find a single employee");
        System.out.println("\nX) Exit the Program");
        System.out.print("\tEnter your choice: ");

        //take in user input and set it to uppercase to simplify below switch statement
        String topInput = kb.next().toUpperCase();

        //while the user doesn't want to exit
        while (!topInput.equals("X"))
        {
            //switch statement to decide what to do.
            switch (topInput)
            {
                case "A":
                    //call optionA, separated from main to make debugging easier
                    optionA(employees);
                    break;
                case "B":
                    //call optionB, separated from main to make debugging easier
                    optionB(employees);
                    break;
                case "X":
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //invalid input alert
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

            //title header of ui
            System.out.printf("\n\tEmployee Lookup Program\n");
            //print options for first level of program
            System.out.println("\nA) Find all employees with a given title");
            System.out.println("\nB) Find a single empployee");
            System.out.println("\nX) Exit the Program");
            System.out.print("\tEnter your choice: ");

            //take in user input and set it to uppercase
            topInput = kb.next().toUpperCase();
        } //end program loop
    } //end main

    //separating some routines into smaller functions to make main easier to debug
    private static void optionA(ArrayList<Employee> employeeList)
    {
        //scanner for keyboard input
        Scanner kb = new Scanner(System.in);

        //print choices
        System.out.println("\n1) Hourly Employee");
        System.out.println("\n2) Salaried Employee");
        System.out.println("\n3) Supervisory Employees");
        System.out.printf("\tEnter 1, 2, or 3: ");
        int optionSelect = kb.nextInt();

        //presetting the default format so as to write less stuff in the switch statements' blocks
        String outFormat = "%20s\t%6s\t%17s\n";

        switch (optionSelect)
        {
            case 1:
                //add line for column headers
                System.out.printf(outFormat, "Name   ", "ID  ", "Gross Weekly Pay");

                //search for hourly employees
                for (Employee employee : employeeList)
                {
                    if (employee.getEmpType().equals("Hourly"))
                    {
                        System.out.printf(outFormat, employee.getName(), employee.getIdNum(), employee.getGrossWeeklyPay().toString());
                    }
                }
                break;
            case 2:

                break;
            case 3:
                break;
            default:
                System.out.println("Invalid input. Please try again");
                break;
        }

    }

    //this method segragates the routine of finding a single employee by ID
    private static void optionB(ArrayList<Employee> employeeList)
    {
        //scanner for user input
        Scanner kb = new Scanner(System.in);

        //prompt for input
        System.out.print("\nEnter the ID of the employee: ");

        //take in user input.
        //since we don't do math with the ID numbers they can just be strings
        String idNum = kb.next();

        //all employee IDs are 6 digits so we check that the input is valid
        if (idNum.length() != 6)
        {
            //if input is not 6 digits print error message and prompt for valid input
            System.out.print("\nInvalid ID number: ID numbers must be 6 digits.");
            System.out.print("\n\nEnter the ID of the employee: ");
            idNum = kb.next();
        }

        //boolean variable to tell if anything was found
        boolean found = false;
        for (Employee element : employeeList)
        {
            if (element.getIdNum().equals(idNum))
            {
                //print out as Name, ID, and Employee Title.
                System.out.printf("%20s\t%6s\t%10s\n", element.getName(), element.getIdNum(), element.getEmpType());
                found = true;
            }
        }
        //if the id wasn't found
        if (!found)
        {
            System.out.println("Sorry, no employee with ID " + idNum + " was found");
        }
    }
}
