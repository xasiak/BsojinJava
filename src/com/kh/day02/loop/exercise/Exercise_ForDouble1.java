package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		// 구구단 출력
		for (int k = 1; k < 10; k++) {
			for(int h = 2; h <10; h++) {
				System.out.print(h + " * " + k + " = " + k*h + "\t");
			}
			System.out.println();
		}
	}
}
