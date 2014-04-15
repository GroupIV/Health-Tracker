//Name: HealthTracker
//Description: Contains the main function and the list of accounts. Also contains all the menus in this iteration.

import java.util.*;
import java.awt.EventQueue;
import java.io.*;

public class HealthTracker {
	public static UserAccount currentAccount = null;
	public static UserAccountList listOfAccounts;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*	
	public static void chooseAccountMenu(){

		char input1;
		String firstNameInput = new String(), doctorFirst = new String();
		String lastNameInput = new String(), doctorLast = new String();
		String docAddress = new String(), docEmail = new String(), docPhone = new String();
		int age, genderInt;
		boolean gender;
		
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
	                    if (listOfAccounts.getUser(lastNameInput, firstNameInput) != null){
	                    	currentAccount = listOfAccounts.getUser(lastNameInput, firstNameInput);
	                    }
	                    if(currentAccount == null){
	                    	System.out.print("user not found, please try again");
	                    }
	                    return;
	        	 	case 'R': //Create Account
	        	 		
	        	 		System.out.print("Please enter user's First Name:\n");
	                    firstNameInput = stdin.readLine().trim();
	                    System.out.print("Please enter user's Last Name:\n");
	                    lastNameInput = stdin.readLine().trim();
	                    System.out.print("Please enter user's age:\n");
	                    age = Integer.parseInt(stdin.readLine().trim());
	                    System.out.print("Please enter user's gender. 1: Male, 2: Female");
	                    genderInt = Integer.parseInt(stdin.readLine().trim());
	                    if(genderInt ==1){
	                    	gender = false;
	                    }
	                    else {
	                    	gender = true;
	                    }
	                    System.out.print("Please enter user's doctor's first name:\n");
	                    doctorFirst = stdin.readLine().trim();
	                    System.out.print("Please enter user's doctor's Last Name:\n");
	                    doctorLast = stdin.readLine().trim();
	                    System.out.print("Please enter user's doctor's address:\n");
	                    docAddress = stdin.readLine().trim();
	                    System.out.print("Please enter user's doctor's email:\n");
	                    docEmail = stdin.readLine().trim();
	                    System.out.print("Please enter user's doctor's phone number:\n");
	                    docPhone = stdin.readLine().trim();
	                    
	                    DoctorInfo newDoc = new DoctorInfo(doctorFirst,doctorLast, docAddress, docEmail, docPhone);
	                    
	                    listOfAccounts.addUserAccount(new UserAccount(firstNameInput, lastNameInput, age, gender, newDoc));
	                    
	                    System.out.print("\n\nAccount Successfully Added\n\n");
	                    
	        	 		break;
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
	 
	 public static void mainMenu(){
		 
		 char input1;
			double cardio, strength, work, sleep, systolicBP, diastolicBP, weight, caloriesConsumed, bloodSugar, pulse;
			
			String line = new String();
			
			try
		      {
		       // print out the menu
				listOfAccounts.printAccounts();
		       printMainMenu();

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
		        	 	case 'E': //Enter Daily Record
		        	 		
		        	 		
		        	 		System.out.print("Please enter cardio hours:\n");
		                    cardio = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter strength hours:\n");
		                    strength = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter work hours:\n");
		                    work = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter sleep hours");
		                    sleep = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter systolic blood pressure:\n");
		                    systolicBP = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter diastolic blood pressure:\n");
		                    diastolicBP = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter weight (lbs):\n");
		                    weight = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter calories consumed:\n");
		                    caloriesConsumed = Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter blood sugar level:\n");
		                    bloodSugar= Double.parseDouble(stdin.readLine().trim());
		                    System.out.print("Please enter pulse rate:\n");
		                    pulse = Double.parseDouble(stdin.readLine().trim());
		                    
		                    
		                    check = currentAccount.addDailyRecord(new DailyRecord(cardio, strength, work, sleep, systolicBP, diastolicBP, weight, caloriesConsumed, bloodSugar, pulse));
		                    
		                    if (check){
		                    	System.out.print("\n\nDaily Record Successfully Added\n\n");
		                    }
		                    else{
		                    	System.out.print("\n\nDaily Record could not be added\n\n");
		                    }
		                    
		        	 		break;
		        	 	case 'V': // View Monthly Records
		        	 		//Do some monthly Record Stuff
		        	 		
		        	 		
		        	 		break;
		        	 	case 'C': // Choose another account
		        	 		listOfAccounts.deleteUser(currentAccount.getLastName(), currentAccount.getFirstName());
		        	 		listOfAccounts.addUserAccount(currentAccount);
		        	 		currentAccount = null;
		        	 		return;
		        	 	case '?': //Display Help (just reprint the options)
		        	 		printMainMenu();
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
	 
	 public static void printMainMenu(){
		 System.out.print("Choice\t\tAction\n" +
                 "------\t\t------\n" +
                 "E\t\tEnter Daily Record\n" +
                 "V\t\tView Monthly Records\n" +
                 "C\t\tChoose Account\n" +
                 "?\t\tDisplay Help\n" +
                 "Q\t\tQuit Health Tracker\n");
	 }
	 
	 public HealthTracker() {
			listOfAccounts = new UserAccountList();
			//listOfAccounts.loadAccountList();
		}

	public static void main(String args[]) {
		HealthTracker thing = new HealthTracker();
		
		do{
		if (thing.currentAccount == null){
			chooseAccountMenu();
		}
		if (thing.currentAccount != null) {
			mainMenu();
		}
		} while (thing.currentAccount == null);
		
	}
	*/
}
