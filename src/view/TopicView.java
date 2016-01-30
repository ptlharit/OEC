package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopicView {
	
	private JFrame frame;
	
	private JPanel window;
	
	private JLabel title;
	
	private JButton temp;

	public TopicView() {
		frame = new JFrame();
        frame.setTitle("Ontario Engineering Competition | 2016 | Programming");
        frame.setSize(800, 600);
		
		window = new JPanel(new GridLayout(2, 1, 10, 10));
		
		title = new JLabel("Choose a Topic!");
		
		temp = new JButton("click me");
		temp.addActionListener(e -> { nextWindow(); });
		
		window.add(title);
		window.add(temp);
		
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
	
	public static void main(String args[]) {
		TopicView tv = new TopicView();
	}

}
