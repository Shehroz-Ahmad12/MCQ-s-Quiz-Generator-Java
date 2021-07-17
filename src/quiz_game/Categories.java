package quiz_game;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Categories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categories frame = new Categories();
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
	public Categories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("History");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				History obj3 = new History();
				obj3.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnNewButton.setBounds(172, 78, 133, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Geography");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Geography obj4 = new Geography();
				obj4.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton_1.setBounds(172, 141, 133, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Technology");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Technology obj5 =new Technology();
				obj5.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnNewButton_2.setBounds(172, 201, 133, 41);
		contentPane.add(btnNewButton_2);
		
		JLabel lblChooseACategory = new JLabel("Choose a Category");
		lblChooseACategory.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		lblChooseACategory.setBounds(144, 11, 195, 56);
		contentPane.add(lblChooseACategory);
		
		JButton btnLogout = new JButton("Back");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartPanel obj7 = new StartPanel();
				obj7.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Arial", Font.PLAIN, 13));
		btnLogout.setBounds(172, 262, 133, 41);
		contentPane.add(btnLogout);
	}	
}
