package quiz_game;
//Note: I made login page just for general purpose
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;



public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel.setBounds(56, 60, 97, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(56, 123, 97, 32);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Leelawadee UI", Font.PLAIN, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String password =new String(passwordField.getPassword());
				if (username.matches("admin") && password.matches("admin")) {
				Categories obj2 =new Categories();
				obj2.setVisible(true);
				dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
			}
		});
		btnLogin.setBounds(175, 221, 130, 44);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(148, 67, 244, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 130, 244, 25);
		contentPane.add(passwordField);
	}
}
