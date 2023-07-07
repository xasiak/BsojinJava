package com.kh.day10.collection.music;

import java.util.Scanner;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int value = mFunc.printMenu();
			switch(value) {
			case 1 : 
				mFunc.addlast();
				break;
			case 2 : 
				mFunc.addFirst();
				break;
			case 3 : 
				mFunc.printList();
				break;
			case 4 : 
				mFunc.searchMusic();
				break;
			case 5 :
				mFunc.delMusic();
				break;
			case 6 :
				mFunc.modifyInfo();
				break;
			case 7 :
				mFunc.ascTitle();
				break;
			case 8 :
				mFunc.descTitle();
				break;
			case 9 :
				mFunc.ascSinger();
				break;
			case 10 : 
				mFunc.descSinger();
				break;
			case 0 : 
				System.out.println("시스템이 종료되었습니다.");
				break end; 
			}
		}
	}


	
}
