package day01_클래스기본;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame{
	Scanner sc = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	void printGame() {
		for(int i=0; i<move.length; i++) {
			if(move[i] == 8) {
				System.out.print("[옷] ");
			}
			else if(move[i] == 0) {
				System.out.print("[ ] ");
			}
		}
		System.out.println();
	}
	
	void showMenu() {
		System.out.println("===== Number Move Game =====");
		System.out.println("1. 왼쪽 이동");
		System.out.println("2. 오른쪽 이동");
		System.out.println("3. 종료");
	}
	
	void Left() {
		if(player-1 >= 0) {
			move[player] = 0;
			player --;
			move[player] = 8;
		}
		else if(player-1 < 0) {
			System.out.println("더이상 지나갈 수 없습니다.");
		}
	}
	
	void Right() {
		if(player+1 < move.length) {
			move[player] = 0;
			player ++;
			move[player] = 8;
		}
		else if(player+1 >= move.length) {
			System.out.println("더이상 지나갈 수 없습니다.");
		}
	}
	
	void run() {
		while(true) {
			printGame();
			showMenu();
			int sel = sc.nextInt();
			
			if(sel == 1) {
				Left();
			}
			else if(sel == 2) {
				Right();
			}
			else if(sel == 3) {
				System.out.println("exit program");
				break;
			}
		}
	}
}
public class day0305_메서드숫자이동게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGame ng = new NumberGame();
		
		ng.run();
	}

}
