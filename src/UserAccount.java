//CSE 360 Group IV Project "Health Tracker"
//This class should create a new User Account, and have methods to get all data of a User Account

import java.util.*;
import java.io.Serializable;

public class UserAccount implements Comparable, Serializable{
	
//Data
	String firstName;
	String lastName;
	int age;
	int height;
	boolean gender;
	List<DailyRecord> dailyRecords;
	DoctorInfo doctor;
	Calendar activationDate;
	
public UserAccount(String newFirstName, String newLastName, int newAge, int newHeight, boolean newGender, DoctorInfo newDoctor)
{
	firstName = newFirstName;
	lastName = newLastName;
	age = newAge;
	height = newHeight;
	gender = newGender;
	doctor = newDoctor;
	activationDate = Calendar.getInstance();
	dailyRecords = new ArrayList<DailyRecord>();
}

public UserAccount()
{
	firstName = "FName";
	lastName = "LName";
	age = 0;
	height = 0;
	gender = true;
	doctor = new DoctorInfo();
	activationDate = Calendar.getInstance();
	dailyRecords = new ArrayList<DailyRecord>();	
}

public String getLastName()
{
	return lastName;
}

public String getFirstName()
{
	return firstName;
}

public int getAge()
{
	return age;
}

public int getHeight()
{
	return height;
}

public boolean getGender()
{
	return gender;
}

public boolean addDailyRecord(DailyRecord newDailyRecord)
{
	Calendar currentDay = Calendar.getInstance();
	
	if (dailyRecords.isEmpty() || dailyRecords.get(dailyRecords.size()).getDate().DAY_OF_YEAR != currentDay.DAY_OF_YEAR && dailyRecords.get(dailyRecords.size()).getDate().YEAR == currentDay.YEAR){
		dailyRecords.add(newDailyRecord);
		return true;
	}
	else {
		return false;
	}
}

public List<DailyRecord> getDailyRecords()   
{
	return dailyRecords;
}

public DoctorInfo getDoctor()
{
	return doctor;
}


//Gives the ability to compare user accounts to one another for sorting in the accounts list.
public int compareTo(Object other){
	//find the result of the comparison between the two lastNames.
			int result = this.lastName.compareTo(((UserAccount)other).getLastName());
			//If the brandNames aren't equal return the result
			if (result != 0) {
				
				return result;
				
			}
			
			//If the lastNames are equal
			else {
				
				//find the result of the comparison between the two firstNames.
				result = this.firstName.compareTo(((UserAccount)other).getFirstName());
				
				return result;
					
				
			}
}

}
