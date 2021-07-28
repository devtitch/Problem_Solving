import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_11725_트리의부모찾기_DFS {
	static int N;
	static ArrayList<Integer>[] adj;
	static int[] parents;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		
		adj = new ArrayList[N+1];
		for (int i = 1; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>(); //인접 리스트 초기화
		}
		
		for (int i = 0; i < N-1; i++) {
			int node1 = scann.nextInt();
			int node2 = scann.nextInt();
			adj[node1].add(node2);
			adj[node2].add(node1); //인접 리스트 생성
		}//end input
		
		parents = new int[N+1]; //노드번호 1번부터
		visited = new boolean[N+1];
		
		for (int i = 1; i < N+1; i++) {
			if(!visited[i]) dfs(i);
		}
		
		for (int i = 2; i < parents.length; i++) {
			System.out.println(parents[i]);
		}
	}
	
	private static void dfs(int now) {
		if(visited[now]) return;
		
		visited[now] = true;
		for (int newnode : adj[now]) {
			if(!visited[newnode]) {
				parents[newnode] = now;
				dfs(newnode);
			}
		}
	}
}
