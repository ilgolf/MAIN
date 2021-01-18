package day01_클래스기본;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
}

/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

public class day0106_클래스OMR문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Ex06 e = new Ex06();
		
		System.out.print("Answer = { ");
		for(int i=0; i<e.answer.length; i++) {
			System.out.print(e.answer[i] + " ");
		}
		System.out.println("}");
		
		for(int i=0; i<e.hgd.length; i++) {
			int r = ran.nextInt(5) + 1;
			e.hgd[i] = r;
		}
		
		System.out.print("MyAnswer = { ");
		for(int i=0; i<e.hgd.length; i++) {
			System.out.print(e.hgd[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("Errata = { ");
		for(int i=0; i<e.hgd.length; i++) {
			if(e.hgd[i] == e.answer[i]) {
				System.out.print("O ");
				e.cnt ++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("}");
		
		e.score = e.cnt * 20;
		
		System.out.println("your score = " + e.score + "point");
	}
}