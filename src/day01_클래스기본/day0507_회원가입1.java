package day01_클래스기본;

import java.util.Scanner;

class User {
	String id;
	int money;
}

public class day0507_회원가입1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 100;
		User[] user = new User[max];
		for(int i=0; i<100; i++) {
			user[i] = new User();
		}
		int count = 0;
		int n=0;
		while(n == 0) {
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.로그인");
			System.out.println("5.로그아웃");
			System.out.println("6.입금");
			System.out.println("7.이체");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("이름을 입력하세요 >>> ");
				user[count].id = sc.next();
				System.out.println("금액을 입력하세요 >>> ");
				user[count].money = sc.nextInt();
				count++;
			}
			else if(sel == 2) {
				System.out.println("인덱스를 입력하세요 >>> ");
				int idx = sc.nextInt();
				for(int i=idx; i<count-1; i++) {
					user[i] = user[i+1];
				}
				count --;
			}
			else if(sel == 3) {
				for(int i=0; i<count; i++) {
					System.out.println(i+1 + "번) " + user[i].id + " : " + user[i].money + "원");
				}
			}
			else if(sel == 4) {
				System.out.println("");
			}
		}
	}

}
