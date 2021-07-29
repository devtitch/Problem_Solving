import java.util.Arrays;
import java.util.Scanner;

public class BOJ_4948_베르트랑공준_수학 {
	static boolean[] isPrime;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		isPrime = new boolean[123456*2 + 1];
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = scann.nextInt();
			if(n==0) break;
			
			int cnt = 0;
			for (int i = n+1; i <= 2*n; i++) {
				if(isPrime[i]) cnt++;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	private static void get_prime() {
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i*i < isPrime.length; i++) {
			for (int j = i*i; j < isPrime.length; j+=i) {
				isPrime[j] = false;
			}
		}
	}

}
