package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;


public class Page2 extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;
	private JCheckBox checkBox5;
	private JCheckBox checkBox6;
	private JCheckBox checkBox7;
	private JCheckBox checkBox8;
	private JCheckBox checkBox9;
	private JCheckBox checkBox10;
	
	private JRadioButton radio1;
	private JRadioButton radio2;
	
	private String value;
	


///////

	public static void main(String[]args) throws InvocationTargetException, InterruptedException  {
		
			EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					try {
						Page2 frame = new Page2();
						frame.setVisible(true);
					}
					catch(Exception e) {
						e.printStackTrace();
				}
			}
		});
	}
		
		
	
////////
	public Page2() {
		run();
	}
	
	private void run() {
		
	     
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100,100,1000,800);
		
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("등록하기");
		
		button.addActionListener(new ActionListener() {
			String str = "";
			
			public void actionPerformed(ActionEvent e) {
			
				 JFrame jFrame = new JFrame();
			     JOptionPane.showMessageDialog(jFrame, "상품등록완료");
			     
				
			}
			
		});
		
		 JButton bt1 = new JButton();
	      bt1.addActionListener(new java.awt.event.ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	         }
	      });
	      bt1.setBorderPainted(false);
	      bt1.setBounds(12, 10, 180, 60);
//	      panel4.add(bt1);
//	      panel4.setLayout(null);
	      
	      //검색바
	      textField3 = new JTextField("  검색");
	      textField3.addFocusListener(new FocusListener() {

	         @Override
	         public void focusGained(FocusEvent e) {
	            textField3.setText("");
	            value = textField3.getText();
	         }

	         @Override
	         public void focusLost(FocusEvent e) {
	            
	         }
	      });
	      textField3.setBounds(234, 25, 333, 34);
	      textField3.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
//	      panel4.add(textField3);
	      textField3.setColumns(10);
	      
	      //상단 우측 버튼들
	      JButton btnNewButton = new JButton("로그아웃");
	      btnNewButton.setBounds(887, 23, 85, 42);
//	      panel4.add(btnNewButton);
	      
	      JButton btnNewButton_1 = new JButton("내 상점");
	      btnNewButton_1.setBounds(790, 24, 85, 42);
//	      panel4.add(btnNewButton_1);
	      
	      JButton btnNewButton_2 = new JButton("판매하기");
	      btnNewButton_2.setBounds(693, 24, 85, 42);
//	      panel4.add(btnNewButton_2);
	      
	      //돋보기 버튼
	      JButton bt2 = new JButton();
	      bt2.addActionListener(new java.awt.event.ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	         }
	      });
		
		
		
			button.setBounds(850, 650, 97, 55);
			contentPane.add(button);
			
			
			
			 JPanel panel4 = new JPanel();
		     panel4.setBounds(0, 0, 1000, 109);
		     contentPane.add(panel4);
		     panel4.add(textField3);
		     panel4.add(btnNewButton);
		     panel4.add(btnNewButton_1);
		     panel4.add(btnNewButton_2);
		     panel4.add(bt1);
		     panel4.setLayout(null);
		     bt2.setBounds(574, 30, 28, 23);
		     panel4.add(bt2);
		     
		     
			//////////대분류////////////
		     
		     
		    
			JPanel panel =new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
					"대분류",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,0,0)));
			
			
			panel.setBounds(50, 400, 200, 200);
			contentPane.add(panel);
			
			checkBox1 = new JCheckBox("여성의류");
			panel.add(checkBox1);
			
			checkBox2 = new JCheckBox("남성의류");
			panel.add(checkBox2);
			
			checkBox3 = new JCheckBox("패션잡화");
			panel.add(checkBox3);
			
			checkBox4 = new JCheckBox("가전&가구");
			panel.add(checkBox4);
			
			
			///////////중분류///////////
			JPanel panel2 =new JPanel();
			panel2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
					"중분류",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,0,0)));
			
			
			panel2.setBounds(300, 400, 200, 200);
			contentPane.add(panel2);
			
			checkBox5 = new JCheckBox("상의");
			panel2.add(checkBox5);
			
			checkBox6 = new JCheckBox("하의");
			panel2.add(checkBox6);
			
			checkBox7 = new JCheckBox("가방");
			panel2.add(checkBox7);
			
			checkBox8 = new JCheckBox("신발");
			panel2.add(checkBox8);
			
			checkBox9 = new JCheckBox("TV");
			panel2.add(checkBox9);
			
			checkBox10 = new JCheckBox("침대");
			panel2.add(checkBox10);
			
			/////////////수령방법//////////
			
			JPanel panel3 =new JPanel();
			panel3.setBorder(new TitledBorder(null,"수령방법",TitledBorder.LEADING,
					TitledBorder.TOP,null,null));
			
			
			panel3.setBounds(550, 400, 200, 200);
			contentPane.add(panel3);
			
			radio1 = new JRadioButton("직거래");
			panel3.add(radio1);
			
			radio2 = new JRadioButton("택배거래");
			panel3.add(radio2);
			
			
			textField1 = new JTextField();
			textField1.setBorder(new TitledBorder(null,"제목",TitledBorder.LEADING,TitledBorder.TOP,null,null));
			textField1.setBounds(55, 350, 418, 45);
			
			contentPane.add(textField1);
			textField1.setColumns(10);
			
			
			textField2 = new JTextField();
			textField2.setBorder(new TitledBorder(null,"상품상세정보",TitledBorder.LEADING,TitledBorder.TOP,null,null));
			textField2.setBounds(55, 610, 600, 140);
			
			contentPane.add(textField2);
			textField2.setColumns(10);
			
		
		
	       
			    
		
			
			
	}
	
}
	
	
	
	
