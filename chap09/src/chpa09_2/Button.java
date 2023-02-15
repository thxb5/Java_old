package chpa09_2;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Button extends JButton{
	OnClickListner listner;
	JLabel lb = new JLabel("여기에");
	Button(String str,Container c){
		super(str);
		this.setBounds(100,30,80,50);
		lb.setBounds(100,200,80,50);
		c.add(lb);
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner=listner;
	}
	
	void touch() {
		lb.setText(listner.onClick());
	}
	
	interface OnClickListner{
		String onClick();
	}
}
