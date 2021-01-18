package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class MemoryGame {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int cnt = 0;
	
	void shuffle() {
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(front.length);
			
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}
	}
	
	void printGame() {
		for(int i=0; i<back.length; i++) {
			if(back[i] == 0) {
				System.out.print("[ ] ");
			}
			else {
				System.out.print("[" + back[i] + "] ");
			}
		}
		System.out.println();
	}
	
	void playGame() {
		System.out.println("인덱스1 입력 >>> ");
		int idx1 = sc.nextInt();
		System.out.println("인덱스2 입력 >>> ");
		int idx2 = sc.nextInt();
		
		if(back[idx1] == 0 && back[idx2] == 0) {
			back[idx1] = front[idx1];
			back[idx2] = front[idx2];
			
			printGame();
			
			if(back[idx1] == back[idx2]) {
				cnt ++;
			}
			else if(back[idx1] != back[idx2]) {
				back[idx1] = 0;
				back[idx2] = 0;
			}
		}
	}
	
	void run() {
		shuffle();
		while(true) {
			printGame();
			
			if(cnt == front.length/2) {
				System.out.println("exit game");
				break;
			}
			playGame();
		}
	}
}

public class day0306_메서드기억력게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryGame mg = new MemoryGame();
		mg.run();

	}
}
