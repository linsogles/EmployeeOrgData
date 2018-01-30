/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * This class interacts with user to display employee's
 * information of the Beam Me Up! Transportation Company 
 */
package program2;

<<<<<<< HEAD
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program2 {
    
    public static void main(String[] args) {

		  Scanner keyboard = new Scanner(System.in);
		  
		  while (true) {
			  System.out.println ("-----------------------\n");
			  System.out.println ("Employee Lookup Program\n");
			  System.out.println ("(A) Find all employees with a given title\n");
			  System.out.println ("(B) Find a single employee\n");
			  System.out.println ("(X) Exit the program\n");
			  System.out.println ("Enter Mode: ");
			  String input;	// allows user input as string
                          input = keyboard.nextLine(); //grabs
			    
			  if (input.equals("A")) {
			      // ask user for 
				  while (true) { // start of infinite loop
					  System.out.println ("1) Hourly Employee");
                                          System.out.println ("2) Salaried Employee");
                                          System.out.println ("3) Supervisory Employees");
					  System.out.println ("    Enter 1, 2, or 3 ");
                                          
                                          //input choice 
                                          System.out.println("Name      ID            Gross       Direct Reports");
                                          System.out.println("                      Weekly Pay"         );
                                          System.exit(0);
				  }  
	 	
			  }
			  else if (input.equals("B")) {
				  System.out.println("Enter the ID of the employee:");
                                  
                                  //This above should work similar to the autocorrect
			  }
			  else if (input.equals("X")) {
				  System.out.println("Goodbye!");
                                  System.exit(0);
			  }
			  else {
			      System.out.println ("Invalid choice\n");
			  }
		  }	   
=======
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
>>>>>>> 0eafdca48de7a448677b4f24409d146b1bcc515d
    }
}
