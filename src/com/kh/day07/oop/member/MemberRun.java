package com.kh.day07.oop.member;

import java.util.Scanner;
// 실행용

public class MemberRun {
	
	public static void main(String [] args) {
		MemberFunction mFunc = new MemberFunction();
		
		finish : 
			while(true) {
				int choice = mFunc.printMenu();
				
				switch(choice) {
				case 1 : 
					mFunc.inputinfo(); 
					break;
				case 2 : 
					mFunc.printinfo();
					break;
				case 3 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default :
					System.out.println("해당 메뉴는 존재하지 않습니다!");
					break;
				}
			}
		
	}

}
