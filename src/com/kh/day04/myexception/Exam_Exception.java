package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.print("정수 하나 입력 : ");
			int input2 = sc.nextInt();
			System.out.println("나눠드릴게요 ^ v ^. 조금만 기다리세요~");
			int result = input1 / input2;
			System.out.printf("몫은 %d입니다", result);
		}catch(ArithmeticException e)
		{
			System.out.println("이런이런 0으로 나누려고 하시네요??");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
