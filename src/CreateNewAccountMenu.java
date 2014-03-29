public class CreateNewAccountMenu {
	public boolean createNewAccount(UserAccount account) {
		HealthTracker.singleton.listOfAccounts.addUserAccount(account);
		HealthTracker.singleton.currentAccount = account;
		return true;
	}

	public void gotoChooseAccount() {
		ChooseAccountMenu CAM = new ChooseAccountMenu();
		// get rid of create new account menu here
	}

	public void submit() {
		String doctorFirstName = editDoctorFirstName.getText();
		String doctorLastName = editDoctorLastName.getText();
		String doctorAddress = editDoctorAddress.getText();
		String doctorEmail = editDoctorEmail.getText();
		String doctorPhoneNumber = editDoctorPhoneNumber.getText();

		DoctorInfo DI = new DoctorInfo(doctorFirstName, doctorLastName,
				doctorAddress, doctorEmail, doctorPhoneNumber);

		String userFirstName = editUserFirstName.getText();
		String userLastName = editUserLastName.getText();
		int userAge = Integer.parseInt(editUserAge.getText());
		boolean userGender = radioMale.isSelected();

		UserAccount account = new UserAccount(userFirstName, userLastName,
				userAge, userGender, DI);

		createNewAccount(account);

		gotoChooseAccount();

	}
}
