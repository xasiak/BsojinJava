package com.kh.day06.oop.student;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 입력
	// 평균 출력
	private String name;
	private int score1;
	private int score2;
	
	public Student() {
		name = "";
		score1 = 0;
		score2 = 0;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	public int getTotal() {
		int total = this.score1 + this.score2;
		return total;
	}
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		return avg;
	}
	//getter 메소드
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	//setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
}
