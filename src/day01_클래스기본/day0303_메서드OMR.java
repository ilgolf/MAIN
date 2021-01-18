package day01_클래스기본;

import java.util.Random;

class OMR {
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// 모범답안
	int[] me = new int[5];				// 학생답안
	
	int cnt = 0;						// 정답 맞춘 개수
	int score = 0;						// 성적
	
	void dataSetting() {
		for(int i=0; i<me.length; i++) {
			int r = ran.nextInt(5) + 1;
			
			me[i] = r;
		}
	}
	
	void printOMR() {
		System.out.print("OMR = { ");
		for(int i=0; i<omr.length; i++) {
			System.out.print(omr[i] + " ");
		}
		System.out.println("}");
	}
	
	void printMe() {
		System.out.print("ME = { ");
		for(int i=0; i<me.length; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println("}");
	}
	
	void printChart() {
		System.out.print("정오표 = { ");
		for(int i=0; i<omr.length; i++) {
			if(omr[i] == me[i]) {
				System.out.print("O ");
				cnt ++;
			}
			else if(omr[i] != me[i]) {
				System.out.print("X ");
			}
		}
		System.out.println("}");
		
		score = cnt*20;
		
		System.out.println("성적 = " + score);
	}
}

public class day0303_메서드OMR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OMR o = new OMR();
		
		o.dataSetting();
		o.printOMR();
		o.printMe();
		o.printChart();
	}

}
