package 복습;

public class day0708_테스트문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		
		System.out.println("문제 4");
		for(int i=50; i<101; i++) {
			if(i%9 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("문제 5");
		int maxNum = 0;
		for(int i=28; i<1000; i++) {
			if(i%28 == 0) {
				if(maxNum < i) {
					maxNum = i;
				}
			}
		}
		System.out.println(maxNum);
		
		System.out.println("문제 6");
		int count = 0;
		String ans = "";
		for(int i=0; i<100; i++) {
			if(i%8 == 0) {
				ans += i;
				count ++;
				if(count == 5) {
					break;
				}
				if(i != 5-1) {
					ans += "/";
				}
			}
		}
		System.out.println(ans);
	}

}
