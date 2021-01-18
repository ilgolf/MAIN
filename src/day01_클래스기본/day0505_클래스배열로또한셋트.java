package day01_클래스기본;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;
	
	void print() {
		for(int i=0; i<8; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}

public class day0505_클래스배열로또한셋트 {

	public static void main(String[] args) {
		// 로또 1셋트 (1)
		// 1개는 당첨 4개는 꽝 인 랜덤복권
		
		Random ran = new Random();
		Lotto[] lotto = new Lotto[5];
		boolean check = false;
		int n = 0;
		
		while(n < 5) {
			lotto[n] = new Lotto();
			for(int i=0; i<8; i++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lotto[n].data[i] = 0;
				}
				else if(r == 1) {
					lotto[n].data[i] = 3;
				}
			}
			int count = 0;
			for(int i=0; i<8; i++) {
				if(lotto[n].data[i] == 3) {
					count++;
					if(count == 3) {
						lotto[n].win = true;
						break;
					}
				} else {
					count = 0;
				}
			}
			if(check == false && lotto[n].win == true) {
				check = true;
				
				n++;
			} else if(check == true && lotto[n].win == false) {
				
				n++;
			}
		}
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(5);
			
			Lotto temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
		for(int i=0; i<5; i++) {
			lotto[i].print();
		}
	}

}
