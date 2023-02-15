package jdbc03;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx extends JFrame implements ActionListener {
	JButton sel = new JButton("검색");
	JButton del = new JButton("삭제");
	
	
	SwingEx(){
		
		Container con = this.getContentPane();
		sel.setBounds(50,50,80,50);
		del.setBounds(150,50,80,50);
		con.setLayout(null);
		con.add(sel);
		sel.addActionListener(this);
		con.add(del);
		del.addActionListener(this);
		this.setLayout(null);
		this.setLocation(300,500);
		this.setSize(400,300);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new SwingEx();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sel) {
			System.out.println("sel버튼 클릭");
			
		}else if(e.getSource()==del){
			System.out.println("del버튼 클릭");
		}
		
	}

}
