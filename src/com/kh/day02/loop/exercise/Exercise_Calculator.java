package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args)
	{
		int count = 0;
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력: ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 하나 더 입력: ");
			int num2 = sc.nextInt();
			
			System.out.print("연산자 입력(+, -, *, /, %): ");
			char operator = sc.next().charAt(0);
			
			int result = 0;
			switch(operator){
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			}
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
			count++;
			if(count == 3) break;
		}
	}
}
