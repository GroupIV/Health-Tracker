//Name: HealthTracker
//Description: Contains the main function and the list of accounts. Also contains all the menus in this iteration.

import java.util.*;
import java.io.*;

public class HealthTracker {
	public UserAccount currentAccount = null;
	public UserAccountList listOfAccounts;

	public static HealthTracker singleton;
	
	public void chooseAccountMenu(){
		
		char input1;
		String firstNameInput = new String();
		String lastNameInput = new String();
		String line = new String();
		
		try
	      {
	       // print out the menu
			listOfAccounts.printAccounts();
	       printChooseAccountMenu();

	       // create a BufferedReader object to read input from a keyboard
	       InputStreamReader isr = new InputStreamReader (System.in);
	       BufferedReader stdin = new BufferedReader (isr);

	       do
	        {
	         System.out.print("What action would you like to perform?\n");
	         line = stdin.readLine().trim();  //read a line
	         input1 = line.charAt(0);
	         input1 = Character.toUpperCase(input1);
	         boolean check;

	         if (line.length() == 1) {         //check if a user entered only one character
	        	 switch (input1){
	        	 	case 'C': //Choose Account
	        	 		System.out.print("Please enter user's First Name:\n");
	                    firstNameInput = stdin.readLine().trim();
	                    System.out.print("Please enter user's Last Name:\n");
	                    lastNameInput = stdin.readLine().trim();
	                    
	                    currentAccount = listOfAccounts.getUser(lastNameInput, firstNameInput);
	                    
	                    if(currentAccount == null){
	                    	System.out.print("user not found, please try again");
	                    }
	                    break;
	        	 	case 'R': //Create Account
	        	 		//To Be Completed
	        	 		
	        	 	case 'L': //List Accounts
	        	 		System.out.print("\nCurrently Registered Accounts\n");
	        	 		listOfAccounts.printAccounts();
	        	 		break;
	        	 	case 'D': //Delete Accounts
	        	 		System.out.print("Please enter user to delete's First Name:\n");
	                    firstNameInput = stdin.readLine().trim();
	                    System.out.print("Please enter user to delete's Last Name:\n");
	                    lastNameInput = stdin.readLine().trim();
	                    
	                    check = listOfAccounts.deleteUser(lastNameInput, firstNameInput);
	        	 		
	                    if (check){
	                    	System.out.print("\nAccount Deleted\n");
	                    }
	                    else{
	                    	System.out.print("\nAccount Not Found\n");
	                    }
	                    break;
	        	 	case '?': //Display Help (just reprint the options)
	        	 		printChooseAccountMenu();
	        	 		break;
	        	 	case 'Q':
	        	 		break;
	        	 }
	         }
	         
	         else
	         {
	           System.out.print("Unknown action\n");
	          }
	        	 
	        } while(input1 != 'Q' || line.length() != 1);
	       
	      }

		catch (IOException exception)
		      {
		        System.out.print("IO Exception\n");
		      }
		}
	
	 public static void printChooseAccountMenu()
	   {
	     System.out.print("Choice\t\tAction\n" +
	                      "------\t\t------\n" +
	                      "C\t\tChoose Account\n" +
	                      "R\t\tCreate Account\n" +
	                      "D\t\tDelete Account\n" +
	                      "L\t\tList Accounts\n" +
	                      "?\t\tDisplay Help\n" +
	                      "Q\t\tQuit\n\n");
	  }

	public static void main(String args[]) {
		singleton = new HealthTracker();
		
	}

	public HealthTracker() {
		listOfAccounts = new UserAccountList();
		listOfAccounts.loadAccountList();
	}
}
