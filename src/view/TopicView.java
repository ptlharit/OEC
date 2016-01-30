package view;

import java.awt.Color;
import java.awt.EventQueue;
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
		frame.setTitle("OEC | 2016 | PROGRAMMING | KUDO");
		frame.setSize(800, 600);

		window = new JPanel(new GridLayout(5, 1));

		title = new JLabel(createImageIcon ("topics.png"));

		Variable_button = new JButton(createImageIcon ("variables.png"));
		Variable_button.addActionListener(e -> { openStory(1); });

		Condition_button = new JButton(createImageIcon ("conditions.png"));
		Condition_button.addActionListener(e ->{ openStory(2); });

		Loops_button = new JButton(createImageIcon ("loops.png"));
		Loops_button.addActionListener(e -> { openStory(3);} );

		Sub_button = new JButton(createImageIcon ("subroutines.png"));
		Sub_button.addActionListener(e -> { openStory(4);} );

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

	private void openStory(int module) {
		frame.dispose();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryView frame = new StoryView(module);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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

}
