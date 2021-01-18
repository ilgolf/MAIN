package day01_클래스기본;

import java.util.Scanner;

class Exercise1 {
	Scanner sc = new Scanner(System.in);
	int[][] game;
	int[] myBlock;
	
	void dattaSetting(String data, String block) {
		String[] row = data.split("\n");
		
		game = new int[row.length][row.length];
	    for(int i=0; i<row.length; i++) {
	       String[] info = row[i].split(",");
	            
	       for(int j=0; j<row.length; j++) {
	             game[i][j] = Integer.parseInt(info[j]);
	       }
	    }
	    
	    String[] temp = block.split(",");
	    myBlock = new int[temp.length];
	    for(int i=0; i<temp.length; i++) {
	    	myBlock[i] = Integer.parseInt(temp[i]);
	    }
	}
	
	void printGame() {
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[i].length; j++) {
				if(game[i][j] == 0) {
					System.out.print(game[i][j] + " ");
				}
				else if(game[i][j] == 1) {
					System.out.print("W ");
				}
				else if(game[i][j] == 2) {
					System.out.print("B ");
				}
			}
			System.out.println();
		}
	}
	
	void playGame(String block) {
		System.out.println("y좌표 >>> ");
		int y = sc.nextInt();
		System.out.println("x좌표 >>> ");
		int x = sc.nextInt();
		
		for(int i=0; i<myBlock.length; i++) {
			if(game[y][x + i] == 0) {
				game[y][x + i] = myBlock[i];
			}
			else if(game[y][x + i] == 1) {
				System.out.println("그곳엔 설치할 수 없습니다.");
			}
		}
	}
	
	void run(String data, String block) {
		dattaSetting(data, block);
		while(true) {
			printGame();
			playGame(block);
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 e = new Exercise1();
		String data ="";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		String block = "";
		block += "2,2,2,2";
		
		e.run(data, block);
	}
}
