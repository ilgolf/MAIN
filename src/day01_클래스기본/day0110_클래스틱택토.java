package day01_≈¨∑°Ω∫±‚∫ª;

import java.util.Scanner;

class Ex10{
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}

/* 
 * # ∆Ω≈√≈‰
 * === ∆Ω≈√≈‰ ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]¿Œµ¶Ω∫ ¿‘∑¬ : 6
 * === ∆Ω≈√≈‰ ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]Ω¬∏Æ
 * 
 */

public class day0110_≈¨∑°Ω∫∆Ω≈√≈‰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		while(true) {
			System.out.println("=== Tic Tac Toe ===");
			for(int i=0; i<e.game.length; i++) {
				for(int j=0; j<e.game[i].length; j++) {
					if(e.game[i][j] == "1") {
						System.out.print("[O]\t");
					}
					else if(e.game[i][j] == "2") {
						System.out.print("[X]\t");
					}
					else {
						System.out.print("[ ]\t");
					}
				}
				System.out.println("\n");
			}
			
			if(e.win == 1) {
				System.out.println("P1 Win !");
				break;
			}
			else if(e.win == 2) {
				System.out.println("P2 Win !");
				break;
			}
			
			if(e.turn%2 == 0) {
				System.out.println("P1 enter Y >>> ");
				int y = sc.nextInt();
				System.out.println("p1 enter X >>> ");
				int x = sc.nextInt();
				
				if(e.game[y][x] != "") {
					e.game[y][x] = "1";
					e.turn ++;
				}
				else {
					System.out.println("select Again");
				}
			}
			else if(e.turn%2 == 1) {
				System.out.println("P2 enter Y >>> ");
				int y = sc.nextInt();
				System.out.println("P2 enter X >>> ");
				int x = sc.nextInt();
				
				if(e.game[y][x] != "") {
					e.game[y][x] = "2";
					e.turn ++;
				}
				else {
					System.out.println("select Again");
				}
			}
			
			// check height
			for(int i=0; i<e.game.length; i++) {
				if(e.game[i][0] == "1" && e.game[i][1] == "1" && e.game[i][2] == "1") {
					e.win = 1;
				}
				if(e.game[i][0] == "2" && e.game[i][1] == "2" && e.game[i][2] == "2") {
					e.win = 2;
				}
			}
			
			// check width
			for(int i=0; i<e.game.length; i++) {
				if(e.game[0][i] == "1" && e.game[1][i] == "1" && e.game[2][i] == "1") {
					e.win = 1;
				}
				if(e.game[0][i] == "2" && e.game[1][i] == "2" && e.game[2][i] == "2") {
					e.win = 1;
				}
			}
			
			// check Cross
			if(e.game[0][0] == "1" && e.game[1][1] == "1" && e.game[2][2] == "1") {
				e.win = 1;
			}
			if(e.game[0][0] == "2" && e.game[1][1] == "2" && e.game[2][2] == "2") {
				e.win = 2;
			}
			if(e.game[0][2] == "1" && e.game[1][1] == "1" && e.game[2][0] == "1") {
				e.win = 1;
			}
			if(e.game[0][2] == "2" && e.game[1][1] == "2" && e.game[2][0] == "2") {
				e.win = 2;
			}
		}
	}
}