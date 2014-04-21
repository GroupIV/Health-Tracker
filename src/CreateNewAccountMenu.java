//Name: CreateNewAccountMenu
//Description: Defines the JFrame for the create new account menu.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

import javax.swing.ButtonGroup;


public class CreateNewAccountMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccountList accountList = null;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public CreateNewAccountMenu(FrameController fc, UserAccountList al) {
		ctrl = fc;
		accountList = al;
		

		setTitle("Create a New Account");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 560, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userInfoTitle = new JLabel("User Information");
		userInfoTitle.setForeground(new Color(25, 25, 112));
		userInfoTitle.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		userInfoTitle.setBounds(10, 11, 228, 41);
		contentPane.add(userInfoTitle);
		
		JLabel doctorInfoTitle = new JLabel("Doctor's Information");
		doctorInfoTitle.setForeground(new Color(25, 25, 112));
		doctorInfoTitle.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		doctorInfoTitle.setBounds(286, 11, 258, 41);
		contentPane.add(doctorInfoTitle);
		
		JLabel userFirstNameLabel = new JLabel("First Name:");
		userFirstNameLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		userFirstNameLabel.setForeground(new Color(25, 25, 112));
		userFirstNameLabel.setBounds(10, 63, 80, 16);
		contentPane.add(userFirstNameLabel);
		
		final JFormattedTextField userFirstNameField = new JFormattedTextField();
		userFirstNameField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		userFirstNameField.setBounds(10, 90, 228, 20);
		contentPane.add(userFirstNameField);
		
		JLabel userLastNameLabel = new JLabel("Last Name:");
		userLastNameLabel.setForeground(new Color(25, 25, 112));
		userLastNameLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		userLastNameLabel.setBounds(10, 121, 80, 16);
		contentPane.add(userLastNameLabel);
		
		final JFormattedTextField userLastNameField = new JFormattedTextField();
		userLastNameField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		userLastNameField.setBounds(10, 148, 228, 20);
		contentPane.add(userLastNameField);
		
		JLabel userAgeLabel = new JLabel("Age:");
		userAgeLabel.setForeground(new Color(25, 25, 112));
		userAgeLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		userAgeLabel.setBounds(10, 179, 36, 22);
		contentPane.add(userAgeLabel);
		
		JLabel userHeightLabel = new JLabel("Height (in.):");
		userHeightLabel.setForeground(new Color(25, 25, 112));
		userHeightLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		userHeightLabel.setBounds(10, 242, 80, 22);
		contentPane.add(userHeightLabel);
		
		JLabel userGenderLabel = new JLabel("Gender:");
		userGenderLabel.setForeground(new Color(25, 25, 112));
		userGenderLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		userGenderLabel.setBounds(10, 303, 64, 16);
		contentPane.add(userGenderLabel);
		
		final JFormattedTextField userAgeField = new JFormattedTextField();
		userAgeField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		userAgeField.setBounds(10, 212, 64, 20);
		contentPane.add(userAgeField);
		
		final JFormattedTextField userHeightField = new JFormattedTextField();
		userHeightField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		userHeightField.setBounds(10, 272, 64, 20);
		contentPane.add(userHeightField);
		
		JLabel doctorFirstNameLabel = new JLabel("First Name:");
		doctorFirstNameLabel.setForeground(new Color(25, 25, 112));
		doctorFirstNameLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		doctorFirstNameLabel.setBounds(286, 63, 80, 16);
		contentPane.add(doctorFirstNameLabel);
		
		final JFormattedTextField doctorFirstNameField = new JFormattedTextField();
		doctorFirstNameField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		doctorFirstNameField.setBounds(286, 91, 228, 20);
		contentPane.add(doctorFirstNameField);
		
		JLabel doctorLastNameLabel = new JLabel("Last Name:");
		doctorLastNameLabel.setForeground(new Color(25, 25, 112));
		doctorLastNameLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		doctorLastNameLabel.setBounds(286, 125, 80, 16);
		contentPane.add(doctorLastNameLabel);
		
		final JFormattedTextField doctorLastNameField = new JFormattedTextField();
		doctorLastNameField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		doctorLastNameField.setBounds(286, 149, 228, 20);
		contentPane.add(doctorLastNameField);
		
		JLabel doctorAddressLabel = new JLabel("Address:");
		doctorAddressLabel.setForeground(new Color(25, 25, 112));
		doctorAddressLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		doctorAddressLabel.setBounds(286, 182, 80, 16);
		contentPane.add(doctorAddressLabel);
		
		final JFormattedTextField doctorAddressField = new JFormattedTextField();
		doctorAddressField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		doctorAddressField.setBounds(286, 212, 228, 20);
		contentPane.add(doctorAddressField);
		
		JLabel doctorEmailLabel = new JLabel("Email:");
		doctorEmailLabel.setForeground(new Color(25, 25, 112));
		doctorEmailLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		doctorEmailLabel.setBounds(286, 245, 80, 16);
		contentPane.add(doctorEmailLabel);
		
