package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args)
	{
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
