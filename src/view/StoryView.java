package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StoryView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoryView frame = new StoryView();
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
	public StoryView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("");
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 876, 132);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, BorderLayout.CENTER);
		
		JLabel lblModule = new JLabel("Module: ");
		lblModule.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblModule, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 154, 863, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(12, 12, 287, 304);
		panel_1.add(textArea_1);
		
		textField = new JTextField();
		textField.setBounds(327, 145, 524, 171);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(327, 12, 524, 88);
		panel_1.add(textArea_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 482, 863, 78);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(100, 25, 146, 41);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setBounds(664, 25, 149, 41);
		panel_2.add(btnNewButton_1);
		
		JLabel lblSlide = new JLabel("Slide");
		lblSlide.setBounds(419, 38, 70, 15);
		panel_2.add(lblSlide);
	}
}
