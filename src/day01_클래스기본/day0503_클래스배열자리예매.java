package day01_클래스기본;

import java.util.Scanner;

class Seat {
	Scanner sc = new Scanner(System.in);
	int cnt;
	int money;
	String name = "";
	boolean check;
	Seat[] seatList = new Seat[8];
	
	void showMenu(String name) {
		System.out.println("===== " + name + " =====");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
	}
	
	void Reserve() {
		Seat[] seatList = new Seat[8];
		for(int i=0; i<seatList.length; i++) {
			seatList[i] = new Seat();
		}
		while(true) {
			for(int i=0; i<seatList.length; i++) {
				if(seatList[i].check == true) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			}
			System.out.println();
			System.out.println("1.좌석고르기");
			System.out.println("2.종료하기");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("좌석을 골라주세요  >>> ");
				int idx = sc.nextInt();
				
				if(seatList[idx].check == false) {
					seatList[idx].check = true;
					cnt++;
				}
				else {
					System.out.println("이미 예약된 좌석입니다.");
				}
			}
			else if(sel == 2) {
				System.out.println("총 예매 좌석은 " + cnt + "석 입니다.");
				break;
			}
		}
	}
	
	void exit() {
		money = cnt*12000;
		System.out.println("총 금액은 " + money + "원입니다.");
	}
	
	void run(String name) {
		while(true) {
			showMenu(name);
			int sel = sc.nextInt();
			
			if(sel == 1) {
				Reserve();
			}
			else if(sel == 2) {
				exit();
				break;
			}
		}
	}
}

public class day0503_클래스배열자리예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seat lc = new Seat();
		
		String name = "LOTTE CINEMA";
		
		lc.run(name);
	}
}
