package view;

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

public class MainScreen {

	private JFrame frame;
    private JPanel window;
    private JLabel title;
    private JLabel logo;
    private JButton start;

	public MainScreen() {
		frame = new JFrame();
        frame.setTitle("Ontario Engineering Competition | 2016 | Programming");
        frame.setSize(800, 600);
        
        window = new JPanel(new GridLayout(3, 1, 10, 10));
        
        title = new JLabel("Welcome to APP_NAME_HERE!");
        
        BufferedImage logoPicture = null;
		try {
			logoPicture = ImageIO.read(new File("pics/logo.png"));
		} catch (IOException e) { e.printStackTrace(); }
        logo = new JLabel(new ImageIcon(logoPicture));

        start = new JButton("Start");
        start.addActionListener(e -> { nextWindow(); });

        window.add(title);
        window.add(logo);
        window.add(start);
        
        frame.add(window);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	private void nextWindow() {
		frame.dispose();
		@SuppressWarnings("unused")
		TopicView tv = new TopicView();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MainScreen ms = new MainScreen();
	}
}
