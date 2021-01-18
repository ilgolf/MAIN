package day01_클래스기본;

class Ex03 {
	int[] arr = {87, 100, 11, 72, 92};
}

public class day0103_클래스문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 e = new Ex03();
		
		System.out.println("문제 1");
		int sum = 0;
		for(int i=0; i<e.arr.length; i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		
		System.out.println("문제2");
		sum = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%4 == 0) {
				sum += e.arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("문제3");
		int count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%4 == 0)
				count++;
		}
		System.out.println(count);
		
		System.out.println("문제4");
		count = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
