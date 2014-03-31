public class HealthTracker
{
	public UserAccount currentAccount;
	public UserAccountList listOfAccounts;
	
	public static void main()
	{
		listOfAccounts = new UserAccountList();
		listOfAccounts.loadAccountList();
		ChooseAccountMenu CAM = new ChooseAccountMenu();		
	}
}
