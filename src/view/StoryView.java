package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	private int module;
	
	private Variable variable;
	private Conditional conditional;
	private Loop loop;
	private Subroutine subroutine;
	
	private String titleText = "Title";
	private String storyText = "";
	private String picturePath = "pics/logo.png";
	private String questionText = "";
	
	private int slideNumber = 0;
	private String slideLabelText = "Slide";
	
	public StoryView(int m) {
		module = m;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("OEC | 2016 | PROGRAMMING");
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 876, 132);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea story = new JTextArea();
		panel.add(story, BorderLayout.CENTER);
		
		JLabel moduleLabel = new JLabel(titleText);
		moduleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(moduleLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 154, 863, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane picture = new JTextPane();
		picture.insertIcon ( new ImageIcon(picturePath));
		picture.setBounds(12, 12, 287, 304);
		panel_1.add(picture);
		
		JTextField console = new JTextField();
		console.setBounds(327, 145, 524, 171);
		panel_1.add(console);
		console.setColumns(10);
		
		JTextArea question = new JTextArea();
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
		
		JLabel slideLabel = new JLabel(slideLabelText);
		slideLabel.setBounds(419, 38, 70, 15);
		panel_2.add(slideLabel);
	}
	
	private void back() {
		
	}
	
	private void next() {
		check = Controller.check();
		array = Controller.next(num, slidenum);
		update();
	}
	
	private void update() {
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryView frame = new StoryView(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
