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
		setTitle("Choose an Account");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton chooseButton = new JButton("Choose Account");
		chooseButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		chooseButton.setBounds(10, 112, 119, 23);
		contentPane.add(chooseButton);
		
		JButton deleteButton = new JButton("Delete Account");
		deleteButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		deleteButton.setBounds(139, 112, 119, 23);
		contentPane.add(deleteButton);
		
		JButton createButton = new JButton("Create Account");
		createButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		createButton.setBounds(268, 113, 119, 23);
		contentPane.add(createButton);
		
		JComboBox accountListComboBox = new JComboBox();
		accountListComboBox.setMaximumRowCount(20);
		accountListComboBox.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		accountListComboBox.setBounds(10, 73, 274, 20);
		contentPane.add(accountListComboBox);
		
	}
}
