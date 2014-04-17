//Name: MonthlyRecordsMenu
//Description: Defines the JFrame for the monthly records menu.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MonthlyRecordsMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccount currentAccount = null;
	private UserAccountList accountList = null;
	
	/**
	 * Create the frame.
	 */
	public MonthlyRecordsMenu(FrameController fc, UserAccount ca, UserAccountList al) {
		ctrl = fc;
		currentAccount = ca;
		accountList = al;
		
		setTitle("Statistics");
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 768, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Past Month's Records");
		titleLabel.setForeground(new Color(25, 25, 112));
		titleLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		titleLabel.setBounds(10, 11, 359, 37);
		contentPane.add(titleLabel);
		
		JButton backButton = new JButton("Back to Main Menu");
		/*
		 * Back Button Action Listener
		 */
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctrl.openMainFrame();
				setVisible(false);
				dispose();
			}
		});
		backButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		backButton.setBounds(10, 538, 134, 23);
		contentPane.add(backButton);
		
		JButton printButton = new JButton("Print");
		/*
		 * Print Button Action Listener
		 */
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		printButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		printButton.setBounds(663, 539, 89, 23);
		contentPane.add(printButton);
		
		JLabel cardioLabel = new JLabel("Cardio Workout");
		cardioLabel.setForeground(new Color(25, 25, 112));
		cardioLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		cardioLabel.setBounds(10, 59, 121, 23);
		contentPane.add(cardioLabel);
		
		Canvas cardioCanvas = new Canvas();
		cardioCanvas.setBackground(new Color(230, 230, 250));
		cardioCanvas.setBounds(10, 88, 168, 122);
		contentPane.add(cardioCanvas);
		
		Canvas strengthCanvas = new Canvas();
		strengthCanvas.setBackground(new Color(230, 230, 250));
		strengthCanvas.setBounds(205, 88, 168, 122);
		contentPane.add(strengthCanvas);
		
		Canvas workCanvas = new Canvas();
		workCanvas.setBackground(new Color(230, 230, 250));
		workCanvas.setBounds(395, 88, 168, 122);
		contentPane.add(workCanvas);
		
		Canvas sleepCanvas = new Canvas();
		sleepCanvas.setBackground(new Color(230, 230, 250));
		sleepCanvas.setBounds(584, 88, 168, 122);
		contentPane.add(sleepCanvas);
		
		Canvas bloodPressureCanvas = new Canvas();
		bloodPressureCanvas.setBackground(new Color(230, 230, 250));
		bloodPressureCanvas.setBounds(10, 248, 168, 122);
		contentPane.add(bloodPressureCanvas);
		
		Canvas bloodSugarCanvas = new Canvas();
		bloodSugarCanvas.setBackground(new Color(230, 230, 250));
		bloodSugarCanvas.setBounds(205, 248, 168, 122);
		contentPane.add(bloodSugarCanvas);
		
		Canvas pulseRateCanvas = new Canvas();
		pulseRateCanvas.setBackground(new Color(230, 230, 250));
		pulseRateCanvas.setBounds(395, 248, 168, 122);
		contentPane.add(pulseRateCanvas);
		
		Canvas weightCanvas = new Canvas();
		weightCanvas.setBackground(new Color(230, 230, 250));
		weightCanvas.setBounds(584, 248, 168, 122);
		contentPane.add(weightCanvas);
		
		Canvas caloriesCanvas = new Canvas();
		caloriesCanvas.setBackground(new Color(230, 230, 250));
		caloriesCanvas.setBounds(10, 404, 168, 122);
		contentPane.add(caloriesCanvas);
		
		JLabel strengthLabel = new JLabel("Strength Workout");
		strengthLabel.setForeground(new Color(25, 25, 112));
		strengthLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		strengthLabel.setBounds(205, 59, 129, 23);
		contentPane.add(strengthLabel);
		
		JLabel workLabel = new JLabel("Work Hours");
		workLabel.setForeground(new Color(25, 25, 112));
		workLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		workLabel.setBounds(395, 59, 121, 23);
		contentPane.add(workLabel);
		
		JLabel sleepLabel = new JLabel("Sleep Hours");
		sleepLabel.setForeground(new Color(25, 25, 112));
		sleepLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		sleepLabel.setBounds(584, 59, 121, 23);
		contentPane.add(sleepLabel);
		
		JLabel bloodPressureLabel = new JLabel("Blood Pressure");
		bloodPressureLabel.setForeground(new Color(25, 25, 112));
		bloodPressureLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		bloodPressureLabel.setBounds(10, 219, 121, 23);
		contentPane.add(bloodPressureLabel);
		
		JLabel bloodSugarLabel = new JLabel("Blood Sugar");
		bloodSugarLabel.setForeground(new Color(25, 25, 112));
		bloodSugarLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		bloodSugarLabel.setBounds(205, 219, 121, 23);
		contentPane.add(bloodSugarLabel);
		
		JLabel pulseRateLabel = new JLabel("Pulse Rate");
		pulseRateLabel.setForeground(new Color(25, 25, 112));
		pulseRateLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		pulseRateLabel.setBounds(395, 219, 121, 23);
		contentPane.add(pulseRateLabel);
		
		JLabel weightLabel = new JLabel("Weight");
		weightLabel.setForeground(new Color(25, 25, 112));
		weightLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		weightLabel.setBounds(584, 219, 121, 23);
		contentPane.add(weightLabel);
		
		JLabel caloriesLabel = new JLabel("Calories");
		caloriesLabel.setForeground(new Color(25, 25, 112));
		caloriesLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		caloriesLabel.setBounds(10, 376, 121, 23);
		contentPane.add(caloriesLabel);
		
		Canvas scoreCanvas = new Canvas();
		scoreCanvas.setBounds(205, 438, 457, 88);
		contentPane.add(scoreCanvas);
		
		JLabel scoreLabel = new JLabel("Health Score:");
		scoreLabel.setForeground(new Color(25, 25, 112));
		scoreLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		scoreLabel.setBounds(205, 404, 129, 28);
		contentPane.add(scoreLabel);
	}
}
