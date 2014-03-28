public class HealthTracker {
	public UserAccount currentAccount;
	public UserAccountList listOfAccounts;

	public static HealthTracker singleton;

	public static void main() {
		singleton = new HealthTracker();
	}

	public HealthTracker() {
		listOfAccounts = new UserAccountList();
		listOfAccounts.loadAccountList();
		ChooseAccountMenu CAM = new ChooseAccountMenu();
	}
}
