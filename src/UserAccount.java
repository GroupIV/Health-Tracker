//CSE 360 Group IV Project "Health Tracker"
//This class should create a new User Account, and have methods to get all data of a User Account

public class UserAccount {
	
//Data
	String firstName;
	String lastName;
	int age;
	boolean gender;
	ArrayList<DailyRecord> dailyRecords;
	DoctorInfo doctor;
	
public UserAccount(String newFirstName, String newLastName, int newAge, boolean newGender, DoctorInfo newDoctor)
{
	firstName = newFirstName;
	lastName = newLastName;
	age = newAge;
	gender = newGender;
	doctor = newDoctor;
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

public boolean getGender()
{
	return gender;
}

public void addDailyRecord(newDailyRecord)
{
	DailyRecord(newDailyRecord);
}

public DailyRecord getDailyRecord(Int)   
//I'm assuming that Int is a DailyRecord 

{
	return "Cardio: " + Int.cardio + "\nStrenth: " + Int.strength + "\nSleep: " + Int.sleep + "\nSystolicBP: " + Int.systolicBP + "\nWeight: " + Int.weight + "\nCalories Consumed: " + Int.caloriesConsumed + "\nBlood Sugar: " + Int.bloodSugar + "\nPulse: " + Int.pulse;
}

public Doctorinfo getDoctor()
{
	return doctor;
}

}
