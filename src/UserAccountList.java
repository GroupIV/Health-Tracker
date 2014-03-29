// Class Name: UserAccountList
// Description: Holds the list of user accounts and associated methods.

import java.io.Serializable;
import java.util.*;

public class UserAccountList implements Serializable {

	//Attributes
	public List<UserAccount> accountList;
	
	//Methods
	UserAccount getUser(String lastName, String firstName) {
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
	
	boolean addUserAccount(UserAccount newUser){
		UserAccount temp = getUser(newUser.getLastName(), newUser.getFirstName());
		
		if(temp != null && temp.getLastName().equals(newUser.getLastName()) && temp.getFirstName().equals(newUser.getFirstName())){
			return false;
		}
		else {
			accountList.add(newUser);
			return true;
		}
	}
	
	boolean deleteUser(String lastName, String firstName){
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
	
	void saveAccountList(){
		//To be filled in at another time. Saves the account list to a file to give the program some permanence.
	}
	
	void loadAccountList(){
		//To be filled in at another time. Loads the account list from a file.
	}
	
	
}
