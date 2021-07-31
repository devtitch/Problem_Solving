import java.util.Scanner;

public class BOJ_11660_구간합구하기5 {
	static int N, M;
	static int[][] map;
	static StringBuilder sb;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();
		
		map = new int[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = map[i][j-1] + scann.nextInt(); //누적합을 구함
			}
		}
		
		sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int x1 = scann.nextInt();
			int y1 = scann.nextInt();
			int x2 = scann.nextInt();
			int y2 = scann.nextInt();
			
			get_answer(x1, y1, x2, y2);
		}
		System.out.println(sb.toString());
	}
	private static void get_answer(int x1, int y1, int x2, int y2) {
		int sum = 0;
		for (int i = x1; i <= x2; i++) {
			int row_sum = map[i][y2] - map[i][y1-1];
			sum += row_sum;
		}
		sb.append(sum).append("\n");
	}
}
