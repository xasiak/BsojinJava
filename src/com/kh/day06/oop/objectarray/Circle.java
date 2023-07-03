package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {  // 자료형 쓸 때 return필요
		double area = 3.14*radius*radius;
		return area;
	}
}
