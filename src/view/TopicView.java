package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TopicView {

	private JFrame frame;

	private JPanel window;

	private JLabel title;

	private JButton Variable_button, Condition_button, Loops_button, Sub_button;

	public TopicView() {
		frame = new JFrame();
		frame.setTitle("Ontario Engineering Competition | 2016 | Programming");
		frame.setSize(800, 600);

		window = new JPanel(new GridLayout(5, 1));

		
		title = new JLabel(createImageIcon ("topics.png"));

		Variable_button = new JButton("Variables");
		Variable_button.addActionListener(e -> { nextWindow(); });

		Condition_button = new JButton("Conditions");

		Loops_button = new JButton("Loops");

		Sub_button = new JButton("Subroutines");

		window.add(title);
		window.add(Variable_button);
		window.add(Condition_button);
		window.add(Loops_button);
		window.add(Sub_button);

		frame.add(window);

		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void nextWindow() {
		frame.dispose();
		@SuppressWarnings("unused")
		GameView gv = new GameView();
	}
	
	protected static ImageIcon createImageIcon (String path)
    { //createImageIcon method begins
        java.net.URL imgURL = TopicView.class.getResource (path);
        if (imgURL != null) //If loop if the image is found
        { //begins if loop
            return new ImageIcon (imgURL); //Returns the image that is found
        } //ends if loop
        else
        { //Begins else loop
            System.err.println ("Couldn't find file: " + path); //Prints an error message
            return null; //returns nothing
        } //Ends else loop
    } //createImageIcon method ends

	public static void main(String args[]) {
		TopicView tv = new TopicView();
	}

}
