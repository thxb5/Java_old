package swing04;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

interface ActionListener {
   public void actionPerformed(ActionEvent e);
}

public class Team extends JFrame {
   private JFrame frame;
   private JTextField textField;
   private String value;
   
   //번개장터 로고 버튼
   ImageIcon icon = new ImageIcon("C:\\\\_dev\\\\JAVA1212\\\\src\\\\swing/Logo.jpg");
   Image img = icon.getImage();
   Image imgChange = img.getScaledInstance(180, 60, Image.SCALE_SMOOTH);
   ImageIcon updateIcon = new ImageIcon(imgChange);
   
   //검색바 돋보기 버튼
   ImageIcon icon2 = new ImageIcon("C:\\\\_dev\\\\JAVA1212\\\\src\\\\swing/Icon.png");
   Image img2 = icon2.getImage();
   Image imgChange2 = img2.getScaledInstance(28, 23, Image.SCALE_SMOOTH);
   ImageIcon updateIcon2 = new ImageIcon(imgChange2);
   
   //메인 메소드
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Team window = new Team();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   //생성자 메소드
   public Team() {
      initialize();
   }
   
   //실행 메소드
   private void initialize() {
      //프레임
      frame = new JFrame();
      frame.setBounds(100, 100, 1012, 680);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      //상단 패널
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 1000, 109);
      frame.getContentPane().add(panel);
      
      
      //번개장터 로고 버튼 + 메인페이지 이동
      JButton bt1 = new JButton(updateIcon);
      bt1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
         }
      });
      bt1.setBorderPainted(false);
      bt1.setBounds(12, 10, 180, 60);
      panel.add(bt1);
      panel.setLayout(null);
      
      //검색바
      textField = new JTextField("  검색");
      textField.addFocusListener(new FocusListener() {

         @Override
         public void focusGained(FocusEvent e) {
            textField.setText("");
            value = textField.getText();
         }

         @Override
         public void focusLost(FocusEvent e) {
            
         }
      });
      textField.setBounds(234, 25, 333, 34);
      textField.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
      panel.add(textField);
      textField.setColumns(10);
      
      //상단 우측 버튼들
      JButton btnNewButton = new JButton("로그아웃");
      btnNewButton.setBounds(887, 23, 85, 42);
      panel.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("내 상점");
      btnNewButton_1.setBounds(790, 24, 85, 42);
      panel.add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("판매하기");
      btnNewButton_2.setBounds(693, 24, 85, 42);
      panel.add(btnNewButton_2);
      
      //돋보기 버튼
      JButton bt2 = new JButton(updateIcon2);
      bt2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
         }
      });
      bt2.setBounds(574, 30, 28, 23);
      panel.add(bt2);
   }

   
}