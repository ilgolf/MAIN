package day01_클래스기본;

import java.util.Random;

class RanNum{
	int num;
	boolean check;
}

public class day0502_클래스배열중복숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		RanNum[] arr = new RanNum[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = new RanNum();
		}
		
		for(int i=0; i<5; i++) {
			int rNum = ran.nextInt(5);
			if(arr[rNum].check == false) {
				arr[rNum].check = true;
				arr[rNum].num = i + 1;
			}
			else {
				i -= 1;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i].num + " ");
		}
	}

}
