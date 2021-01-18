package day01_클래스기본;

import java.util.Scanner;

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,0,0,0,0},
			{0,0,1,1,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
}

public class day0112_클래스사다리게임암기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex14 e = new Ex14();
		
		System.out.println("[Today's Launch menu]");
		for(int i=0; i<e.menu.length; i++) {
			System.out.println(e.menu[i]);
		}
		System.out.println("=====================");
		
		for(int i=0; i<e.ladder[0].length; i++) {
			System.out.print(" " + (i+1) + " ");
		}
		System.out.println();
		for(int j=0; j<e.ladder.length; j++) {
			for(int k=0; k<e.ladder[j].length; k++) {
				if(e.ladder[j][k] == 0) {
					System.out.print(" │ ");
				}
				else if(k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k-1] == 1) {
					System.out.print("─┤ ");
				}
				else if(k != e.ladder[j].length - 1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
					System.out.print(" ├─");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("select No[1~5] : ");
		e.x = sc.nextInt()-1;
		for(int i=0; i<e.ladder.length; i++) {
			if(e.x != e.ladder[0].length-1 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x+1] == 1) {
				e.x ++;
			}
			else if(e.x != 0 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x-1] == 1) {
				e.x --;
			}
			e.y++;
		}
		System.out.println("Today's Launch menu : " + e.menu[e.x] );
		
	}

}
