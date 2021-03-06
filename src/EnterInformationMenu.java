//Name: EnterInformationMenu
//Description: Defines the JFrame for the enter information menu.

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class EnterInformationMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccountList accountList = null;
	
	/**
	 * Create the frame.
	 */
	public EnterInformationMenu(FrameController fc, UserAccountList al) {
		ctrl = fc;
		accountList = al;
		
		setTitle("Enter Daily Record");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 560, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Enter Your Daily Information");
		titleLabel.setForeground(new Color(25, 25, 112));
		titleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 36));
		titleLabel.setBounds(10, 11, 438, 48);
		contentPane.add(titleLabel);
		
		JLabel activityTitleLabel = new JLabel("Physical Activities");
		activityTitleLabel.setForeground(new Color(25, 25, 112));
		activityTitleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		activityTitleLabel.setBounds(34, 70, 163, 25);
		contentPane.add(activityTitleLabel);
		
		JLabel indicatorTitleLabel = new JLabel("Health Indicators");
		indicatorTitleLabel.setForeground(new Color(25, 25, 112));
		indicatorTitleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		indicatorTitleLabel.setBounds(310, 70, 163, 25);
		contentPane.add(indicatorTitleLabel);
		
		JLabel hourPromptLabel = new JLabel("(in hours)");
		hourPromptLabel.setForeground(new Color(25, 25, 112));
		hourPromptLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		hourPromptLabel.setBounds(34, 97, 52, 14);
		contentPane.add(hourPromptLabel);
		
		JLabel cardioLabel = new JLabel("Cardio:");
		cardioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cardioLabel.setForeground(new Color(25, 25, 112));
		cardioLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		cardioLabel.setBounds(27, 122, 52, 25);
		contentPane.add(cardioLabel);
		
		JLabel strengthLabel = new JLabel("Strength:");
		strengthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		strengthLabel.setForeground(new Color(25, 25, 112));
		strengthLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		strengthLabel.setBounds(10, 158, 69, 25);
		contentPane.add(strengthLabel);
		
		JLabel workLabel = new JLabel("Work:");
		workLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		workLabel.setForeground(new Color(25, 25, 112));
		workLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		workLabel.setBounds(34, 194, 45, 25);
		contentPane.add(workLabel);
		
		JLabel sleepLabel = new JLabel("Sleep:");
		sleepLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		sleepLabel.setForeground(new Color(25, 25, 112));
		sleepLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		sleepLabel.setBounds(33, 230, 46, 25);
		contentPane.add(sleepLabel);
		
		JLabel bloodPressureLabel = new JLabel("Blood Pressure (mmHg):");
		bloodPressureLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		bloodPressureLabel.setForeground(new Color(25, 25, 112));
		bloodPressureLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		bloodPressureLabel.setBounds(219, 122, 163, 25);
		contentPane.add(bloodPressureLabel);
		
		JLabel bloodPressureDividerLabel = new JLabel("/");
		bloodPressureDividerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		bloodPressureDividerLabel.setForeground(new Color(25, 25, 112));
		bloodPressureDividerLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		bloodPressureDividerLabel.setBounds(440, 122, 8, 25);
		contentPane.add(bloodPressureDividerLabel);
		
		JLabel bloodSugarLabel = new JLabel("Blood Sugar (mg/dL):");
		bloodSugarLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		bloodSugarLabel.setForeground(new Color(25, 25, 112));
		bloodSugarLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		bloodSugarLabel.setBounds(232, 158, 150, 25);
		contentPane.add(bloodSugarLabel);
		
		JLabel pulseLabel = new JLabel("Pulse Rate (BPM):");
		pulseLabel.setForeground(new Color(25, 25, 112));
		pulseLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		pulseLabel.setBounds(264, 194, 118, 25);
		contentPane.add(pulseLabel);
		
		JLabel weightLabel = new JLabel("Weight (lb):");
		weightLabel.setForeground(new Color(25, 25, 112));
		weightLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		weightLabel.setBounds(304, 230, 78, 25);
		contentPane.add(weightLabel);
		
		JLabel caloriesLabel = new JLabel("Calories Consumed:");
		caloriesLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		caloriesLabel.setForeground(new Color(25, 25, 112));
		caloriesLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		caloriesLabel.setBounds(244, 266, 138, 25);
		contentPane.add(caloriesLabel);
		
		final JFormattedTextField cardioField = new JFormattedTextField();
		cardioField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		cardioField.setBounds(89, 127, 108, 20);
		contentPane.add(cardioField);
		
		JButton cancelButton = new JButton("Cancel");
		/*
		 * Cancel Button Action Listener
		 */
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openMainFrame();
				setVisible(false);
				dispose();
			}
		});
		cancelButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		cancelButton.setBounds(10, 308, 89, 23);
		contentPane.add(cancelButton);
		
		
		final JFormattedTextField strengthField = new JFormattedTextField();
		strengthField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		strengthField.setBounds(89, 163, 108, 20);
		contentPane.add(strengthField);
		
		final JFormattedTextField workField = new JFormattedTextField();
		workField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		workField.setBounds(89, 199, 108, 20);
		contentPane.add(workField);
		
		final JFormattedTextField sleepField = new JFormattedTextField();
		sleepField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		sleepField.setBounds(89, 235, 108, 20);
		contentPane.add(sleepField);
		
		final JFormattedTextField systolicBloodPressureField = new JFormattedTextField();
		systolicBloodPressureField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		systolicBloodPressureField.setBounds(392, 127, 52, 20);
		contentPane.add(systolicBloodPressureField);
		
		final JFormattedTextField diastolicBloodPressureField = new JFormattedTextField();
		diastolicBloodPressureField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		diastolicBloodPressureField.setBounds(448, 127, 52, 20);
		contentPane.add(diastolicBloodPressureField);
		
		final JFormattedTextField bloodSugarField = new JFormattedTextField();
		bloodSugarField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		bloodSugarField.setBounds(392, 163, 108, 20);
		contentPane.add(bloodSugarField);
		
		final JFormattedTextField pulseField = new JFormattedTextField();
		pulseField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		pulseField.setBounds(392, 199, 108, 20);
		contentPane.add(pulseField);
		
		final JFormattedTextField weightField = new JFormattedTextField();
		weightField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		weightField.setBounds(392, 235, 108, 20);
		contentPane.add(weightField);
		
		final JFormattedTextField caloriesField = new JFormattedTextField();
		caloriesField.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		caloriesField.setBounds(392, 271, 108, 20);
		contentPane.add(caloriesField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(176, 196, 222));
		separator.setForeground(new Color(176, 196, 222));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(207, 70, 2, 235);
		contentPane.add(separator);
		
		JButton submitButton = new JButton("Submit");
		/*
		 * Submit Button Action Listener
		 */
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Check if fields are empty
				if (!strengthField.getText().trim().equals("")
					&& !cardioField.getText().trim().equals("")
					&& !bloodSugarField.getText().trim().equals("")
					&& !caloriesField.getText().trim().equals("")
					&& !workField.getText().trim().equals("")
					&& !sleepField.getText().trim().equals("")
					&& !diastolicBloodPressureField.getText().trim().equals("")
					&& !systolicBloodPressureField.getText().trim().equals("")
					&& !weightField.getText().trim().equals("")
					&& !pulseField.getText().trim().equals(""))
				{
					//Create temp storage for int values
					double tempStrength;
					double tempCardio;
					double tempBloodSugar;
					double tempCalories;
					double tempWork;
					double tempSleep;
					double tempSystolic;
					double tempDiastolic;
					double tempWeight;
					double tempPulse;
					
					//Attempt conversion of strings to int values
					try{
						tempStrength = Double.parseDouble(strengthField.getText());
						tempCardio = Double.parseDouble(cardioField.getText());
						tempBloodSugar = Double.parseDouble(bloodSugarField.getText());
						tempCalories = Double.parseDouble(caloriesField.getText());
						tempWork = Double.parseDouble(workField.getText());
						tempSleep = Double.parseDouble(sleepField.getText());
						tempSystolic = Double.parseDouble(systolicBloodPressureField.getText());
						tempDiastolic = Double.parseDouble(diastolicBloodPressureField.getText());
						tempWeight = Double.parseDouble(weightField.getText());
						tempPulse = Double.parseDouble(pulseField.getText());
						
					
						//Check if int values are correct
						if (tempStrength < 0 || tempCardio < 0 || tempBloodSugar < 0 || tempCalories < 0 || tempWork < 0 || tempSleep < 0 || tempSystolic < 0 || tempDiastolic < 0 || tempWeight < 0 || tempPulse < 0){
							JOptionPane.showMessageDialog(EnterInformationMenu.this,
								    "Invalid data in one of the fields.",
								    "Input error",
								    JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							//Check if time values are correct
							if (tempWork + tempSleep + tempStrength + tempCardio != 24)
							{
								JOptionPane.showMessageDialog(EnterInformationMenu.this,
									    "Time spent during activities does not add up to 24 hours.",
									    "Input error",
									    JOptionPane.ERROR_MESSAGE);								
							}
							else
							{
								//Attempt to add account
								//Check if the amount of accounts has hit the limit (20).
								if (true){
									if(accountList.getCurrentAccount().addDailyRecord(new DailyRecord(tempCardio, tempStrength, tempWork,
											tempSleep, tempSystolic, tempDiastolic,
											tempWeight, tempCalories, tempBloodSugar,
											tempPulse))){
										accountList.saveAccountList();
										ctrl.openMainFrame();
										setVisible(false);
										dispose();						
									}
									else{
										JOptionPane.showMessageDialog(EnterInformationMenu.this,
											    "Daily Record Already Exists For Today.",
											    "DailyRecord Error",
											    JOptionPane.ERROR_MESSAGE);
									}
								}	
							}
						}
					} catch (NumberFormatException ne){
						JOptionPane.showMessageDialog(EnterInformationMenu.this,
							    "Incorrect value types entered.",
							    "Input error",
							    JOptionPane.ERROR_MESSAGE);						
					}							
				}
				else{
					JOptionPane.showMessageDialog(EnterInformationMenu.this,
					    "Not all fields have been filled.",
					    "Input error",
					    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		submitButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		submitButton.setBounds(455, 308, 89, 23);
		contentPane.add(submitButton);
	}

}
