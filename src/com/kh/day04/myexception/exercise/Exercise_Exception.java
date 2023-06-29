package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!" 를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		
		Scanner sc = new Scanner(System.in);
		
		// 무한루트 방법
		// for(;;) {}
		// while(true) {}
		
		while(true) {
			// 1. num1 cannot be resolved to a variable
//			int num1, num2;
			// 2. The local variable num1 may not have been initialized
//			num1 = 0;
//			num2 = 0;
			//멀티캐치절
			try{
				System.out.print("정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2; // 예외가 발생하는 부분만 try안에 있어도 됨
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n", num1, num2, result);		
			}catch(ArithmeticException e) {  //ArithmeticException e(변수 써줘야함)
				System.out.println("0으로 나눌 수 없습니다!");
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				sc.next(); // 무한반복 없앨 수 있음
			}
		}
	}
	
	public void practice2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를
		// 처리하여 다시 입력받도록 하여라.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 입력 : ");
				int num2 = sc.nextInt();
				System.out.print("정수 하나 입력 : ");
				int num3 = sc.nextInt();
				int result = num1 + num2 + num3;
				System.out.printf("%d, %d, %d를 더하면 %d입니다.\n", num1, num2, num3, result);
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요!");
				sc.next();
			}
		}
		
	}
}
