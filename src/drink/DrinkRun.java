package drink;

import java.util.Scanner;

public class DrinkRun {
	public static void main(String[] args) {
		finish :
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 :
				inputMoney();
				break;
			case 2 : 
				buy();
				break;
			case 3 : 
				manage();
				break;
			case 4 :
				System.out.println("자판기가 종료되었습니다.");
				break finish;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}
	}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 음료 자판기 =====");
		System.out.println("1. 입금금액");
		System.out.println("2. 물품구매");
		System.out.println("3. 물품관리");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void inputMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마를 충전하시겠습니까? (예시 : 1000) : ");
		int deposit = sc.nextInt();
		System.out.printf("%d원이 충전되었습니다.\n", deposit);// (잔액 : %d원)", deposit, balance);
	}
	
	public static void  buy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("무엇을 구매하시겠습니까? (예시 : 1) : ");
		int buy = sc.nextInt();
		System.out.printf("%d 구매 완료\n", buy);
		System.out.println("========== 영수증 ==========");
		System.out.println("구매한 음료 : ");
		System.out.println("가격 : ");
		System.out.println("잔액 : ");
		System.out.println("============================");
		System.out.println("다른 물건을 더 구매하시겠습니까? (1. 예  2. 아니요) : ");
		
	}
	public static void manage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("관리자 비밀번호 : ");
		int pw = sc.nextInt();
		int managepw = 9292;
		if(pw == managepw) {
			System.out.println("[ 관리자 로그인 성공! ]");
			System.out.println("[관리자]   1. 구매내역 보기   2. 관리자 모드 종료 : ");
			int manageChoice = sc.nextInt();
		}else {
			System.out.println("관리자 모드가 종료되었습니다.");
		}
		
		
		
	}
}
//입금금액
//물품구매
//물품관리
//종료
