package com.kh.day07.oop.member;

// 기능 저장용
import java.util.Scanner;

public class MemberFunction {
	private Member [] memArrs;
	private int index;
	
	public MemberFunction() {
		memArrs= new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 프로그램");
		System.out.println("1. 회원정보 입력");
		System.out.println("2. 회원정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputinfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원정보 입력 =====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");	
		String email = sc.next();
		System.out.print("주소 : ");		
		sc.nextLine(); //개행 제거
		String address = sc.nextLine();
//		memArrs[0] = new Member();
//		memArrs[0].setMemberId(memberId);
//		memArrs[0].setMemberPw(memberPw);
//		memArrs[0].setMemberEmail(email);
//		memArrs[0].setMemberAddress(address);
		System.out.println(email);
		memArrs[index] = new Member(memberId, memberPw, email, address);
		System.out.println(memArrs[index].getMemberEmail());
		index++;
	}
	
	public void printinfo() {
		System.out.println("===== 회원정보 출력 =====");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n"
					, memArrs[i].getMemberId()
					, memArrs[i].gerMemberPw()
					, memArrs[i].getMemberEmail()
					, memArrs[i].getMemberAddress());
			
		}
	}
	
}
