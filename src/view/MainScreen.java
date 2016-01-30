package view;

import java.awt.Font;
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
import javax.swing.SwingConstants;

public class MainScreen {

	private JFrame frame;
    private JPanel window;
    private JLabel title;
    private JLabel logo;
    private JButton start;

	public MainScreen() {
		frame = new JFrame();
        frame.setTitle("OEC | 2016 | PROGRAMMING | KUDO");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        window = new JPanel();
        
        title = new JLabel("Welcome to K\u00dcDO! ");
        title.setBounds(0, 0, 800, 106);
        Font titleFont = title.getFont();
        String titleText = title.getText();

        int stringWidth = title.getFontMetrics(titleFont).stringWidth(titleText);
        int componentWidth = title.getWidth();

        // Find out how much the font can grow in width.
        double widthRatio = (double)componentWidth / (double)stringWidth;

        int newFontSize = (int)(titleFont.getSize() * widthRatio);
        int componentHeight = title.getHeight();

        // Pick a new font size so it will not be larger than the height of title.
        int fontSizeToUse = Math.min(newFontSize, componentHeight);

        // Set the title's font size to the newly determined size.
        title.setFont(new Font(titleFont.getName(), Font.PLAIN, fontSizeToUse));
		title.setHorizontalAlignment(SwingConstants.CENTER);
        
//        BufferedImage logoPicture = null;
//		try {
//			logoPicture = ImageIO.read(new File("pics/logo.png"));
//		} catch (IOException e) { e.printStackTrace(); }
//        logo = new JLabel(new ImageIcon(logoPicture));
//        logo.setBounds(12, 102, 776, 360);

        start = new JButton("Start");
        start.setBounds(260, 474, 275, 86);
        start.addActionListener(e -> { nextWindow(); });
        window.setLayout(null);

        window.add(title);
//        window.add(logo);
        window.add(start);
        
        frame.getContentPane().add(window);

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
