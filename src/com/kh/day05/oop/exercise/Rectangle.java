package com.kh.day05.oop.exercise;

import java.util.Scanner;

import com.kh.day05.oop.Circle;

public class Rectangle {
//	너비와 높이를 입력 받아 사각형의 넓이 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	// ================================> 필드
	public int width;
	public int height;
	
	// ================================> 생성자 
	// 생성자 특징
	// 목적 : 객체를 초기화함(값을 넣어줌). 
	// 반환형이 없고 클래스명과 같음
	// 기본생성자는 생략 가능
	// 매개변수 있으면 생략 불가능
	
	public Rectangle() { 
		// 초기화
		width = 0;
		height = 0;
	}
	
	// ================================> 메소드
	public int getArea() { 
		return width*height;
	}
	
}
