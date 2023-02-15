package swing05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Win extends JFrame {
	JButton jb1 = new JButton("모두 검색");
	JButton jb2 = new JButton("상세 검색");
	JTextField tf = new JTextField(4);
	JTextArea ta = new JTextArea(7, 20);
	Win() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(jb1);
		jp1.add(tf);
		jp1.add(jb2);
		c.add(jp1, BorderLayout.NORTH);
		c.add(ta, BorderLayout.CENTER);
		this.setSize(400, 300);
		this.setLocation(500, 500);
		this.setVisible(true);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArticleDao dao = new ArticleDao();
				
				List<Article> list = dao.selectAll();
				for(Article art : list) {
					ta.append(art+"\n");
//					System.out.println(art);
				}
				
			}
			
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb2.setEnabled(false);
				JFrame fr = new JFrame("상세 검색");
				JButton jb = new JButton("닫기");
				Container c = fr.getContentPane();
				c.setLayout(new BorderLayout());
				JPanel jp = new JPanel(new FlowLayout());
				jp.add(jb);
				c.add(jp, BorderLayout.SOUTH);
				fr.setSize(300, 400);
				fr.setLocation(600, 500);
				fr.setVisible(true);
				
				jb.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						fr.setVisible(false);
						jb2.setEnabled(true);
						
					}
					
				});
			}
			
		});
	}
	public static void main(String[] args) {
		new Win();

	}

}