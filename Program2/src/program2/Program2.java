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
        ArrayList<Employee> employees = new ArrayList<>();
        //try block to catch file not found expception
        try
        {
            File file = new File("employeeData.txt");
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext())
            {
                String nextLine = inputFile.nextLine();
                Scanner separation = new Scanner(nextLine);
                separation.useDelimiter(";");
                String title = separation.next();
                switch (title)
                {
                    case "Hourly":
                    {
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal hourlyPayRate = new BigDecimal(separation.nextDouble());
                        int hoursWorked = separation.nextInt();
                        employees.add(new Hourly(name, address, idNum, bossID, hourlyPayRate, hoursWorked));
                        break;
                    }
                    case "Salaried":
                    {
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal annualSalary = new BigDecimal(separation.next());
                        employees.add(new Salaried(name, address, idNum, bossID, annualSalary));
                        break;
                    }
                    case "Supervisor":
                    {
                        String name = separation.next();
                        String address = separation.next();
                        String idNum = separation.next();
                        String bossID = separation.next();
                        BigDecimal annualSalary = new BigDecimal(separation.next());
                        BigDecimal bonus = new BigDecimal(separation.next());
                        employees.add(new Supervisor(name, address, idNum, bossID, annualSalary, bonus));
                        break;
                    }
                }
            }
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
                    optionA(employees); //string for reading in from outside file);
                    break;
                case "B":
                    optionB(employees); //string for reading in from outside file);
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
        System.out.println("1) Hourly Employee");
        System.out.println("2) Salaried Employee");
        System.out.println("3) Supervisory Employees");
        System.out.println("    Enter 1, 2, or 3 ");
        System.out.println("Name      ID            Gross       Direct Reports");
        System.out.println("                      Weekly Pay");
    }

    private static void optionB(ArrayList<Employee> employeeList)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nEnter the ID of the employee: ");
        String idNum = kb.next();

        System.out.println("Enter the ID of the employee:");
    }
}
