package com.kh.day06.oop.member;

public class MemberRun {
	public static void main(String [] args) {
		Member [] memArrs = new Member[3];
		finish : 
			while(true) {
				int choice = printMenu();
				
				switch(choice) {
				case 1 : 
					inputinfo(memArrs); 
					break;
				case 2 : 
					printinfo(memArrs);
					break;
				case 3 : 
					check(memArrs);
					break;
				case 4 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				}
			}
		
	}

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void check(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printinfo(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void inputinfo(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}
}
