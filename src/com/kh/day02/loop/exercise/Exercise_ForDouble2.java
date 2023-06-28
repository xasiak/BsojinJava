package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		for(int h = 0; h <= 24; h++) {
			for(int s = 0; s<=60; s++) {
				System.out.printf("%2d시 %2d분\n", h, s);
			}
		}
	}
}
