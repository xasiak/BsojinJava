package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {

	List<Music> mList;
	
	public MusicFunction() {
		mList = new ArrayList<Music>();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 메인메뉴 ==========");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int value = sc.nextInt();
		return value;
	}
	
	public void addlast() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(music);
		System.out.println("[서비스 성공] : 추가 성공!");
	}

	public void addFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		mList.add(0, music);
		System.out.println("[서비스 성공] : 추가 성공!");
	}

	// 음악 전체 출력
	public void printList() {
		System.out.println("========== 전체 곡 목록 출력 ==========");
		//1번째 노래 -> 곡명 : i am, 가수명 : 아이브
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n"
					, (i+1)
					, music.getTitle()
					, music.getSinger());
		}
		System.out.println("[서비스 성공] : 조회 성공!");
	}

	// 곡명으로 음악 검색하기
	public void searchMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.println("========== 전체 곡 목록 출력 ==========");
		for(Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.printf("검색 결과 >> 곡명 : %s, 가수명 : %s\n"
						, music.getTitle()
						, music.getSinger());
				break; // 찾았으면 그만 나와
			}
		}
		System.out.println("[서비스 성공] : 조회 성공!");
	}

	// 곡명으로 음악 삭제하기
	public void delMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				// mList에서 삭제
				mList.remove(i);
				break; // 찾았으면 그만 나와
			}
		}
		System.out.println("[서비스 성공] : 삭제 성공!");
	}
	
	// 곡명으로 음악 정보 수정하기
	public void modifyInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modSinger = sc.nextLine();
		Music modMusic = new Music(modTitle, modSinger);
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				mList.set(i, modMusic);
			}
		}
		System.out.println("[서비스 성공] : 수정 성공!");
	}

	public void ascTitle() {
		// TODO Auto-generated method stub
		
	}

	public void descTitle() {
		// TODO Auto-generated method stub
		
	}

	public void ascSinger() {
		// TODO Auto-generated method stub
		
	}

	public void descSinger() {
		// TODO Auto-generated method stub
		
	}



}
