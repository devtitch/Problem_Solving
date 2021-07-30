import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2644_촌수계산_DFS {
	static int N, M, from, to, answer;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		from = scann.nextInt();
		to = scann.nextInt();
		M = scann.nextInt();
		
		adjList = new ArrayList[N+1]; //사람 번호 1번부터
		
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<Integer>(); //인접 리스트 초기화
		}
		
		for (int i = 0; i < M; i++) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			adjList[a].add(b);
			adjList[b].add(a);
		}//인접 리스트 생성
		
		answer = 0;
		visited = new boolean[N+1];
		
		dfs(from, 0);
		
		System.out.println(answer == 0 ? -1 : answer);
	}
	private static void dfs(int now, int cnt) {
		if(now == to) {
			answer = cnt;
			return;
		}
		
		visited[now] = true;
		
		for(int next : adjList[now]) {
			if(visited[next]) continue;
			dfs(next, cnt+1);
		}
	}
}
