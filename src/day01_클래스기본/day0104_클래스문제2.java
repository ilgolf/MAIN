package day01_클래스기본;

import java.util.Scanner;

class Ex04 {
	int[] hakbuns = {1001,1002,1003,1004,1005};
	int[] scores = new int[5];
}

public class day0104_클래스문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex04 e = new Ex04();
		System.out.println("문제1");
		for(int i=0; i<e.scores.length; i++) {
			System.out.println("입력 >>> ");
			e.scores[i] = sc.nextInt();
		}
		
		System.out.println("문제 2");
		int tot = 0;
		double avg = 0;
		for(int i=0; i<e.scores.length; i++) {
			tot += e.scores[i];
		}
		avg = tot/e.scores.length;
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		System.out.println("문제 3");
		int count = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] > 60) {
				count ++;
			}
		}
		System.out.println("합격자 수 : " + count);
		
		System.out.println("문제 4");
		System.out.println("인덱스 입력 >>> ");
		int idx = sc.nextInt();
		System.out.println(e.scores[idx]);
		
		System.out.println("문제 5");
		System.out.println("성적 입력 >>> ");
		int score = sc.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(score == e.scores[i]) {
				idx = i;
			}
		}
		System.out.println(idx);
		
		System.out.println("문제 6");
		System.out.println("학번 입력 >>> ");
		int num = sc.nextInt();
		
		for(int i=0; i<e.hakbuns.length; i++) {
			if(num == e.hakbuns[i]) {
				System.out.println(e.scores[i]);
			}
		}
		
		System.out.println("문제 7");
		idx = -1;
		System.out.println("학번 입력 >>> ");
		num = sc.nextInt();
		
		for(int i=0; i<e.hakbuns.length; i++) {
			if(num == e.hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			System.out.println(e.scores[idx]);
		}
		
		System.out.println("문제 8");
		int maxNum = e.scores[0];
		int maxIdx = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(maxNum < e.scores[i]) {
				maxNum = e.scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1등  = " + e.hakbuns[maxIdx] + " : " + maxNum);
	}

}
