import java.util.Scanner;

public class BOJ_1629_곱셈 {
	static int A, B, C;
	static int[] memo;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		A = scann.nextInt();
		B = scann.nextInt();
		C = scann.nextInt();
		//end input
		
		//overflow 날 수 있기 때문에 long 자료형을 사용해야함
		long answer = multiple(B);
		System.out.println(answer);
	}

	private static long multiple(int n) {
		if(n==0) return 1;
		if(n==1) return A % C;
		if(n%2 == 0) { //짝수이면
			long half = multiple(n/2) % C; //이부분을 이용하여 재귀 두번 곱하는 것보다 저장해서 사용해야함
			return (half * half) % C;
		}else {
			return A * multiple(n-1) % C;
		}
	}

}
