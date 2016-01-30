package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameView {
	
	private JFrame frame;
	private JPanel window;

	private String title;
	private JLabel titleLabel;
	
	private JTextField story;
	
	private JPanel leftPanel;
	private JPanel rightPanel;
	
	private JLabel picture;
	
	private JTextField question;
	private JTextField console;
	
	private JButton backButton;
	
	private int slideNumber;
	private String slideNumberMessage;
	private JLabel slideNumberLabel;
	
	private JButton nextButton;
	
	public GameView() {
		frame = new JFrame();
        frame.setTitle("Ontario Engineering Competition | 2016 | Programming");
        frame.setSize(800, 600);
		
		window = new JPanel(new BorderLayout());
		
		title = "Variables 1";
		titleLabel = new JLabel(title);
		story = new JTextField();
		
		window.add(titleLabel, BorderLayout.NORTH);
		window.add(story, BorderLayout.CENTER);
		
		leftPanel = new JPanel();
		
        BufferedImage pic = null;
		try {
			pic = ImageIO.read(new File("pics/logo.png"));
		} catch (IOException e) { e.printStackTrace(); }
        picture = new JLabel(new ImageIcon(pic));

        leftPanel.add(picture);
        
        rightPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        
        question = new JTextField();
        console = new JTextField();
        
        rightPanel.add(question);
        rightPanel.add(console);
        
        JPanel middlePanel = new JPanel(new GridLayout(1, 2, 10, 10));
        middlePanel.add(picture); 
        middlePanel.add(rightPanel);
        
        window.add(middlePanel);
        
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3, 20, 20));
        
        backButton = new JButton("<<");
        
        slideNumberMessage = "Slide 1 of 1";
        slideNumberLabel = new JLabel(slideNumberMessage);
        
        nextButton = new JButton(">>");
        
        bottomPanel.add(backButton);
        bottomPanel.add(slideNumberLabel);
        bottomPanel.add(nextButton);
        
        window.add(bottomPanel);
		
        frame.add(window);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	public static void main(String args[]) {
		GameView gv = new GameView();
	}

}
