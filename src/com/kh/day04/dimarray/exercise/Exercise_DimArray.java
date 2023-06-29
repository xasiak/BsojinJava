package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1()
	{
		int [][] arrs = new int[5][5];


		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 4; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
	}
	
	public void exercise2()
	{
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}	
		}
			
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
		
	}
	
	public void exercise3()
	{
		int [][] arrs = new int[5][5];
		
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
	}
	
	public void exercise4()
	{
		int [][] arrs = new int[5][5];
		
		int k = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 != 0) {
				for(int j = arrs[i].length - 1; j >= 0; j--) {
					arrs[i][j] = k;
					k++;	
				}
			}else {
				for(int j = 0; j <= 4; j++ ) {
					arrs[i][j] = k;
					k++;
				}
			}
		}
		
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
	}
	public void exercise5()
	{
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0},{4.1, 4.2}};
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
		double sum = 0;
		for(int k = 0; k < score.length; k++) {
			for(int h = 0; h < score[k].length; h++) {
				System.out.printf("%.1f ", score[k][h]);
				sum += score[k][h];
			}
			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);
	}
	
	
}
