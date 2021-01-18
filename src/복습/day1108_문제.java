package 복습;

public class day1108_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제 1");
		int tot = 31;
		int man = 12;
		int woman = 14;
		
		System.out.println(tot - (man+woman));
		
		System.out.println("문제 2");
		tot = 7 * 12;
		woman = 2;
		man = 4;
		System.out.println(tot / (man + woman));
		
		System.out.println("문제 3");
		tot = 96;
		man = 4;
		System.out.println(tot / (man*3) + "시간이 걸린다.");
		
		System.out.println("문제 4");
		int fruit1 = 840;
		int fruit2 = 750;
		System.out.println((fruit1/6)*5 + "g, " + (fruit2/3)*4 + "g");
		
		System.out.println("문제 1");
		tot = 14;
		int price = 1500;
		while(tot%3 != 0) {
			tot ++;
		}
		System.out.println((tot/3)*price + "원");
		
		System.out.println("문제 2");
		tot = 52;
		price = 1200;
		while(tot%10 != 0) {
			tot++;
		}
		System.out.println((tot/10)*price + "원");
		
		System.out.println("문제 3");
		tot = 24600;
		System.out.println((tot/1000) + "장");
		
		System.out.println("문제 1");
		double num = 1.12;
		while(num*3 != 6.12) {
			num += 0.01;
		}
		System.out.println(num + " : " + num/4);
	}

}
