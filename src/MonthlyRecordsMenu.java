//Name: MonthlyRecordsMenu
//Description: Defines the JFrame for the monthly records menu.

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import org.jfree.chart.ChartPanel;

import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.*;
import javax.swing.SwingConstants;



public class MonthlyRecordsMenu extends JFrame {

	private JPanel contentPane;
	private FrameController ctrl = null;
	private UserAccountList accountList = null;
	
	/**
	 * Create the frame.
	 */
	public MonthlyRecordsMenu(FrameController fc, UserAccountList al) {
		ctrl = fc;
		accountList = al;
		
		GraphMonthly graphs = new GraphMonthly(al.getCurrentAccount().getDailyRecords());
		MonthlyRecord averages = new MonthlyRecord(al.getCurrentAccount().getDailyRecords());
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
		
		setTitle("Statistics");
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 768, 655);
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
		backButton.setBounds(10, 593, 134, 23);
		contentPane.add(backButton);
		
		
		
		JLabel cardioLabel = new JLabel("Cardio Workout");
		cardioLabel.setForeground(new Color(25, 25, 112));
		cardioLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		cardioLabel.setBounds(10, 59, 121, 23);
		contentPane.add(cardioLabel);
		
		ChartPanel cardioGraph = graphs.cardioGraph();
		cardioGraph.setBounds(10, 88, 168, 122);
		contentPane.add(cardioGraph);
		
		ChartPanel strengthGraph = graphs.strengthGraph();
		strengthGraph.setBounds(205, 88, 168, 122);
		contentPane.add(strengthGraph);
		
		ChartPanel workGraph = graphs.workGraph();
		workGraph.setBounds(395, 88, 168, 122);
		contentPane.add(workGraph);
		
		ChartPanel sleepGraph = graphs.sleepGraph();
		sleepGraph.setBounds(584, 88, 168, 122);
		contentPane.add(sleepGraph);
		
		ChartPanel bloodPressureGraph = graphs.bloodPressureGraph();
		bloodPressureGraph.setBounds(10, 248, 168, 122);
		contentPane.add(bloodPressureGraph);
		
		ChartPanel bloodSugarGraph = graphs.bloodSugarGraph();
		bloodSugarGraph.setBounds(205, 248, 168, 122);
		contentPane.add(bloodSugarGraph);
		
		ChartPanel pulseRateGraph = graphs.pulseGraph();
		pulseRateGraph.setBounds(395, 248, 168, 122);
		contentPane.add(pulseRateGraph);
		
		ChartPanel weightGraph = graphs.weightGraph();
		weightGraph.setBounds(584, 248, 168, 122);
		contentPane.add(weightGraph);
		
		ChartPanel caloriesGraph = graphs.calorieGraph();
		caloriesGraph.setBounds(10, 404, 168, 122);
		contentPane.add(caloriesGraph);
		
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
		
		JPanel averagePanel = new JPanel();
		averagePanel.setBounds(205, 404, 457, 95);
		contentPane.add(averagePanel);
		
		JLabel cardioAverageLabel = new JLabel (averages.cardioAverage());
		cardioAverageLabel.setBorder(border);
		cardioAverageLabel.setForeground(new Color(25, 25, 112));
		cardioAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(cardioAverageLabel);
		
		JLabel strengthAverageLabel = new JLabel (averages.strengthAverage());
		strengthAverageLabel.setBorder(border);
		strengthAverageLabel.setForeground(new Color(25, 25, 112));
		strengthAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(strengthAverageLabel);
		
		JLabel workAverageLabel = new JLabel (averages.workAverage());
		workAverageLabel.setBorder(border);
		workAverageLabel.setForeground(new Color(25, 25, 112));
		workAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(workAverageLabel);
		
		JLabel sleepAverageLabel = new JLabel (averages.sleepAverage());
		sleepAverageLabel.setBorder(border);
		sleepAverageLabel.setForeground(new Color(25, 25, 112));
		sleepAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(sleepAverageLabel);
		
		
		JLabel systolicBPAverageLabel = new JLabel (averages.systolicAverage());
		systolicBPAverageLabel.setBorder(border);
		systolicBPAverageLabel.setForeground(new Color(25, 25, 112));
		systolicBPAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(systolicBPAverageLabel);
		
		JLabel diastolicBPAverageLabel = new JLabel (averages.diastolicAverage());
		diastolicBPAverageLabel.setBorder(border);
		diastolicBPAverageLabel.setForeground(new Color(25, 25, 112));
		diastolicBPAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(diastolicBPAverageLabel);
		
		
		JLabel bloodSugarAverageLabel = new JLabel (averages.bloodSugarAverage());
		bloodSugarAverageLabel.setBorder(border);
		bloodSugarAverageLabel.setForeground(new Color(25, 25, 112));
		bloodSugarAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(bloodSugarAverageLabel);
		
		JLabel pulseAverageLabel = new JLabel (averages.pulseAverage());
		pulseAverageLabel.setBorder(border);
		pulseAverageLabel.setForeground(new Color(25, 25, 112));
		pulseAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(pulseAverageLabel);
		
		JLabel weightAverageLabel = new JLabel (averages.weightAverage());
		weightAverageLabel.setBorder(border);
		weightAverageLabel.setForeground(new Color(25, 25, 112));
		weightAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(weightAverageLabel);
		
