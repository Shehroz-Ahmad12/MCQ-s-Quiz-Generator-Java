package quiz_game;
//Note: If code does not run, Please move 3 pictures from bin folder to folder "quiz_game" right next to it
// The working is same in other two categories just different questions and different theme
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Timer;

public class History extends JFrame {
	JLabel questionLabel;
	JRadioButton option1;
	JRadioButton option2;
	JRadioButton option3;
	JRadioButton option4;
	JLabel scoreLabel;
	Timer timer;
	String[] ques= {"2. When Rome was founded?", "3. How old is Indus Valler Civilization?","4. World War I commenced in?","5. The Great Pyramid of Giza was built for which Egyptian ruler?","6. Xerxes ruled a great empire around the fifth century BC. Which empire?","7. Who became president after the assassination of Abraham Lincoln?","8. What nationality was Karl Marx?","9. Who invented the thermometer in 1593?","10. Who was the first president of United States?"};
	String[][] answers = {{"300 BC","790 BC","753 BC","869 BC"},{"5000 BC","8000 BC","2000 BC","1600 BC"},{"1918","1857","1914","1939"},{"Cheops","Remisis","Anubis","Ozymandias"},{"Greek Empire","Persian Empire","Roman Empire","Ottomon Empire"},{"George Washington","Ezio Audotore","Andrew Johnson","William Johnson"},{"Russian","German","Soviet","English"},{"Newton","Einstein","Galelio","Al-Khwarizmi"},{"Abraham Lincoln","John Adams","George Washington","Ben Franklin"}};
	String[] correctAns = {"753 BC","5000 BC","1914","Cheops","Persian Empire","Andrew Johnson","German","Galelio","George Washington"};
	
	int questionCount=-1;
	int answerCount1=0;
	int answerCount2=0;
	int correctAnsCount=0;
	int ScoreCount=0;
	int progressBarCount=0;
	int totalScore=ques.length+1;
	String correctAnswer="1971"; //initialize with first correct answer
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
					History frame = new History();
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
	public History() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel picture = new JLabel("");
		picture.setBounds(218, 100, 276, 154);
		contentPane.add(picture);
		Image image =new ImageIcon(this.getClass().getResource("history.jpg")).getImage();
		picture.setIcon(new ImageIcon(image));
		
		JLabel questionLabel = new JLabel("1. In which year Bangladesh was formed as Separate Country?");
		questionLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		questionLabel.setBounds(35, 50, 422, 39);
		contentPane.add(questionLabel);
		
		JRadioButton option1 = new JRadioButton("1947");
		option1.setBackground(new Color(255, 255, 102));
		option1.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		buttonGroup.add(option1);
		option1.setBounds(35, 125, 165, 23);
		contentPane.add(option1);
		
		JRadioButton option2 = new JRadioButton("2000");
		option2.setBackground(new Color(255, 255, 102));
		option2.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		buttonGroup.add(option2);
		option2.setBounds(35, 151, 165, 23);
		contentPane.add(option2);
		
		JRadioButton option3 = new JRadioButton("1900");
		option3.setBackground(new Color(255, 255, 102));
		option3.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		buttonGroup.add(option3);
		option3.setBounds(35, 177, 165, 23);
		contentPane.add(option3);
		
		JRadioButton option4 = new JRadioButton("1971");
		option4.setBackground(new Color(255, 255, 102));
		option4.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		buttonGroup.add(option4);
		option4.setBounds(35, 203, 165, 23);
		contentPane.add(option4);
		
		JLabel lblMin = new JLabel("05");
		lblMin.setFont(new Font("Kristen ITC", Font.BOLD, 12));
		lblMin.setBounds(381, 16, 26, 23);
		contentPane.add(lblMin);
		
		JLabel dot = new JLabel(":");
		dot.setFont(new Font("Kristen ITC", Font.BOLD, 12));
		dot.setBounds(401, 17, 14, 23);
		contentPane.add(dot);
		
		JLabel lblSec = new JLabel("00");
		lblSec.setFont(new Font("Kristen ITC", Font.BOLD, 12));
		lblSec.setBounds(409, 16, 26, 23);
		contentPane.add(lblSec);
		
		
		
		JLabel scoreLabel = new JLabel("Score:" + ScoreCount + "/" + totalScore);
		scoreLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		scoreLabel.setBounds(35, 16, 84, 23);
		contentPane.add(scoreLabel);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Kristen ITC", Font.BOLD, 16));
		lblHistory.setBounds(200, 13, 69, 24);
		contentPane.add(lblHistory);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(progressBarCount);
		progressBar.setMaximum(ques.length+1);
		progressBar.setForeground(new Color(51, 51, 255));
		progressBar.setBackground(new Color(255, 255, 153));
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
		submitButton.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				option1Text=option1.getText();	//Getting text from radio buttons
				option2Text=option2.getText();
				option3Text=option3.getText();
				option4Text=option4.getText();
				
						
				if((option1.isSelected())) {			//Condition to check which option is selected
					if (option1Text==correctAnswer) {			//Condition to check if selected option is right option
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
				
				
				answerCount2=0;		//setting second index zero after ever options because of 2d list
				scoreLabel.setText("Score:" + ScoreCount + "/" + totalScore);
				questionCount++;
				progressBar.setValue(progressBarCount);
				if (questionCount+1==totalScore) {		//Condition to check questions
					JOptionPane.showMessageDialog(null,"Your score is "+ ScoreCount + " out of " + totalScore);
					timer.stop();
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
					
				}
				
			}
		});
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
		btnBack.setFont(new Font("Kristen ITC", Font.PLAIN, 12));
		btnBack.setBounds(10, 289, 69, 31);
		contentPane.add(btnBack);
		
		
	
	
	}
}
