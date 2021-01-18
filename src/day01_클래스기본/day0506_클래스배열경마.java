package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class Horse {
	String name = "";  int pos = 0; int rank = 0;
	boolean win = false;
}

class Racing {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int size = 4;
	Horse[] horses = new Horse[size];
	int line = 20;
	int[][] track = new int[size][line];
	void run() {
		String names = "abcd";
		for(int i=0; i<size; i++) {
			horses[i] = new Horse();
			horses[i].name = names.charAt(i) + "";
		}
		while(true) {
			showMenu();
			int sel = sc.nextInt();
			
			if(sel == 1) { 
				Play();  
				PrintHorse();
			}
			else if(sel == 2) { showRank(); }
			else if(sel == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	void PrintHorse() {
		System.out.println();
		for(int i=0; i<size; i++) {
			for(int n=0; n<line; n++) {
				if(horses[i].pos == n) {
					System.out.print("[" + horses[i].name + "]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}
	
	void Play() {
		boolean loop = true;
		int count = 0;
		while(loop) {
			PrintHorse();
			for(int i=0; i<size; i++) {
				if(horses[i].win == true) { continue; }
				int r = ran.nextInt(4) + 1;
				horses[i].pos += r;
				if(horses[i].pos >= 19) {
					horses[i].pos = 19;
					horses[i].rank = count + 1;
					horses[i].win = true;
					count++;
					if(count >= size) {
						loop = false;
						break;
					}
				}
			}
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
	
	void sort_rank() {
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++) {
				if(horses[i].rank > horses[j].rank) {
					
					int temp = horses[i].rank;
					horses[i].rank = horses[j].rank;
					horses[j].rank = temp;
					
					String tmp = horses[i].name;
					horses[i].name = horses[j].name;
					horses[j].name = tmp;
				}
			}
		}
	}
	
	void showRank() {
		sort_rank();
		for(int i=0; i<size; i++) {
			System.out.println((i+1) + ". " + horses[i].name + " : " + horses[i].rank + "위");
		}
	}
	
	void showMenu() {
		System.out.println("====== 경마 게임 =====");
		System.out.println("1. 게임하기");
		System.out.println("2. 순위보기");
		System.out.println("3. 종료하기");
		System.out.println("==================");
	}
}
public class day0506_클래스배열경마 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racing race = new Racing();
		race.run();
	}
}
