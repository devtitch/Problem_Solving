import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14501_퇴사 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int[] days = new int[N+1]; //1일부터
		int[] cost = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			days[i] = scann.nextInt();
			cost[i] = scann.nextInt();
		} //end input
		
		int[] dp = new int[N+2];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < days.length; i++) {
			if(i+days[i] > N+1) continue; //퇴사한 이후
			dp[i] = Math.max(dp[i-1], dp[i]); //이전까지 최댓값과 현재의 최댓값 먼저 판단
			dp[i+days[i]] = Math.max(dp[i+days[i]], dp[i]+cost[i]); 
		}
		
		Arrays.sort(dp);
		System.out.println(dp[N+1]);
	}
}
