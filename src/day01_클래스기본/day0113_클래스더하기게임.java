package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class Ex15{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}

/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 
       그 인덱스의 값 의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
*  예)  4, 7, 5, 3, 2, 9  //   문제:  14   ==> 인덱스 3개를 골라서 합을 맞추면된다.  
    정답)  3,4,5 (여러가지 경우의 수가 나올수는있다)
 */

public class day0113_클래스더하기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Ex15 e = new Ex15();
		
		int cnt = 0;
		for(int i=0; i<e.game.length; i++) {
			int r = ran.nextInt(10)+1;
			
			e.game[i] = r;
			for(int n=0; n<e.game.length; n++) {
				if(r == e.game[n] && i != n) {
					e.game[i] = 0;
					i--;
				}
			}
		}
		
		for(int i=0; i<e.idx.length; i++) {
			int r = ran.nextInt(e.game.length-1);
			e.idx[i] = r;
			for(int n=0; n<e.idx.length; n++) {
				if(i != 0) {
					if(r == e.idx[n] && i != n) {
						e.myIdx[i] = 0;
						i--;
					}
				}
			}
		}
		
		for(int i=0; i<e.idx.length; i++) {
			e.total += e.game[e.idx[i]];
		}
		
		while(true) {
			int count = 0;
			System.out.print("list = { ");
			for(int i=0; i<e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println("}");
			
			System.out.println("answer : = " + e.total);
			
			System.out.println("===============================");
			int myAnswer = 0;
			for(int i=0; i<e.myIdx.length; i++) {
				System.out.println("enter index >>> ");
				e.myIdx[i] = sc.nextInt();
				myAnswer += e.game[e.myIdx[i]];
			}
			if(myAnswer == e.total) {
				for(int i=0; i<e.idx.length; i++) {
					for(int j=0; j<e.myIdx.length; j++) {
						if(e.idx[i] == e.myIdx[j]) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			
			if(count == 3) {
				System.out.println("Sounds Great !");
				break;
			} else {
				System.out.println("bad...");
			}
			
			for(int i=0; i<e.idx.length; i++) {
				System.out.print(e.idx[i] + " ");
			}
			System.out.println();
		}
	}

}
