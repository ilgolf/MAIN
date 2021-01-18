package day01_클래스기본;

import java.util.Scanner;

class Theater{
	
	Scanner sc = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// 영화관 이름
	int cnt = 0;					// 예매 수
	int money = 0;					// 매출액
	
	void printSeat() {
		for(int i=0; i<seat.length; i++) {
			if(seat[i] == 0) {
				System.out.print("[ ]\t");
			}else {
				System.out.print("[O]\t");
			}
		}
		System.out.println();
	}
	
	void showMenu(String name) {
		System.out.println("===== " + name + " =====");
		System.out.println("1.좌석 예매");
		System.out.println("2.종료 하기");
	}
	
	void selSeat() {
		
		while(true) {
			System.out.println("===== Sub Menu =====" );
			System.out.println("1. 좌석 선택");
			System.out.println("2. 종료 하기");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				printSeat();
				System.out.println("좌석을 골라주세요 >>> ");
				int idx = sc.nextInt();
				
				if(seat[idx] == 0) {
					seat[idx] = 1;
					cnt++;
				}
				else {
					System.out.println("다시 입력 ");
				}
			}
			else if(sel == 2) {
				money = cnt*12000;
				System.out.println("총 가격 : " + money);
				break;
			}
		}
		
	}
	
	void exit() {
		System.out.println("총 매출액 " + money + "원");
	}
	
	void run(String name) {
		while(true) {
			printSeat();
			showMenu(name);
			int sel = sc.nextInt();
			
			if(sel == 1) {
				selSeat();
			}
			else if(sel == 2) {
				exit();
				break;
			}
		}
	}
}

public class day0304_메서드영화관 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "LOTTE CINEMA";
		Theater lc = new Theater();
		
		lc.run(name);
	}
}
