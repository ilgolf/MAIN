package programmers_step1;

import java.util.Random;

public class Solution {
	Random ran = new Random();
	int size;
	boolean[] check;

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		check = new boolean[size];
		for (int i = 0; i <size; i++) {
			for(int j=0; j<size-1; j++) {
				if(participant[i].equals(completion[j])) {
					check[i] = true;
				}
			}
		}
		int idx = 0;
		for(int i=0; i<size; i++) {
			if(check[i] == false) {
				idx = i;
			}
		}
		
		answer = participant[idx];
		
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		Random ran = new Random();
		
		s.size = 7;
		String[] participant = new String[s.size];
		for (int i = 0; i <s.size; i++) {
			String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
			String[] b = { "l", "b", "c", "m", "e", "f", "g", "n", "i", "p", "k" };
			String[] c = { "s", "t", "u", "w", "v", "o", "x", "n", "q", "p", "r" };
			
			
			int r = ran.nextInt(a.length);
			participant[i] = a[r];
			r = ran.nextInt(b.length);
			participant[i] += b[r];
			r = ran.nextInt(c.length);
			participant[i] += c[r];
		}
		
		String[] completion = new String[s.size];
		for (int i = 0; i <s.size - 1; i++) {
			int r = ran.nextInt(s.size);
			
			int check = 1;
			for(int j=0; j<s.size - 1; j++) {
				if(participant[r].equals(completion[j]) && i != j) {
					check = -1;
				}
			}
			if(check == -1) {
				r=0;
				i--;
			}
			else if(check == 1) {
				completion[i] = participant[r];
			}
		}
		String answer = s.solution(participant, completion);
		System.out.println(answer + "는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.");
	}
}