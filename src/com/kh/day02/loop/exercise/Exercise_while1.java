package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_while1 {
	public static void main(String [] args) 
	{
	// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
	// 입력한 수의 합을 출력하시오.
	// 정수 하나 입력 : 3
	// 정수 하나 입력 : 4
	// 정수 하나 입력 : 7
	// 정수 하나 입력 : -1
	// 입력하신 수의 합은 14입니다.
	

		

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		// for(;;) {} 무한반복
		// 첫번째 방법
//		while(true)//무한반복
//			{
//			System.out.print("정수 하나 입력 : ");
//			i = sc.nextInt();
//			if(i != -1) {
//				sum += i;
//			}else {
//				break;
//			}
//		}
//		System.out.println("입력하신 수의 합은 : " + sum);
		
		//두번째 방법
//		while(i != -1) {
//			System.out.print("정수 하나 입력 : ");
//			i = sc.nextInt();	
//			sum += i;
//		}
//		System.out.println(sum+1);
//		
		// 세번째 방법
		System.out.print("정수 하나 입력 : ");
		i = sc.nextInt();
		while(i != -1) {
			sum += i;
			System.out.print("정수 하나 입력 : ");
			i = sc.nextInt();	
		}
		System.out.println(sum);
	}
}
