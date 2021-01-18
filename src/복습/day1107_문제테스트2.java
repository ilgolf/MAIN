package 복습;

import java.util.Scanner;

public class day1107_문제테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * # 답없음 문제 
		 * 1. 5회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 정수를 전부 합을 출력한다. 
		 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
		 * 
		 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */	
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			
			if(count >= 5) {
				break;
			}
			
			System.out.println("정수 입력 >>> ");
			int num = sc.nextInt();
			
			sum += num;
			
			if(sum >= 100) {
				break;
			}
			
			count ++;
		}
		System.out.println(sum);
	}

}
