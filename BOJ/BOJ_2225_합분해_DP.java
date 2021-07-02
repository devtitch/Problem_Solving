import java.util.Scanner;

public class BOJ_2225_합분해_DP {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int K = scann.nextInt();
		int MOD = 1000000000;
		int[][] dp = new int[K+1][N+1];
		for(int i=0; i<=N; i++) dp[1][i] = 1;
		for(int i=0; i<=K; i++) dp[i][0] = 1;
		
		for(int i=2; i<=K; i++) {
			for(int j=1; j<=N; j++) {
				dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % MOD;
			}
		}
		System.out.println(dp[K][N]);
	}

}
