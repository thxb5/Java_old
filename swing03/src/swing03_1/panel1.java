package swing03_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class panel1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel1 window = new panel1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public panel1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 143, 1000, 439);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(75, 53, 135, 108);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("상품정보");
		panel_1.add(lblNewLabel, "name");
		
		JButton btnNewButton = new JButton("정확도순");
		btnNewButton.setBounds(665, 10, 88, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("최신순");
		btnNewButton_1.setBounds(753, 10, 74, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("저가순");
		btnNewButton_2.setBounds(827, 10, 75, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("고가순");
		btnNewButton_3.setBounds(902, 10, 74, 23);
		panel.add(btnNewButton_3);
	}
}
