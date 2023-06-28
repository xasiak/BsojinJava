package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical {
	public static void main(String [] args) throws Exception
	{
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		
		System.out.println("입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result;
		result = (num >=1) && (num <=100);
		System.out.println("1부터 100사이의 숫자인가? : " + result);
		
		
	}
}
