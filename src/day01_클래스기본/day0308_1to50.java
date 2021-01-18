package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class SpeedGame {
	
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;
	
	void dataSetting() {
		int k=1;
		for(int i=0; i<front.length; i++) {
			for(int j=0; j<front.length; j++) {
				front[i][j] = k;
				back[i][j] = k+9;
				k++;
			}
		}
	}
	
	void printGame() {
		System.out.println("======= 1to50 =======");
		for(int i=0; i<front.length; i++) {
			for(int j=0; j<front.length; j++) {
				System.out.print("[" + front[i][j] + "]\t");
			}
			System.out.println("\n");
		}
	}
	
	void playGame() {
		System.out.println("enter Y >>> ");
		int y = sc.nextInt();
		System.out.println("enter X >>> ");
		int x = sc.nextInt();
		
		if(front[y][x] == num) {
			if(num < 10) {
				front[y][x] = back[y][x];
			}
			else if(num > 9) {
				front[y][x] = 0;
			}
			num ++;
		}
		System.out.println(num);
	}
	
	void run() {
		
		dataSetting();
		
		while(true) {
			printGame();
			if(num > (front.length*back.length)*2) {
				System.out.println("exit Game");
				break;
			}
			playGame();
		}
	}
}

public class day0308_1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedGame sp = new SpeedGame();
		
		sp.run();
	}
}
