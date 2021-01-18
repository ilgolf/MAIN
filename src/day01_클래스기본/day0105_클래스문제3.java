package day01_클래스기본;

import java.util.Scanner;

class Ex05 {
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = {92, 38, 87, 100, 11};
}

public class day0105_클래스문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex05 mega = new Ex05();
		mega.name = "MEGA STUDY";
		
		while(true) {
			System.out.println("==== " + mega.name + " ====");
			System.out.println("1.check all Student");
			System.out.println("2.check 1st Student");
			System.out.println("3.check the bottom Student");
			System.out.println("4.check your score");
			System.out.println("5.exit the program");
			System.out.println("===========================");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				for(int i=0; i<mega.arScore.length; i++) {
					System.out.println((i+1) + ". " + mega.arHakbun[i] + " : " + mega.arScore[i] + "point");
				}
			}
			else if(sel == 2) {
				int maxNum = mega.arScore[0];
				for(int i=0; i<mega.arScore.length; i++) {
					if(maxNum < mega.arScore[i]) {
						maxNum = mega.arScore[i];
					}
				}
				System.out.println("1st Student : " + maxNum);
			}
			else if(sel == 3) {
				int minNum = mega.arScore[0];
				for(int i=0; i<mega.arScore.length; i++) {
					if(minNum > mega.arScore[i]) {
						minNum = mega.arScore[i];
					}
				}
				System.out.println("Student of the bottom : " + minNum);
			}
			else if(sel == 4) {
				int idx = 0;
				System.out.println("enter your hakbun >>> ");
				int num = sc.nextInt();
				for(int i=0; i<mega.arScore.length; i++ ) {
					if(num == mega.arHakbun[i]) {
						idx = i;
					}
				}
				System.out.println("your score : " + mega.arScore[idx]);
			}
			else if(sel == 5) {
				System.out.println("exit Program");
				break;
			}
		}
	}

}
