package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		//This method must return a result of type int 리턴 없을 때 오류
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		int i = 20;
		int s;
		char a;
		
		a = '?';
		s = sum(i,10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}
//주석 단축키 : ctrl+shift+c
