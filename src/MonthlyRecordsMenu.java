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
                            g2d.scale(0.5, 0.5);
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
		printButton.setBounds(663, 539, 89, 23);
		contentPane.add(printButton);
	}
	
	
}