		JLabel caloriesAverageLabel = new JLabel (averages.caloriesAverage());
		caloriesAverageLabel.setBorder(border);
		caloriesAverageLabel.setForeground(new Color(25, 25, 112));
		caloriesAverageLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		averagePanel.add(caloriesAverageLabel);
	
		
		
		JLabel scoreLabel = new JLabel("Health Metric Averages:");
		scoreLabel.setForeground(new Color(25, 25, 112));
		scoreLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		scoreLabel.setBounds(205, 370, 350, 28);
		contentPane.add(scoreLabel);
		
		
		
		JButton printButton = new JButton("Print");
		/*
		 * Print Button Action Listener
		 */
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(new Printable() {

                    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                        if (pageIndex >= 1) {
                            return Printable.NO_SUCH_PAGE;
                        } else {
                            Graphics2D g2d = (Graphics2D) graphics;
                            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                            g2d.scale(0.7, 0.7);
                            g2d.setPaint(Color.black);
                            contentPane.print(graphics);
                            return Printable.PAGE_EXISTS;
                        }
                    }
                });
                boolean ok = job.printDialog();
                try {
                    job.print();
                    String PrintedStatus = "Confirmation was Successfully Printed on your Default Printer";
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                    String PrintedStatus = "Print failed";
                }
			}
               
        });
		printButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		printButton.setBounds(663, 593, 89, 23);
		contentPane.add(printButton);
		
		JLabel lblDoctorAddress = new JLabel("Doctor Address:");
		lblDoctorAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorAddress.setForeground(new Color(25, 25, 112));
		lblDoctorAddress.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblDoctorAddress.setBounds(10, 539, 96, 16);
		contentPane.add(lblDoctorAddress);
		
		JLabel lblDoctorEmail = new JLabel("Doctor Email:");
		lblDoctorEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorEmail.setForeground(new Color(25, 25, 112));
		lblDoctorEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblDoctorEmail.setBounds(10, 552, 96, 16);
		contentPane.add(lblDoctorEmail);
		
		JLabel lblDoctorPhone = new JLabel("Doctor Phone:");
		lblDoctorPhone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorPhone.setForeground(new Color(25, 25, 112));
		lblDoctorPhone.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblDoctorPhone.setBounds(10, 566, 96, 16);
		contentPane.add(lblDoctorPhone);
		
		JLabel lblDoctorName = new JLabel("Doctor Name:");
		lblDoctorName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorName.setForeground(new Color(25, 25, 112));
		lblDoctorName.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblDoctorName.setBounds(10, 525, 96, 16);
		contentPane.add(lblDoctorName);
		
		JLabel label = new JLabel(accountList.getCurrentAccount().getDoctor().getFirstName() + " " + accountList.getCurrentAccount().getDoctor().getLastName());
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label.setBounds(110, 525, 259, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(accountList.getCurrentAccount().getDoctor().getAddress());
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(25, 25, 112));
		label_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_1.setBounds(110, 539, 259, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(accountList.getCurrentAccount().getDoctor().getEmail());
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(new Color(25, 25, 112));
		label_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_2.setBounds(110, 552, 259, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(accountList.getCurrentAccount().getDoctor().getPhoneNumber());
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(new Color(25, 25, 112));
		label_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_3.setBounds(110, 566, 259, 16);
		contentPane.add(label_3);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientName.setForeground(new Color(25, 25, 112));
		lblPatientName.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPatientName.setBounds(379, 525, 96, 16);
		contentPane.add(lblPatientName);
		
		JLabel lblPatientAge = new JLabel("Patient Age:");
		lblPatientAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientAge.setForeground(new Color(25, 25, 112));
		lblPatientAge.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPatientAge.setBounds(379, 539, 96, 16);
		contentPane.add(lblPatientAge);
		
		JLabel lblPatientHeight = new JLabel("Patient Height:");
		lblPatientHeight.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientHeight.setForeground(new Color(25, 25, 112));
		lblPatientHeight.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPatientHeight.setBounds(379, 552, 96, 16);
		contentPane.add(lblPatientHeight);
		
		JLabel lblPatientGender = new JLabel("Patient Gender:");
		lblPatientGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPatientGender.setForeground(new Color(25, 25, 112));
		lblPatientGender.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPatientGender.setBounds(379, 566, 96, 16);
		contentPane.add(lblPatientGender);
		
		JLabel label_4 = new JLabel(accountList.getCurrentAccount().getFirstName() + " " + accountList.getCurrentAccount().getLastName());
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(new Color(25, 25, 112));
		label_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_4.setBounds(477, 525, 228, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(Integer.toString(accountList.getCurrentAccount().getAge()) + " years");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(new Color(25, 25, 112));
		label_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_5.setBounds(477, 539, 228, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel(Integer.toString(accountList.getCurrentAccount().getHeight()) + " inches");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(new Color(25, 25, 112));
		label_6.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_6.setBounds(477, 552, 228, 16);
		contentPane.add(label_6);
		
		JLabel label_7;
		if (accountList.getCurrentAccount().getGender())
		{
			label_7 = new JLabel("Female");			
		}
		else
		{
			label_7 = new JLabel("Male");			
		}
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(new Color(25, 25, 112));
		label_7.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_7.setBounds(477, 566, 228, 16);
		contentPane.add(label_7);
	}
}
