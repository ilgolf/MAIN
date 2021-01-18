package day01_클래스기본;

class Test2 {
	void printSum(int[] arr) {
		int sum = 0;
		System.out.println("문제 1");
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		System.out.println("문제 2");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
	void printCountMultiple4(int[] arr) {
		int count = 0;
		System.out.println("문제 3");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				count ++;
			}
		}
		System.out.println(count);
	}
	void printCountEven(int[] arr) {
		int count = 0;
		System.out.println("문제 4");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}

public class day0302_연습문제2 {

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		int[] arr = { 87, 100, 11, 72, 92 };
		
		t.printSum(arr);
		
		t.printSumMultiple4(arr);
		
		t.printCountMultiple4(arr);
		
		t.printCountEven(arr);
		// 문제 1) 전체 합 출력
		// 정답 1) 362

		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264

		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
	}

}
