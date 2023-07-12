package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	public Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 실제로 종료하도록 함. 그전엔 안보이게만 했음.
		
		Container contentPane = getContentPane(); // 참조변수 만들어줌
		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle")); 
		contentPane.add(new JButton("Ignore")); // 겹쳐져서 처음 만든 버튼 안 보임
		
		
		setSize(00,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_ContentPane(); // 실행하기 위해서는 클래스에 객체로 만들어야 함.
	}
}
