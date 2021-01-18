package day01_클래스기본;

import java.util.Scanner;

class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	int player = 4;
}

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

public class day0108_클래스숫자이동문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex08 e = new Ex08();
		
		while(true) {
			for(int i=0; i<e.game.length; i++) {
				if(e.game[i] == 2) {
					System.out.print("[P] ");
				}
				else if(e.game[i] == 1) {
					System.out.print("[W] ");
				}
				else {
					System.out.print("[ ] ");
				}
			}
			
			System.out.println("===== PLAY THE GAME =====");
			System.out.println("1. move Left");
			System.out.println("2. move Right");
			System.out.println("3. destroy wall");
			System.out.println("=========================");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(e.player > 0) {
					if(e.game[e.player - 1] == 1) {
						System.out.println("sorry, l cant move because wall block Way");
					}
					else {
						e.game[e.player] = 0;
						e.player --;
						e.game[e.player] = 2;
					}
				} 
			}
			else if(sel == 2) {
				if(e.player < e.game.length) {
					if(e.game[e.player + 1] == 1) {
						System.out.println("sorry, l cant move because wall block Way");
					}
					else {
						e.game[e.player] = 0;
						e.player ++;
						e.game[e.player] = 2;
					}
				}
			}
			else if(sel == 3) {
				if(e.game[e.player + 1] == 1) {
					e.game[e.player + 1] = 0;
					System.out.println("broken wall");
				}
				if(e.game[e.player - 1] == 1) {
					e.game[e.player - 1] = 0;
					System.out.println("broken wall");
				}
			}
		}
	}
}