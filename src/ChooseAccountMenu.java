import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ChooseAccountMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseAccountMenu frame = new ChooseAccountMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChooseAccountMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 180);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose Your Account");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 11, 274, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Choose Account");
		btnNewButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 112, 119, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Account");
		btnNewButton_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		btnNewButton_1.setBounds(139, 112, 119, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create Account");
		btnNewButton_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		btnNewButton_2.setBounds(268, 113, 119, 23);
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(20);
		comboBox.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		comboBox.setBounds(10, 73, 274, 20);
		contentPane.add(comboBox);
		
	}
}
