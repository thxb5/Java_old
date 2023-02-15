package swing03_1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;

import java.awt.BorderLayout;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;




public class panel2 extends JFrame implements ActionListener {
	
	
	
	
	private JFrame frame;
	private JTree tree;
	private JTextComponent jtf;
	private Object request;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel2 window = new panel2();
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
	public panel2() {
		initialize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame
		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//1번 panel
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//3번pannel
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_2.setBounds(0, 143, 1000, 439);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		//카테고리 Label
		JLabel lblNewLabel_1 = new JLabel("카테고리");
		lblNewLabel_1.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(135, 163, 85, 32);
		panel_2.add(lblNewLabel_1);
		
		//등록하기 버튼
//		JButton Button = new JButton("등록하기");
//		Button.setFont(new Font("한컴 고딕", Font.PLAIN, 14));
//		Button.setBounds(853, 363, 97, 49);
//		panel_2.add(Button);
//		Button.addActionListener(this);
		
		
		
		
		
		//대분류 체크박스
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panel_3.setBounds(34, 205, 140, 207);
			panel_2.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("대분류");
			lblNewLabel_2.setFont(new Font("한컴 고딕", Font.PLAIN, 17));
			lblNewLabel_2.setBounds(12, 10, 57, 15);
			panel_3.add(lblNewLabel_2);
			
			JCheckBox CheckBox = new JCheckBox("여성의류");
			CheckBox.setBounds(8, 73, 115, 23);
			panel_3.add(CheckBox);
			
			JCheckBox CheckBox2 = new JCheckBox("패션잡화");
			CheckBox2.setBounds(8, 98, 115, 23);
			panel_3.add(CheckBox2);
			
			JCheckBox CheckBox_1 = new JCheckBox("남성의류");
			CheckBox_1.setBounds(8, 48, 115, 23);
			panel_3.add(CheckBox_1);
			
			//중분류 체크박스
			
			JPanel panel_3_1 = new JPanel();
			panel_3_1.setLayout(null);
			panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panel_3_1.setBounds(186, 205, 146, 207);
			panel_2.add(panel_3_1);
			
			
			JLabel lblNewLabel_2_1 = new JLabel("중분류");
			lblNewLabel_2_1.setFont(new Font("한컴 고딕", Font.PLAIN, 17));
			lblNewLabel_2_1.setBounds(8, 10, 57, 15);
			panel_3_1.add(lblNewLabel_2_1);
			
			JCheckBox CheckBox3 = new JCheckBox("아우터");
			CheckBox3.setBounds(8, 66, 115, 23);
			panel_3_1.add(CheckBox3);
			
			JCheckBox CheckBox4 = new JCheckBox("상의");
			CheckBox4.setBounds(8, 91, 115, 23);
			panel_3_1.add(CheckBox4);
			
			JCheckBox CheckBox5 = new JCheckBox("하의");
			CheckBox5.setBounds(8, 116, 115, 23);
			panel_3_1.add(CheckBox5);
			
			JCheckBox CheckBox6 = new JCheckBox("가방");
			CheckBox6.setBounds(8, 41, 115, 23);
			panel_3_1.add(CheckBox6);
			
			JCheckBox CheckBox7 = new JCheckBox("신발");
			CheckBox7.setBounds(8, 141, 115, 23);
			panel_3_1.add(CheckBox7);
			
	
			//수령방법
			JPanel panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panel_4.setBounds(385, 205, 129, 207);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel lblNewLabel_3 = new JLabel("수령방법");
			lblNewLabel_3.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
			lblNewLabel_3.setBounds(404, 169, 80, 20);
			panel_2.add(lblNewLabel_3);
			
			JCheckBox CheckBox8 = new JCheckBox("직거래");
			CheckBox8.setBounds(8, 71, 115, 23);
			panel_4.add(CheckBox8);
			
			JCheckBox CheckBox9 = new JCheckBox("택배");
			CheckBox9.setBounds(8, 96, 115, 23);
			panel_4.add(CheckBox9);
			
			JLabel lblNewLabel_3_1 = new JLabel("제품상태");
			lblNewLabel_3_1.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
			lblNewLabel_3_1.setBounds(639, 163, 80, 32);
			panel_2.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel = new JLabel("제목\r\n");
			lblNewLabel.setFont(new Font("한컴 고딕", Font.PLAIN, 20));
			lblNewLabel.setBounds(78, 80, 57, 32);
			panel_2.add(lblNewLabel);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("한컴 고딕", Font.PLAIN, 15));
			textField_1.setBounds(153, 79, 611, 32);
			panel_2.add(textField_1);
			textField_1.setColumns(10);
			
			textField = new JTextField();
			textField.setBounds(599, 205, 165, 207);
			panel_2.add(textField);
			textField.setColumns(10);
			
			
			
		}
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 int amount = 0;
		 String msg ="";
		 
		
	}
}
		
		


