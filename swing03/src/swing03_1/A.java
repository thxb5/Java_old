package swing03_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import swing03.WinEx;

public class A extends JFrame {
	
	JTextField jb1 = new JTextField("15");
	A(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		c.add(jp1, BorderLayout.CENTER);
		jp1.add(jb1);
		jb1.setSize(600,400);
		
		this.setLocation(500, 600);
		this.setSize(400,300);
		this.setVisible(true);
	}
	
	public static void main(String[]args) {
		new A();
	}
}
