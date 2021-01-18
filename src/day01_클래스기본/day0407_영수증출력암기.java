package day01_클래스기본;

import java.util.Scanner;

class BurgerShop {
	Scanner sc = new Scanner(System.in);
	
	String name = "";
	int[] arPrice = {   2500,     3800,     1500,      1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜        라"};
	int[] arCount = new int[4];
	int total = 0;
	
	void showMeu() {
		System.out.println("===== " + name + " =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + ": " + arPrice[i] + "원");
		}
		System.out.println("5.종료하기");
	}
	
	void select1() { arCount[0] ++; }
	void select2() { arCount[1] ++; }
	void select3() { arCount[2] ++; }
	void select4() { arCount[3] ++; }
	
	void getReceipt() {
		System.out.println("===== 영수증 =====");
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i+1) + "." + arMenu[i] + ": " + arCount[i] + "개");
			total += arPrice[i] * arCount[i];
		}
		System.out.println("총 금액 : " + total + "원");
	}
	
	void run() {
		while(true) {
			
			showMeu();
			
			System.out.print("메뉴를 선택하세요 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) { select1(); }
			else if(choice == 2) { select2(); }
			else if(choice == 3) { select3(); }
			else if(choice == 4) { select4(); }
			else if(choice == 5) {
				getReceipt();
				break;
			}
		}
	}
}

public class day0407_영수증출력암기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BurgerShop moms = new BurgerShop();
		moms.name = "맘츠터치 햄버거";
		
		moms.run();
	}

}
