package quiz_game;
//Note: If code does not run, Please move 3 pictures from bin folder to folder "quiz_game" right next to it
import java.awt.BorderLayout;
import javax.swing.Timer;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Technology extends JFrame {
	JLabel questionLabel;
	JRadioButton option1;
	JRadioButton option2;
	JRadioButton option3;
	JRadioButton option4;
	JLabel scoreLabel;
	Timer timer;
	
	String[] ques= {"2. Who is largely responsible for breaking the German Enigma codes?", "3. 'DB' computer abbreviation usually means ?","4. When was Internet created?","5. First Russian Satellite sent into space is?","6. Who is the father of electricity?","7. Who invented SpaceX?","8. Edward Salk developed a vaccine against what?","9. What nationality of plane first broke the 100mph sound barrier?","10. Who was the first Nobel Prize winner to come from Pakistan?"};
	String[][] answers = {{"Ricardo Milos","Bill Gates","Alan Turing","Charles Babbage"},{"Data Base","Data Baking","Data Block","Double Byte"},{"1969","1991","1971","1983"},{"Sputnik","Christopher","Apollo","Tars"},{"Newton","Nicola Tesla","Edison","Franklin"},{"Elon Musk","Mark Zuckerberg","Marques Brownlee","Dave Lee"},{"Measles","Typhoid","Polio","Diarrhea"},{"French","English","German","Austria"},{"Malala Yousfzai","Abdus Salam","Abdus Sattar Edhi","Nawaz Sharif"}};
	String[] correctAns = {"Alan Turing","Data Base","1983","Sputnik","Edison","Elon Musk","Polio","French","Abdus Salam"};
	
	int questionCount=-1;
	int answerCount1=0;
	int answerCount2=0;
	int correctAnsCount=0;
	int ScoreCount=0;
	int progressBarCount=0;
	int totalScore=ques.length+1;
	String correctAnswer="Operating System";		//initialize with first correct ans
	String option1Text;
	String option2Text;
	String option3Text;
	String option4Text;
	JLabel lblMin;
	JLabel lblSec;
	JProgressBar progressBar;

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Technology frame = new Technology();
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
	public Technology() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel picture = new JLabel("");
		picture.setBounds(218, 100, 276, 154);
		contentPane.add(picture);
		Image image =new ImageIcon(this.getClass().getResource("tech.jpg")).getImage();
		picture.setIcon(new ImageIcon(image));
		
		JLabel questionLabel = new JLabel("1. 'OS' computer abbreviation usually means ?");
		questionLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		questionLabel.setBounds(35, 50, 422, 39);
		contentPane.add(questionLabel);
		
		JRadioButton option1 = new JRadioButton("Operating System");
		option1.setBackground(new Color(102, 204, 153));
		option1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		buttonGroup.add(option1);
		option1.setBounds(35, 125, 165, 23);
		contentPane.add(option1);
		
		JRadioButton option2 = new JRadioButton("Optical Sensor");
		option2.setBackground(new Color(102, 204, 153));
		option2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		buttonGroup.add(option2);
		option2.setBounds(35, 151, 165, 23);
		contentPane.add(option2);
		
		JRadioButton option3 = new JRadioButton("Orange Soda");
		option3.setBackground(new Color(102, 204, 153));
		option3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		buttonGroup.add(option3);
		option3.setBounds(35, 177, 165, 23);
		contentPane.add(option3);
		
		JRadioButton option4 = new JRadioButton("Open Software");
		option4.setBackground(new Color(102, 204, 153));
		option4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		buttonGroup.add(option4);
		option4.setBounds(35, 203, 165, 23);
		contentPane.add(option4);
		
		JLabel lblMin = new JLabel("05");
		lblMin.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblMin.setBounds(381, 16, 26, 23);
		contentPane.add(lblMin);
		
		JLabel dot = new JLabel(":");
		dot.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		dot.setBounds(401, 17, 14, 23);
		contentPane.add(dot);
		
		JLabel lblSec = new JLabel("00");
		lblSec.setFont(new Font("Microsoft YaHei", Font.BOLD, 12));
		lblSec.setBounds(409, 16, 26, 23);
		contentPane.add(lblSec);
		
		JLabel scoreLabel = new JLabel("Score:" + ScoreCount + "/" + totalScore);
		scoreLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		scoreLabel.setBounds(35, 16, 84, 23);
		contentPane.add(scoreLabel);
		
		JLabel lblHistory = new JLabel("Technology");
		lblHistory.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		lblHistory.setBounds(200, 13, 100, 24);
		contentPane.add(lblHistory);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(progressBarCount);
		progressBar.setMaximum(ques.length+1);
		progressBar.setForeground(new Color(102, 102, 255));
		progressBar.setBackground(new Color(102, 204, 204));
		progressBar.setBounds(35, 264, 422, 14);
		contentPane.add(progressBar);

		
		timer =new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int min = Integer.parseInt(lblMin.getText());
				int sec= Integer.parseInt(lblSec.getText());
				
				if (sec==0) {
					sec = 60;
					min--;
				}
				if (min<0) {
					timer.stop();
					JOptionPane.showMessageDialog(null, "Times Up");
					JOptionPane.showMessageDialog(null,"Your score is "+ ScoreCount + " out of " + totalScore);
					Categories obj6 = new Categories();
					obj6.setVisible(true);
					dispose();
					min=0;
					sec=0;
					
				}
				sec--;
				
				lblMin.setText("0"+min);
				lblSec.setText(""+sec);
			}
		});
		timer.start();
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				progressBar.setValue(progressBarCount);
				
				option1Text=option1.getText();
				option2Text=option2.getText();
				option3Text=option3.getText();
				option4Text=option4.getText();
				
						
				if((option1.isSelected())) {			//Condition to check which option is selected
					if (option1Text==correctAnswer) {		
						JOptionPane.showMessageDialog(null, "Correct Answer");
						ScoreCount++;		
						progressBarCount++;
					}
					
					else{
						JOptionPane.showMessageDialog(null, "Wrong Answer! The correct answer was "+correctAnswer);				
						progressBarCount++;
					}	}
					
				else if((option2.isSelected())) {
					if (option2Text==correctAnswer) {
						JOptionPane.showMessageDialog(null, "Correct Answer");
						ScoreCount++;
						progressBarCount++;
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Wrong Answer! The correct answer was "+correctAnswer);
						progressBarCount++;
					}	}
					
				else if((option3.isSelected())) {
					if (option3Text==correctAnswer) {
						JOptionPane.showMessageDialog(null, "Correct Answer");
						ScoreCount++;
						progressBarCount++;
					}
				
					else{
						JOptionPane.showMessageDialog(null, "Wrong Answer! The correct answer was "+correctAnswer);
						progressBarCount++;
					}		}
					
					
				else if((option4.isSelected())) {
					if (option4Text==correctAnswer) {
						JOptionPane.showMessageDialog(null, "Correct Answer");
						ScoreCount++;
						progressBarCount++;
						}
					
					
					else {
						JOptionPane.showMessageDialog(null, "Wrong Answer! The correct answer was "+correctAnswer);
						progressBarCount++;
					}						}
					
				else {
					JOptionPane.showMessageDialog(null, "Please Select an Option");
					return;
				}
				
				
				answerCount2=0;		//setting second index zero after ever options
				scoreLabel.setText("Score:" + ScoreCount + "/" + totalScore);
				questionCount++;
				progressBar.setValue(progressBarCount);
				if (questionCount+1==totalScore) {		//Condition to check questions
					JOptionPane.showMessageDialog(null,"Your score is "+ ScoreCount + " out of " + totalScore);
					Categories obj6 = new Categories();
					obj6.setVisible(true);
					dispose();
					}
				else {
				questionLabel.setText(ques[questionCount]);			//Setting next question					
					
				option1.setText(answers[answerCount1][answerCount2]);		//Setting Options
				answerCount2++;
				option2.setText(answers[answerCount1][answerCount2]);
				answerCount2++;
				option3.setText(answers[answerCount1][answerCount2]);
				answerCount2++;
				option4.setText(answers[answerCount1][answerCount2]);
				correctAnswer=correctAns[correctAnsCount];						//setting correct answer
				correctAnsCount++;												//Increment in indexes
				answerCount1++;		
			}}
		});
		submitButton.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		submitButton.setBounds(175, 289, 112, 31);
		contentPane.add(submitButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Categories backb =new Categories();
				timer.stop();
				backb.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		btnBack.setBounds(10, 289, 69, 31);
		contentPane.add(btnBack);
	}
	}


