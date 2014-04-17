//Name: FrameController
//Description: Controls the changing of JFrames; passed to all frames when created.

public class FrameController {
	private CreateNewAccountMenu createFrame;
	private ChooseAccountMenu chooseFrame;
	private MainMenu mainFrame;
	private EnterInformationMenu enterFrame;
	private MonthlyRecordsMenu monthlyFrame;
	private UserAccountList accountList;
	
	public FrameController(UserAccountList al)
	{
		createFrame = null;
		chooseFrame = null;
		mainFrame = null;
		enterFrame = null;
		monthlyFrame = null;
		accountList = al;
	}
	
	public void openCreateFrame()
	{
		createFrame = new CreateNewAccountMenu(this,accountList);
		createFrame.setVisible(true);
	}
	
	public void openChooseFrame()
	{
		chooseFrame = new ChooseAccountMenu(this,accountList);
		chooseFrame.setVisible(true);		
	}
	
	public void openMainFrame()
	{
		mainFrame = new MainMenu(this,accountList);
		mainFrame.setVisible(true);
	}
	
	public void openEnterFrame()
	{
		enterFrame = new EnterInformationMenu(this,accountList);
		enterFrame.setVisible(true);
	}
	
	public void openMonthlyFrame()
	{
		monthlyFrame = new MonthlyRecordsMenu(this,accountList);
		monthlyFrame.setVisible(true);
	}
}
