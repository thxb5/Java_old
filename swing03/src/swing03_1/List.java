package swing03_1;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List extends JFrame implements ListSelectionListener {
	JList<String> list;
	JList<String> sublist1;
	JList<String> sublist2;
	JList<String> sublist3;

	JPanel allPanel = new JPanel();
	JPanel leftPanel = new JPanel(); // 왼쪽패널
	JPanel rightPanel = new JPanel(); // 오른쪽 패널

	List() {
		setLocation(500, 300);
		setSize(500, 700);
		Container cont = this.getContentPane();

		cont.add(allPanel);

		allPanel.setLayout(new BorderLayout());
		allPanel.add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); // 왼쪽(고정) 패널의 레이아웃 설정
		allPanel.add(rightPanel, BorderLayout.EAST);

		JLabel label;
		String[] s = { "1", "2", "3", "4" };
		list = new JList<String>(s);
		label = new JLabel("");
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		leftPanel.add(list);

		JLabel label1;
		String[] s2 = { "가", "나", "다", "라" };
		sublist1 = new JList<String>(s2);
		label1 = new JLabel("");
		sublist1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sublist1.addListSelectionListener(this);

		JLabel label2;
		String[] s3 = { "a", "b", "c", "d" };
		sublist2 = new JList<String>(s3);
		label2 = new JLabel("");
		sublist2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sublist2.addListSelectionListener(this);

		JLabel label3;
		String[] s4 = { "김", "이", "박", "최" };
		sublist3 = new JList<String>(s4);
		label3 = new JLabel("");
		sublist3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		sublist3.addListSelectionListener(this);

		leftPanel.add(list);
		rightPanel.add(sublist1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new List();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) { // 리스트 누를 때 이벤트.
		if (list.getSelectedIndex() == 0) {
			sublist2.setVisible(false);
			sublist3.setVisible(false);
			sublist1.setVisible(true);
		} else if (list.getSelectedIndex() == 1) {
			sublist1.setVisible(false);
			sublist3.setVisible(false);
			rightPanel.add(sublist2);
			sublist2.setVisible(true);
		} else if (list.getSelectedIndex() == 2) {
			sublist1.setVisible(false);
			sublist2.setVisible(false);
			rightPanel.add(sublist3);
			sublist3.setVisible(true);
		} else if (list.getSelectedIndex() == 3) {
		}
	}

}

