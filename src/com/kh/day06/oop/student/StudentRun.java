package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Student [] stds = new Student[2];
		// 학생 성적 확인 프로그램
		// 1. 학생 성적 입력
		// 2. 학생 성적 출력
		// 3. 재평가 여부 확인
		// 4. 프로그램 종료
		// 메뉴입력 : 4
		
		// 1. 선택시
		// 1번째 학생 정보 입력
		// 학생 이름 입력 : 일용자
		// 1차 점수 입력 : 60
		// 2차 점수 입력 : 55
		// => 한명씩 입력받도록 하거나
		// 2명 한꺼번에 입력받도록 하세요
		
		// 2. 선택시 
		// 1번째 학생 정보 출력
		// 일용자 학생의 점수는
		// 1차 점수 : 60, 2차 점수 : 55 입니다.
		
		// 3. 선택시
		// 1번째 일용자 학생의 확인결과
		// 통과했습니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 2차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		// 2차 시험 재평가 대상자입니다.
		
		// 4. 선택시 
		// 프로그램이 종료되었습니다.
		
		// 재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
		// 	  과목은 재평가를 본다.
		finish : 
		while(true) {
			int choice = printMenu();
			
			switch(choice) {
			case 1 : 
				inputScore(stds); 
				break;
			case 2 : 
				printScore(stds);
				break;
			case 3 : 
				check(stds);
				break;
			case 4 : 
				bye();
				break finish;
			}
		}
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 학생 성적 확인 프로그램 ====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}

	
	public static void inputScore(Student[] stds) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stds.length; i++) {
			stds[i] = new Student();
			System.out.println(i+1 + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			stds[i].setName(name);
			System.out.print("1차 점수 입력 : ");
			int score1 = sc.nextInt();
			stds[i].setScore1(score1);
			System.out.print("2차 점수 입력 : ");
			int score2 = sc.nextInt();
			stds[i].setScore2(score2);
		}
	}
	
	public static void printScore(Student[] stds) {
		System.out.println("==== 성적출력 ====");
		for(int i = 0; i < stds.length; i++) {
			System.out.printf("%s학생의 점수는 1차 점수 : %d   2차 점수 : %d입니다.\n" , stds[i].getName(), stds[i].getScore1(), stds[i].getScore2());
		}
	}
	
	public static void check(Student[] stds) {
		// 1차 점수 : 60점, 2차 점수 : 60점
		// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
		// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
		// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
		// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)
		System.out.println("==== 재평가 여부 확인 ====");
		for(int i = 0; i < stds.length; i++) {
			String name = stds[i].getName();
			int score1 = stds[i].getScore1();
			int score2 = stds[i].getScore2();
			System.out.printf(i+1 + "번째 %s학생의 확인결과\n", name);
			if(stds[i].getAvg() >= 60) {
				if(score1 < 40) {
					System.out.printf("%s학생은 1차 시험 재평가 대상자입니다.\n", name);
				}else if(score2 < 40) {
					System.out.printf("%s학생은 2차 시험 재평가 대상자입니다.\n", name);
				}else {
					System.out.printf("통과입니다.\n");
				}
			}else {
				if(score1 < 60) {
					System.out.printf("%s학생은 1차 시험 재평가 대상자입니다.\n", name);
				}
				if(score2 < 60) {
					System.out.printf("%s학생은 2차 시험 재평가 대상자입니다.\n", name);
				}
			}
		}
	}
	
	public static void bye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
