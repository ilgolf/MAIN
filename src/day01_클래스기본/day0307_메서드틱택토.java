package day01_Å¬·¡½º±âº»;

import java.util.Scanner;

class TicTaeToe {
	
	Scanner sc = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1½Â¸®] 2[turn2½Â¸®]
	
	
	void printGame() {
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game.length; j++) {
				if(game[i][j] == "1") {
					System.out.print("[O]\t");
				}
				else if(game[i][j] == "2") {
					System.out.print("[X]\t");
				}
				else {
					System.out.print("[ ]\t");
				}
			}
			System.out.println("\n");
		}
		System.out.println();
	}
	
	void playGame() {
		if(turn%2 == 0) {
			System.out.println("[P1] enter Y >>> ");
			int y = sc.nextInt();
			System.out.println("[P1] enter X >>> ");
			int x = sc.nextInt();
			
			if(game[y][x] == null) {
				game[y][x] = "1";
				turn ++;
			}
			else {
				System.out.println("please re-enter");
			}
		}
		else if(turn%2 == 1) {
			System.out.println("[P2] enter Y >>> ");
			int y = sc.nextInt();
			System.out.print("[P2] enter X >>> ");
			int x = sc.nextInt();
			
			if(game[y][x] == null) {
				game[y][x] = "2";
				turn ++;
			}
			else {
				System.out.println("please re-enter");
			}
		}
	}
	
	void check_height() {
		for(int i=0; i<game.length; i++) {
			if(game[i][0] == "1" && game[i][1] == "1" && game[i][2] == "1") {
				win = 1;
			}
			if(game[i][0] == "2" && game[i][1] == "2" && game[i][2] == "2") {
				win = 2;
			}
		}
	}
	
	void check_width() {
		for(int i=0; i<game.length; i++) {
			if(game[0][i] == "1" && game[1][i] == "1" && game[2][i] == "1") {
				win = 1;
			}
			if(game[0][i] == "2" && game[1][i] == "2" && game[2][i] == "2") {
				win = 2;
			}
		}
	}
	
	void check_cross() {
		if(game[0][0] == "1" && game[1][1] == "1" && game[2][2] == "1") {
			win = 1;
		}
		if(game[0][0] == "2" && game[1][1] == "2" && game[2][2] == "2") {
			win = 2;
		}
		if(game[0][2] == "1" && game[1][1] == "1" && game[2][0] == "1") {
			win = 1;
		}
		if(game[0][2] == "2" && game[1][1] == "2" && game[2][0] == "2") {
			win = 2;
		}
	}
	
	void run() {
		while(true) {
			
			printGame();
			
			if(win == 1) {
				System.out.println("Player 1 Win !");
				break;
			}
			else if(win == 2) {
				System.out.println("Player 2 Win !");
				break;
			}
			playGame();
			check_height();
			check_width();
			check_cross();
		}
	}
}

public class day0307_¸Þ¼­µåÆ½ÅÃÅä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTaeToe t = new TicTaeToe();
		t.run();
	}

}
