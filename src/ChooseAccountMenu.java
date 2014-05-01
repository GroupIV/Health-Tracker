//Name: ChooseAccountMenu
//Description: Defines the JFrame for the choose account menu.

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ChooseAccountMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccountList accountList = null;

	/**
	 * Create the frame.
	 */
	public ChooseAccountMenu(FrameController fc, UserAccountList al) {
		ctrl = fc;
		accountList = al;
		
		try {
			accountList.loadAccountList();
		}
		catch (Exception e) {
			System.out.println("Unable to Load Account");
		}
		
		setTitle("Choose an Account");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 405, 180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Choose Your Account");
		titleLabel.setForeground(new Color(25, 25, 112));
		titleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		titleLabel.setBounds(10, 11, 274, 51);
		contentPane.add(titleLabel);

		//Create array of user names
		String[] comboList = new String[accountList.getSize()];
		
		for (int i = 0;i < accountList.getSize();i++)
		{
			comboList[i] = accountList.getUserIndex(i).getFirstName() + " " + accountList.getUserIndex(i).getLastName();
		}
		
		final JComboBox<String> accountListComboBox = new JComboBox<String>(comboList);
		accountListComboBox.setMaximumRowCount(20);
		accountListComboBox.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		accountListComboBox.setBounds(10, 73, 274, 20);
		contentPane.add(accountListComboBox);
		
		JButton chooseButton = new JButton("Choose Account");
		/*
		 * Choose Button Action Listener
		 */
		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (accountList.getSize() == 0){
					JOptionPane.showMessageDialog(ChooseAccountMenu.this,
						    "No accounts exist. Create one.",
						    "Account Selection error",
						    JOptionPane.WARNING_MESSAGE);				
				}
				else{
					accountList.setCurrentAccount(accountList.getUserIndex(accountListComboBox.getSelectedIndex()));
					ctrl.openMainFrame();
					setVisible(false);
					dispose();
				}
			}
		});
		chooseButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		chooseButton.setBounds(10, 112, 119, 23);
		contentPane.add(chooseButton);
		
		JButton deleteButton = new JButton("Delete Account");
		/*
		 * Delete Button Action Listener
		 */
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Do any accounts exist for deletion?
				if (accountList.getSize() == 0){
					JOptionPane.showMessageDialog(ChooseAccountMenu.this,
						    "No accounts exist to delete. Create one.",
						    "Account Deletion error",
						    JOptionPane.WARNING_MESSAGE);				
				}
				else{
					//Check if user wants to delete
					int n = JOptionPane.showConfirmDialog(
						    ChooseAccountMenu.this,
						    "Are you sure you want to delete " + accountListComboBox.getSelectedItem() + "?",
						    "Delete Account",
						    JOptionPane.YES_NO_OPTION);
					//If so, delete
					if (n == 0){
						UserAccount toDelete = accountList.getUserIndex(accountListComboBox.getSelectedIndex());
						accountList.deleteUser(toDelete.getLastName(),toDelete.getFirstName());
						accountList.saveAccountList();
						ctrl.openChooseFrame();
						setVisible(false);
						dispose();									
					}
				}
			}
		});
		deleteButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		deleteButton.setBounds(139, 112, 119, 23);
		contentPane.add(deleteButton);
		
		JButton createButton = new JButton("Create Account");
		/*
		 * Create Button Action Listener
		 */
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openCreateFrame();
				setVisible(false);
				dispose();				
			}
		});
		createButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		createButton.setBounds(268, 113, 119, 23);
		contentPane.add(createButton);
	}
}