		final JFormattedTextField doctorEmailField = new JFormattedTextField();
		doctorEmailField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		doctorEmailField.setBounds(286, 272, 228, 20);
		contentPane.add(doctorEmailField);
		
		JLabel doctorPhoneLabel = new JLabel("Phone Number:");
		doctorPhoneLabel.setForeground(new Color(25, 25, 112));
		doctorPhoneLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		doctorPhoneLabel.setBounds(286, 303, 107, 16);
		contentPane.add(doctorPhoneLabel);
		
		final JFormattedTextField doctorPhoneField = new JFormattedTextField();
		doctorPhoneField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		doctorPhoneField.setBounds(286, 330, 228, 20);
		contentPane.add(doctorPhoneField);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(176, 196, 222));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(new Color(176, 196, 222));
		separator.setBounds(262, 11, 2, 349);
		contentPane.add(separator);

		final JRadioButton maleButton = new JRadioButton("Male");
		buttonGroup.add(maleButton);
		maleButton.setSelected(true);
		maleButton.setBackground(new Color(255, 255, 255));
		maleButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		maleButton.setBounds(10, 330, 47, 23);
		contentPane.add(maleButton);
		
		final JRadioButton femaleButton = new JRadioButton("Female");
		buttonGroup.add(femaleButton);
		femaleButton.setBackground(new Color(255, 255, 255));
		femaleButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		femaleButton.setBounds(59, 329, 64, 23);
		contentPane.add(femaleButton);
		
		JButton cancelButton = new JButton("Cancel");
		/*
		 * Cancel Button Action Listener
		 */
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openChooseFrame();
				setVisible(false);
				dispose();
			}
		});
		cancelButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		cancelButton.setBounds(10, 368, 89, 23);
		contentPane.add(cancelButton);
		
		JButton submitButton = new JButton("Submit");
		/*
		 * Submit Button Action Listener
		 */
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Check if fields are empty
				if (!userFirstNameField.getText().trim().equals("")
					&& !userLastNameField.getText().trim().equals("")
					&& !userAgeField.getText().trim().equals("")
					&& !userHeightField.getText().trim().equals("")
					&& !doctorFirstNameField.getText().trim().equals("")
					&& !doctorLastNameField.getText().trim().equals("")
					&& !doctorAddressField.getText().trim().equals("")
					&& !doctorEmailField.getText().trim().equals("")
					&& !doctorPhoneField.getText().trim().equals(""))
				{
					//Create temp storage for int values
					int tempAge;
					int tempHeight;
					
					//Attempt conversion of strings to int values
					try{
						tempAge = Integer.parseInt(userAgeField.getText());
						tempHeight = Integer.parseInt(userHeightField.getText());
					
						//Check if int values are correct
						if (tempAge < 0 || tempHeight < 0 || tempAge > 140 || tempHeight > 120){
							JOptionPane.showMessageDialog(CreateNewAccountMenu.this,
								    "Invalid data in one of the fields.",
								    "Input error",
								    JOptionPane.ERROR_MESSAGE);
						}
						else{
							//Create temp info from given data
							String uFNTemp = userFirstNameField.getText();
							String uLNTemp = userLastNameField.getText();
							String dFNTemp = doctorFirstNameField.getText();
							String dLNTemp = doctorLastNameField.getText();
							String dATemp = doctorAddressField.getText();
							String dETemp = doctorEmailField.getText();
							String dPTemp = doctorPhoneField.getText();
							
							DoctorInfo DITemp = new DoctorInfo(dFNTemp,dLNTemp,dATemp,dETemp,dPTemp);
							
							boolean tempGender = false;
							if (femaleButton.isSelected()){
								tempGender = true;
							}

							//Attempt to add account
							//Check if the amount of accounts has hit the limit (20).
							if (accountList.getSize() < 20){
								if(accountList.addUserAccount(new UserAccount(uFNTemp,uLNTemp,tempAge,tempHeight,tempGender,DITemp))){
									accountList.saveAccountList();
									ctrl.openChooseFrame();
									setVisible(false);
									dispose();						
								}
								else{
									JOptionPane.showMessageDialog(CreateNewAccountMenu.this,
										    "Account with this name already exists.",
										    "Add Account error",
										    JOptionPane.ERROR_MESSAGE);
								}
							}
							else{
								JOptionPane.showMessageDialog(CreateNewAccountMenu.this,
									    "No more accounts can be added.",
									    "Add Account error",
									    JOptionPane.ERROR_MESSAGE);								
							}
						}	
					} catch (NumberFormatException ne){
						JOptionPane.showMessageDialog(CreateNewAccountMenu.this,
							    "Incorrect value types entered.",
							    "Input error",
							    JOptionPane.ERROR_MESSAGE);						
					}							
				}
				else{
					JOptionPane.showMessageDialog(CreateNewAccountMenu.this,
					    "Not all fields have been filled.",
					    "Input error",
					    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		submitButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		submitButton.setBounds(455, 368, 89, 23);
		contentPane.add(submitButton);
	}
}
