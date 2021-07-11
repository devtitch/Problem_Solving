import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1149_RGB거리_DP {
	/*
	 * 반례 
	 	4
		1 1 1
		1 1 1
		2 1 2
		9 1 9
	 */
	static int N;
	static int[][] map;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		map = new int[N][3]; //빨, 초, 파
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				map[i][j] = scann.nextInt();
			}
		}//end input
		
		int[][] dp =new int[N][3];
		dp[0][0] = map[0][0];
		dp[0][1] = map[0][1];
		dp[0][2] = map[0][2];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + map[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + map[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + map[i][2];
		}
		
		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			answer = Math.min(answer, dp[N-1][i]);
		}
		System.out.println(answer);
	}
}
