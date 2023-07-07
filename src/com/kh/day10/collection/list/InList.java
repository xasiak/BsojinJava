package com.kh.day10.collection.list;

public class InList {
	// 필드
	int [] nums;
	int size;
	// 생성자
	public InList() {
		nums = new int[3];
		size = 0;
	}
	public void add(int num) {
		nums[size] = num;
		size++;
	}
	public int get(int index) {
		return nums[index];
	}
	public int size() {
		return size;
	}
	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
