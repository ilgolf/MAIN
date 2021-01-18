package day01_클래스기본;

import java.util.Scanner;

class Tic {
	int[] line = new int[3];
	void printLine() {
		for(int i=0; i<3; i++) {
			if(line[i] == 0) {
				System.out.print("[ ]\t");
			}
			else if(line[i] == 1) {
				System.out.print("[O]\t");
			}
			else if(line[i] == 2) {
				System.out.print("[X]\t");
			}
		}
		System.out.println("\n");
	}
}

public class day0504_클래스틱택토 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int win = 0;
		Tic[] ticList = new Tic[3];
		for(int i=0; i<ticList.length; i++) {
			ticList[i] = new Tic();
		}
		Scanner sc = new Scanner(System.in);
		boolean turn = true;
		while(true) {
			for(int i=0; i<ticList.length; i++) {
				ticList[i].printLine();
			}
			System.out.println();
			
			if(win == 1) {
				System.out.println("P1 win!");
				break;
			}
			if(win == 2) {
				System.out.println("P2 win!");
				break;
			}
			
			System.out.println("y (0~2)를 입력하세요 >>> ");
			int y = sc.nextInt();
			System.out.println("x (0~2)를 입력하세요 >>> ");
			int x = sc.nextInt();
			if(turn == true && ticList[y].line[x] == 0) {
				ticList[y].line[x] = 1;
				turn = false;
			} else {
				ticList[y].line[x] = 2;
				turn = true;
			}
			
			// check_width
			for(int i=0; i<ticList.length; i++) {
				if(ticList[0].line[i] == 1 && ticList[1].line[i] == 1 && ticList[2].line[i] == 1) {
					win = 1;
				}
				if(ticList[0].line[i] == 2 && ticList[1].line[i] == 2 && ticList[2].line[i] == 2) {
					win = 2;
				}
			}
			
			// check_height
			for(int i=0; i<ticList.length; i++) {
				if(ticList[i].line[0] == 1 && ticList[i].line[1] == 1 && ticList[i].line[2] == 1) {
					win = 1;
				}
				if(ticList[i].line[0] == 2 && ticList[i].line[1] == 2 && ticList[i].line[2] == 2) {
					win = 2;
				}
			}
			
			// check_cross
			if(ticList[0].line[0] == 1 && ticList[1].line[1] == 1 && ticList[2].line[2] == 1) {
				win = 1;
			}
			if(ticList[0].line[0] == 2 && ticList[1].line[1] == 2 && ticList[2].line[2] == 2) {
				win = 2;
			}
			if(ticList[0].line[2] == 1 && ticList[1].line[1] == 1 && ticList[2].line[0] == 1) {
				win = 1;
			}
			if(ticList[0].line[2] == 2 && ticList[1].line[1] == 2 && ticList[2].line[0] == 2) {
				win = 2;
			}
		}
	}

}
