package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import model.Conditional;
import model.Loop;
import model.Subroutine;
import model.Variable;

public class StoryView extends JFrame {

	private JPanel contentPane;
	private JLabel moduleLabel;
	private JTextArea story;
	private JTextPane picture;
	private JTextArea question;
	private JTextField console;
	private JLabel slideLabel;
	
	private int module;
	
	private String titleText = "Title";
	private String storyText = "";
	private String picturePath = "pics/logo.png";
	private String questionText = "";
	
	private int slideNumber = 1;
	private String slideLabelText = "Slide";
	
	private String[] values = { titleText, storyText, picturePath, questionText, slideLabelText };

	public StoryView(int m) {
		module = m;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("K\u00dcDO - The Interactive Programming Story Book" );
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 876, 132);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		story = new JTextArea();
		panel.add(story, BorderLayout.CENTER);
		
		moduleLabel = new JLabel(titleText);
		moduleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(moduleLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 154, 863, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		picture = new JTextPane();
		picture.insertIcon ( new ImageIcon(picturePath));
		picture.setBounds(12, 12, 287, 304);
		panel_1.add(picture);
		
		console = new JTextField();
		console.setBounds(327, 145, 524, 171);
		panel_1.add(console);
		console.setColumns(10);
		
		question = new JTextArea();
		question.setBounds(327, 12, 524, 88);
		panel_1.add(question);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 482, 863, 78);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton backButton = new JButton("<<");
		backButton.setBounds(100, 25, 146, 41);
		panel_2.add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});

		JButton nextButton = new JButton(">>");
		nextButton.setBounds(664, 25, 149, 41);
		panel_2.add(nextButton);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next();
			}
		});
		
		slideLabel = new JLabel(slideLabelText);
		slideLabel.setBounds(419, 38, 70, 15);
		panel_2.add(slideLabel);
	}
	
	private void back() {
		values = Controller.next(module, slideNumber-2);
		if (values.length == 2) {
			this.dispose();
			TopicView tv = new TopicView();
			return;
		}
		slideNumber--;
		update();
	}
	
	private void next() {

		values = Controller.next(module, slideNumber);
		
		if (values.length == 1) {
			// YOURE DONE POP UP
			this.dispose();
			TopicView tv = new TopicView();
			return;
		} else if (values.length == 2) {
			this.dispose();
			TopicView tv = new TopicView();
			return;
		}
		
		slideNumber++;
		update();
		
		boolean correctAns = Controller.checkAns(console.getText(), module, slideNumber);
		Random rand = new Random();
		int randInt = rand.nextInt(9);
		String congratulationMSG = "";
		
		//random messages to mix it up
		switch (randInt){
			case 1: congratulationMSG = "Good Job!"; break;
			case 2: congratulationMSG = "Nice Work!"; break;
			case 3: congratulationMSG = "Awesome!"; break;
			case 4: congratulationMSG = "You're doing great!"; break;
			case 5: congratulationMSG = "Wow, amazing!"; break;
			case 6: congratulationMSG = "Keep up the good work!"; break;
			case 7: congratulationMSG = "Somebody deserves a sticker!"; break;
			case 8: congratulationMSG = "You're a star!"; break;
			case 9: congratulationMSG = "Terrific!"; break;
		}
		
		if (correctAns){
			ImageIcon icon = new ImageIcon("pics/yay.png"); //credit to http://www.clipartden.com/freeclipart/education/school/awards_10057.html
			JOptionPane.showMessageDialog(this, congratulationMSG, "You got it!", JOptionPane.INFORMATION_MESSAGE,icon);
			//array = Controller.next(num, slidenum);
			update();
		}else {
			JOptionPane.showMessageDialog(this, "Oops, try again. \nRemember to check the hint.", "Sorry, that's not it.", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void update() {
		moduleLabel.setText(values[0]);
		story.setText(values[1]);
		picture.insertIcon(new ImageIcon(values[2]));
		question.setText(values[3]);
		slideLabel.setText(values[4]);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryView frame = new StoryView(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
