package day01_클래스기본;

import java.util.Random;
import java.util.Scanner;

class Test3 {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	void problem1(int[] scores) {
		System.out.println("문제 1");
		for(int i=0; i<scores.length; i++) {
			scores[i] = ran.nextInt(100) + 1;
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}
	
	void problem2(int[] scores) {
		int sum = 0;
		System.out.println("문제 2");
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum/scores.length;
		System.out.println("총점 (" + sum + "), " + "평균 (" + avg + ")");
	}
	
	void problem3(int[] scores) {
		int count = 0;
		System.out.println("문제 3");
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 60) {
				count ++;
			}
		}
		System.out.println("합격자 : " + count + "명");
	}
	
	void problem4(int[] scores) {
		System.out.println("문제 4");
		
		System.out.println("idx >>> ");
		int idx = sc.nextInt();
		
		System.out.println(scores[idx]);
		
	}
	void problem5(int[] scores) {
		System.out.println("문제 5");
		
		System.out.println("score >>> ");
		int score = sc.nextInt();
		
		
		int check = -1;
		for(int i=0; i<scores.length; i++) {
			if(score == scores[i]) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			System.out.println(score);
		}
	}
	void problem6(int[] scores, int[] hakbuns) {
		System.out.println("문제 6");
		
		System.out.println("학번 >>> ");
		int hakbun = sc.nextInt();
		
		int idx = -1;
		for(int i=0; i<scores.length; i++) {
			if(hakbun == hakbuns[i]) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			System.out.println(idx);
		}
	}
	
	void problem8(int[] scores, int[] hakbuns) {
		int maxNum = scores[0];    int maxIdx = 0;
		System.out.println("문제 8");
		
		for(int i=0; i<scores.length; i++) {
			if(maxNum < scores[i]) {
				maxNum = scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1등 학생 : " + hakbuns[maxIdx] + ", 점수 : " + maxNum + "점");
	}
}

public class day0303_연습문제3 {

	public static void main(String[] args) {
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
				// 예 1) 87, 11, 92, 14, 47

				// 문제2) 전교생의 총점과 평균 출력
				// 예 2) 총점(251) 평균(50.2)

				// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
				// 예 3) 2명

				// 문제4) 인덱스를 입력받아 성적 출력
				// 정답4) 인덱스 입력 : 1 성적 : 11점

				// 문제5) 성적을 입력받아 인덱스 출력
				// 정답5) 성적 입력 : 11 인덱스 : 1

				// 문제6) 학번을 입력받아 성적 출력
				// 정답6) 학번 입력 : 1003 성적 : 45점

				// 문제7) 학번을 입력받아 성적 출력
				// 단, 없는학번 입력 시 예외처리
				// 예 7)
				// 학번 입력 : 1002 성적 : 11점
				// 학번 입력 : 1000 해당학번은 존재하지 않습니다.

				// 문제8) 1등학생의 학번과 성적 출력
				// 정답8) 1004번(98점)
		
		Test3 t = new Test3();

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		
		t.problem1(scores);
		
		t.problem2(scores);
		
		t.problem3(scores);
		
		t.problem4(scores);
		
		t.problem5(scores);
		
		t.problem6(scores, hakbuns);
		
		t.problem8(scores, hakbuns);
	}

}
