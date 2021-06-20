import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2579_계단오르기_DP {
	/*
	 * 재귀로풀면 시간초과
	 */
	static int N;
	static int[] score;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		score = new int[N]; //1부터 N번째 계단까지
		
		for (int i = 0; i < N; i++) {
			score[i] = scann.nextInt();
		}//end input
		
		/*
		 * 점화식
		 * score[i] + dp[i-2]
		 * score[i] + score[i-1] + dp[i-3]  
		 * 두개 중 최댓값
		 */
		int[] dp = new int[300]; //계단의 개수 300이하 자연수		
		int answer = 0;
		
		//1개, 2개 계단 예외처리
		if(N==1) {
			System.out.println(score[0]);
			return;
		}else if(N==2) {
			System.out.println(score[0]+score[1]);
			return;
		}
		
		dp[0] = score[0];
		dp[1] = Math.max(score[1], score[0]+score[1]); 
		dp[2] = Math.max(score[0]+score[2], score[1]+score[2]);
		
		for(int i=3; i<N; i++) {
			dp[i] = Math.max(score[i]+dp[i-2], score[i]+score[i-1]+dp[i-3]);
		}
		
		System.out.println(dp[N-1]);
	}
}
