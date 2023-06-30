package com.kh.day05.oop;

class StaticSample {
	public int num; // 객체를 생성하고 거기서 꺼내써야함.
	
	public static int input; //static키워드가 붙으면 객체 생성 없이 바로 쓸 수 있음
	
	public void sampleMethod() {
		
	}
	public void goodMethod() {
		
	}
	public static void originMethod() {
		input = 1225;
	}
}

public class Exam_static {
	public static void main(String [] args)
	{
		StaticSample.input = 10; 
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		StaticSample sample = new StaticSample();
		sample.num = 26;
	}
}
