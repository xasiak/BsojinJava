package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1()
	{
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + 1;
			
			if (i <= 9) {
				// +
				System.out.print(i + "+");
			}else {
				// =
				System.out.print(i);
			}
		}
		System.out.println("=" + sum);
	}
	
	public void exercise2()
	
		{
			// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
			// 그 수의 구구단을 출력하세요.
			// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >=1 && num <=9) {
			System.out.println(num + "단");
			for(int i = 1; i < 10; i++ ) {
				System.out.println(num + "x" + i + "=" +num * i);
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
		}
		}
	
	public void forDoubleExercise1 () {
		// 구구단 출력
				for (int k = 1; k < 10; k++) {
					for(int h = 2; h <10; h++) {
						System.out.print(h + " * " + k + " = " + k*h + "\t");
					}
					System.out.println();
				}
	}
	
	
	public void forDoubleExercise2 () {
		for(int h = 0; h <= 24; h++) {
			for(int s = 0; s<=60; s++) {
				System.out.printf("%2d시 %2d분\n", h, s);
			}
		}
	}
	
	
	public void forDoubleExercise3 () {
		int count = 1;
		for(int i = 0; i < 10; i++) {
			for(int k = 1; k < i+1; k++) {
				System.out.print("*");
			}
			count++;
			System.out.println( );
		}
	}
	
	
}

