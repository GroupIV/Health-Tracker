// Class Name: UserAccountList
// Description: Holds the list of user accounts and associated methods.

import java.io.*;
import java.util.*;

public class UserAccountList implements Serializable {

	//Attributes
	private List<UserAccount> accountList;
	private UserAccount currentAccount;
	
	//Methods
	
	public UserAccountList() {
	
		accountList = new ArrayList<UserAccount>();
		currentAccount = null;
	}
	
	public UserAccount getUser(String lastName, String firstName) {
		if(accountList.isEmpty()){
			return null;
		}
		for(int i=0; i < accountList.size(); i++){
			if(lastName.compareTo(accountList.get(i).getLastName()) == 0 && firstName.compareTo(accountList.get(i).getFirstName())== 0) {
				return accountList.get(i);
			}
		}
		return null;
	}
	
	public UserAccount getUserIndex(int i){
		if(accountList.isEmpty()){
			return null;
		}
		else if (i >= 0 && i < accountList.size()){
			return accountList.get(i);
		}
		return null;
	}
	
	public boolean addUserAccount(UserAccount newUser){
		UserAccount temp = getUser(newUser.getLastName(), newUser.getFirstName());
		
		if(temp != null && temp.getLastName().equals(newUser.getLastName()) && temp.getFirstName().equals(newUser.getFirstName())){
			return false;
		}
		else {
			accountList.add(newUser);
			return true;
		}
	}
	
	public boolean deleteUser(String lastName, String firstName){
		if(accountList.isEmpty()){
			return false;
		}
		
		UserAccount temp = getUser(lastName, firstName);
		
		if(temp != null) {
			accountList.remove(temp);
			return true;
		}
		
		return false;
	}
	
	public int getSize(){
		return accountList.size();
	}
	
	public void setCurrentAccount(UserAccount ca){
		currentAccount = ca;
	}
	
	public UserAccount getCurrentAccount(){
		return currentAccount;
	}
	
	public void printAccounts(){ //New method for printing out accounts
		String name = new String();
		if (accountList !=null && accountList.isEmpty()) {
			System.out.print("\nThere are no user accounts currently registered\n");
		}
		if(accountList == null) {
			System.out.print("ERROR");
		}
		else {
			for(int i = 0; i<accountList.size(); i++){
				name = accountList.get(i).getFirstName() + " " + accountList.get(i).getLastName();
				System.out.print("\n" + name + "\n");
			}
		}
		
	}
	
	public void saveAccountList(){
		String filename = "persistantList";
		
		FileOutputStream fileOutput = null;
        ObjectOutputStream outStream = null;
        
        try {
     	   
     	   fileOutput = new FileOutputStream(filename);
     	   outStream = new ObjectOutputStream (fileOutput);
     	   
     	   outStream.writeObject(accountList);
     	   System.out.print(filename + " was written\n");
     	   
        }
        
        catch (NotSerializableException exception){
     	   
     	   System.out.println("NotSerializableException");
     	   
        }
        
        catch (IOException exception) {
     	   
     	   System.out.println("IOException");
     	   
        }
        
        finally {
     	   try{
     		   
     		   if (outStream != null) {
     			   
     			   outStream.close();
     			   
     		   }
     		   
     	   }
     	   catch (IOException exception){
     		   
     		   System.out.println(exception);
     		   
     	   }
     	   
        }
	}

	public void loadAccountList(){
		
		String filename = "persistantList";
		
		FileInputStream file = null;
        ObjectInputStream inStream = null;
        
        try {
     	   
     	   file = new FileInputStream (filename);
     	   inStream = new ObjectInputStream(file);
     	   
     	   Object accountListTemp = inStream.readObject();
     	   
     	   if (accountListTemp instanceof List) {
     		   
     		   accountList = (List<UserAccount>)accountListTemp;
     		   
     		   System.out.print(filename + " was read\n");
     		   
     	   }
     	   
        }
        catch (ClassNotFoundException exception) {
     	   
     	   System.out.println("Class was not found");

        }
        
        catch (FileNotFoundException exception) {
     	   
     	   System.out.println(filename + " was not found");
     	   
        }
        
        catch (IOException exception) {
     	   
     	   System.out.println("IOException");
     	   
        }
        
        finally {
     	   
     	   try {
     		   
     		   if (inStream != null){
     			   
     			   inStream.close();
     			   
     		   }
     		   
     	   }
     	   catch (IOException exception) {
     		   
     		   System.out.println(exception);
     		   
     	   }
        }
	}
	
	
}
