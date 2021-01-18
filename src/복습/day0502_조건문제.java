package 복습;

public class day0502_조건문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("실행 O");
		}
		
		if(a != b) {
			System.out.println("실행X");
		}
		
		int num1 = -10;
		
		if(num1 < 0) {
			System.out.println("음수");
		}
		
		int num2 = 12;
		
		if(num2 % 4 == 0) {
			System.out.println("4의 배수");
		}
		
		int score = 87;
		
		if(score > 60) {
			System.out.println("합격");
		}
	}
}
