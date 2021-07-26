import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1932_정수삼각형 {
	static int N;
	static int[][] triangle;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		triangle = new int[N][N+1]; //index에러 방지
		StringTokenizer st = null;
		for (int i = 0; i < N; i++) {
			 st = new StringTokenizer(br.readLine());
			 int c = 1;
			 
			 while(st.hasMoreTokens()) {
				 triangle[i][c++] = Integer.parseInt(st.nextToken());
			 }
		}//end input
		
		int answer = get_max(triangle);
		System.out.println(answer);
		
	}
	private static int get_max(int[][] triangle) {
		int[][] dp = new int[N][N+1];
		
		dp[0][1] = triangle[0][1];
		int c = 2; //삼각형을 돌기 위한 index
		
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= c; j++) {
				int max_value = Math.max(dp[i-1][j-1], dp[i-1][j]);
				dp[i][j] = max_value + triangle[i][j];
			}
			c++;
		}
		
		Arrays.sort(dp[N-1]);
		return dp[N-1][N];
	}
}
