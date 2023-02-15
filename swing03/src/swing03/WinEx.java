package swing03;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinEx extends JFrame {
   
   JButton jb1 = new JButton("1");
   JButton jb2 = new JButton("2");
   JButton jb3 = new JButton("3");
   JButton jb4 = new JButton("4");
   JButton jb5 = new JButton("5");
   JButton jb6 = new JButton("6");
   JButton jb7 = new JButton("7");
   JButton jb8 = new JButton("8");
   JButton jb11 = new JButton("1");
   JButton jb12 = new JButton("2");
   JButton jb13 = new JButton("3");
   JButton jb14 = new JButton("4");
   JButton jb15 = new JButton("5");
   JButton jb16 = new JButton("6");
   JButton jb17 = new JButton("7");
   JButton jb18 = new JButton("8");
   
   public WinEx() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //대문자로 되어있으면 상수. 종료버튼
      Container c = this.getContentPane();
      JPanel jp1 = new JPanel();
      jp1.setLayout(new FlowLayout(FlowLayout.LEFT, 15,15));
      c.add(jp1, BorderLayout.NORTH); // BorderLayout.NORTH east west south north 사용가능.
      jp1.add(jb1);
      jp1.add(jb2);
      jp1.add(jb3);
      jp1.add(jb4);
      jp1.add(jb5);
      jp1.add(jb6);
      jp1.add(jb7);
      jp1.add(jb8);
      JPanel jp2 = new JPanel();
      jp2.setLayout(new GridLayout(4,2,10,10));
      jp2.add(jb11);
      jp2.add(jb12);
      jp2.add(jb13);
      jp2.add(jb14);
      jp2.add(jb15);
      jp2.add(jb16);
      jp2.add(jb17);
      jp2.add(jb18);
      
      c.add(jp2, BorderLayout.CENTER);
      this.setLocation(500, 600);
      this.setSize(400, 300);
      this.setVisible(true);
   }

   public static void main(String[] args) {
      new WinEx();

   }

}