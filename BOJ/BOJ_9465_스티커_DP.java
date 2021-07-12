import java.util.Scanner;

public class BOJ_9465_스티커_DP {
	static int T, N;
	static int[][] sticker;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			N = scann.nextInt();
			
			sticker = new int[2][N];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < N; j++) {
					sticker[i][j] = scann.nextInt();
				}
			}//end input
			
			int[][] dp = new int[2][N];
			dp[0][0] = sticker[0][0];
			dp[1][0] = sticker[1][0];
			dp[0][1] = dp[1][0] + sticker[0][1];
			dp[1][1] = dp[0][0] + sticker[1][1];
			
			for(int i = 2; i < N; i++) {
				dp[0][i] = Math.max(dp[1][i-1]+sticker[0][i], 
						Math.max(dp[0][i-2]+sticker[0][i], dp[1][i-2]+sticker[0][i]));
				dp[1][i] = Math.max(dp[0][i-1]+sticker[1][i], 
						Math.max(dp[0][i-2]+sticker[1][i], dp[1][i-2]+sticker[1][i]));
			}
			
			System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));
		}
	}
}
