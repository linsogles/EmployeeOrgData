/*
 * Linda Oglesbee & Scott Mitchell
 * 2/6/2018
 * Program 2
 * This class interacts with user to display
 * employee's of  information of the Beam Me Up! Transportation Company 
 */
package program2;

import java.util.Scanner;

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
                                          
                                          //divider
                                          System.out.println("   Name      ID       Gross       Direct Reports");
                                          System.out.println("                    Weekly Pay ");

		    			 break;
				  }
					while (true) { // start of infinite loop
					      System.out.println ("Enter  ");
					      b = keyboard.nextDouble();
			    		if (b>0){
			    			break;
			    		}
					}
			    	while (true) { // start of infinite loop
			    		 System.out.println ("Enter ");
					      c = keyboard.nextDouble();
					      if (c>0){
				             break;
				    	  }
			    	}
			      
			      // comment  	
			  }
			  else if (input.equals("B")) {
				  System.out.println("Enter the ID of the employee:");
			      System.exit(0);
			  }
			  else if (input.equals("X")) {
				  System.out.println("Goodbye!");
                                  System.exit(0);
			  }
			  else {
			      System.out.println ("Invalid choice\n");
			  }
		  }	   
    }
}
