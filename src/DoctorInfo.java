
//  Class Name: DoctorInfo
//  Description: Class to contain all the information needed from a health care professional. Every user account has
// 				 doctor info.

public class DoctorInfo {
	
	//Attributes
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	
	
	//Constructor
	public DoctorInfo (String firstName, String lastName, String address, String email, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	//Methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
}
