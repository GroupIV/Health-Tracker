//Name: MainMenu
//Description: Defines the JFrame for the menu menu.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class MainMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccount currentAccount = null;
	private UserAccountList accountList = null;
	
	/**
	 * Create the frame.
	 */
	public MainMenu(FrameController fc, UserAccount ca, UserAccountList al) {
		ctrl = fc;
		currentAccount = ca;
		accountList = al;
		
		setTitle("Main Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 560, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Health Tracker");
		titleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 62));
		titleLabel.setForeground(new Color(25, 25, 112));
		titleLabel.setBounds(86, 11, 381, 106);
		contentPane.add(titleLabel);
		
		JLabel helloLabel = new JLabel("Hello");
		helloLabel.setForeground(new Color(25, 25, 112));
		helloLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		helloLabel.setBounds(241, 107, 64, 30);
		contentPane.add(helloLabel);
		
		JLabel userNameLabel = new JLabel("<Account Name>");
		userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userNameLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		userNameLabel.setForeground(new Color(25, 25, 112));
		userNameLabel.setBounds(86, 139, 381, 30);
		contentPane.add(userNameLabel);
		
		JButton enterDailyRecordButton = new JButton("Enter Daily Record");
		/*
		 * Enter Daily Record Button Action Listener
		 */
		enterDailyRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openEnterFrame();
				setVisible(false);
				dispose();
			}
		});
		enterDailyRecordButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		enterDailyRecordButton.setBounds(202, 180, 142, 39);
		contentPane.add(enterDailyRecordButton);
		
		JButton viewStatisticsButton = new JButton("View Statistics");
		/*
		 * View Statistics Button Action Listener 
		 */
		viewStatisticsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openMonthlyFrame();
				setVisible(false);
				dispose();
			}
		});
		viewStatisticsButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		viewStatisticsButton.setBounds(202, 230, 142, 39);
		contentPane.add(viewStatisticsButton);
		
		JButton changeAccountButton = new JButton("Change Account");
		/*
		 * Change Account Button Action Listener
		 */
		changeAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openChooseFrame();
				setVisible(false);
				dispose();
			}
		});
		changeAccountButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		changeAccountButton.setBounds(202, 280, 142, 39);
		contentPane.add(changeAccountButton);
		
		JButton quitButton = new JButton("Quit Program");
		/*
		 * Quit Button Action Listener
		 */
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		quitButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		quitButton.setBounds(202, 330, 142, 39);
		contentPane.add(quitButton);
	}
}
