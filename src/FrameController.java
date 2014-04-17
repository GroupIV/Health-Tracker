//Name: FrameController
//Description: Controls the changing of JFrames; passed to all frames when created.

public class FrameController {
	private CreateNewAccountMenu createFrame;
	private ChooseAccountMenu chooseFrame;
	private MainMenu mainFrame;
	private EnterInformationMenu enterFrame;
	private MonthlyRecordsMenu monthlyFrame;
	
	public FrameController()
	{
		createFrame = null;
		chooseFrame = null;
		mainFrame = null;
		enterFrame = null;
		monthlyFrame = null;
	}
	
	public void openCreateFrame()
	{
		createFrame = new CreateNewAccountMenu(this);
		createFrame.setVisible(true);
	}
	
	public void openChooseFrame()
	{
		chooseFrame = new ChooseAccountMenu(this);
		chooseFrame.setVisible(true);		
	}
	
	public void openMainFrame()
	{
		mainFrame = new MainMenu(this);
		mainFrame.setVisible(true);
	}
	
	public void openEnterFrame()
	{
		enterFrame = new EnterInformationMenu(this);
		enterFrame.setVisible(true);
	}
	
	public void openMonthlyFrame()
	{
		monthlyFrame = new MonthlyRecordsMenu(this);
		monthlyFrame.setVisible(true);
	}
}
