//Name: FrameController
//Description: Controls the changing of JFrames; passed to all frames when created.

public class FrameController {
	private CreateNewAccountMenu createFrame;
	private ChooseAccountMenu chooseFrame;
	private MainMenu mainFrame;
	private EnterInformationMenu enterFrame;
	private MonthlyRecordsMenu monthlyFrame;
	private UserAccount currentAccount;
	private UserAccountList accountList;
	
	public FrameController(UserAccount ca, UserAccountList al)
	{
		createFrame = null;
		chooseFrame = null;
		mainFrame = null;
		enterFrame = null;
		monthlyFrame = null;
		currentAccount = ca;
		accountList = al;
	}
	
	public void openCreateFrame()
	{
		createFrame = new CreateNewAccountMenu(this,currentAccount,accountList);
		createFrame.setVisible(true);
	}
	
	public void openChooseFrame()
	{
		chooseFrame = new ChooseAccountMenu(this,currentAccount,accountList);
		chooseFrame.setVisible(true);		
	}
	
	public void openMainFrame()
	{
		mainFrame = new MainMenu(this,currentAccount,accountList);
		mainFrame.setVisible(true);
	}
	
	public void openEnterFrame()
	{
		enterFrame = new EnterInformationMenu(this,currentAccount,accountList);
		enterFrame.setVisible(true);
	}
	
	public void openMonthlyFrame()
	{
		monthlyFrame = new MonthlyRecordsMenu(this,currentAccount,accountList);
		monthlyFrame.setVisible(true);
	}
}
