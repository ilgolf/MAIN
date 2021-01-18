package day01_클래스기본;

class Ex02 {
	String name;
	int score;
}

public class day0102_클래스이론2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 hgd = new Ex02();
		hgd.name = "홍길동";
		hgd.score = 100;
		
		System.out.print(hgd.name + ": " );
		System.out.println(hgd.score);
		
		Ex01 e = new Ex01();
		e.x = 20;
		e.x = 30;
		System.out.println(e.x);
		System.out.println(e.y);
	}

}
