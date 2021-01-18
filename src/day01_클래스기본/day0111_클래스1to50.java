package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class Ex11{
	final int SIZE = 9;	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];	
}

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

public class day0111_클래스1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		Ex11 e = new Ex11();
		
		for(int i=0; i<e.SIZE; i++) {
			e.front[i] = i+1;
			e.back[i] = i+10;
		}
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(e.SIZE);
			
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
			
			temp = e.back[0];
			e.back[0] = e.back[r];
			e.back[r] = temp;
		}
		
		int count = 1;
		
		while(true) {
			System.out.println("==== 1 to 50 ====");
			for(int i=0; i<e.SIZE; i++) {
				System.out.print(e.front[i] + " ");
				if(i%3 == 2) {
					System.out.println();
				}
			}
			System.out.println("=================");
			
			if(count == 19) {
				System.out.println("exit program");
				break;
			}
			
			System.out.println("enter No(1~9) >>> ");
			int num = sc.nextInt()-1;
			
			if(e.front[num] < 10) {
				if(e.front[num] == count) {
					e.front[num] = e.back[num];
					count ++;
				}
			}
			else if(e.front[num] > 9) {
				if(e.front[num] == count) {
					e.front[num] = 0;
					count ++;
				}
			}
		}
	}
}
