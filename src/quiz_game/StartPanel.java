package quiz_game;
//Note: If code does not run, Please move 3 pictures from bin folder to folder "quiz_game" right next to it
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StartPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPanel frame = new StartPanel();
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
	public StartPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Semester Project");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Leelawadee UI", Font.PLAIN, 16));
		lblNewLabel.setBounds(156, 11, 171, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblQuizGameApplication = new JLabel("Quiz Game Application");
		lblQuizGameApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuizGameApplication.setFont(new Font("Leelawadee", Font.PLAIN, 20));
		lblQuizGameApplication.setBounds(124, 80, 247, 65);
		contentPane.add(lblQuizGameApplication);
		
		JLabel lblCreditsShehrozAhmad = new JLabel("Credits: Shehroz Ahmad");
		lblCreditsShehrozAhmad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreditsShehrozAhmad.setFont(new Font("Leelawadee UI", Font.PLAIN, 12));
		lblCreditsShehrozAhmad.setBounds(146, 276, 195, 44);
		contentPane.add(lblCreditsShehrozAhmad);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categories obj1= new Categories();
				obj1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Leelawadee UI", Font.PLAIN, 15));
		btnNewButton.setBounds(156, 187, 152, 50);
		contentPane.add(btnNewButton);
	}

}
