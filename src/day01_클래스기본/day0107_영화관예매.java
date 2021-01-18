package day01_클래스기본;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Ex07{
	int[] seat = new int[7];
	int money = 0;
}

public class day0107_영화관예매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex07 e = new Ex07();
		
		while(true) {
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]reservation Seat");
			System.out.println("[2]exit program");
			
			System.out.print("select menu : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.print("seat state : ");
					for(int i=0; i<e.seat.length; i++) {
						if(e.seat[i] == 0) {
							System.out.print("[ ] ");
						}
						else {
							System.out.print("[O] ");
						}
					}
					System.out.println();
					
					System.out.println("===== subMenu =====");
					System.out.println("1. reservation Seat");
					System.out.println("2. finish reservation");
					
					System.out.println("choice subMenu >>> ");
					int choice = sc.nextInt();
					
					if(choice == 1) {
						System.out.println("select SeatNo >>> ");
						int num = sc.nextInt();
						
						e.seat[num] = 1;
						e.money += 12000;
					}
					else if(choice == 2) {
						System.out.println("finish reservation");
						break;
					}
				}
			}
			else if(sel == 2) {
				System.out.println("total amount : " + e.money + "$");
				break;
			}
		}
	}
}
