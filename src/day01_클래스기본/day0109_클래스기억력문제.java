package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class Ex09 {
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;		// 정답을 맞춘 횟수
}

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

public class day0109_클래스기억력문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Ex09 e = new Ex09();
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(e.front.length - 1);
			
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		while(true) {
			
			System.out.print("Memory Game = { ");
			for(int i=0; i<e.front.length; i++) {
				if(e.back[i] == 0) {
					System.out.print("[ ] ");
				}
				else {
					System.out.print("[" + e.back[i] + "] ");
				}
			}
			System.out.println("}");
			
			if(e.cnt == 5) {
				System.out.println("exit program");
				break;
			}
			
			System.out.println("index 1 >>> ");
			int idx1 = sc.nextInt();
			e.back[idx1] = e.front[idx1];
			for(int i=0; i<e.front.length; i++) {
				if(e.back[i] == 0) {
					System.out.print("[ ] ");
				}
				else {
					System.out.print("[" + e.back[i] + "] ");
				}
			}
			System.out.println("}");
			System.out.println("index 2 >>> ");
			int idx2 = sc.nextInt();
			e.back[idx2] = e.front[idx2];
			for(int i=0; i<e.front.length; i++) {
				if(e.back[i] == 0) {
					System.out.print("[ ] ");
				}
				else {
					System.out.print("[" + e.back[i] + "] ");
				}
			}
			System.out.println("}");
			
			if(e.back[idx1] != 0 && e.back[idx2] != 0) {
				System.out.println("select again");
				continue;
			}
			else {
				if(e.front[idx1] == e.front[idx2]) {
					e.cnt++;
				}
				else {
					e.back[idx1] = 0;
					e.back[idx2] = 0;
				}
			}
		}
	}
}
