import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2644_촌수계산_BFS {
	static int N, M, from, to;
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
		
		int answer = bfs();
		System.out.println(answer);
	}
	
	private static int bfs() {
		int cnt = 0;
		visited = new boolean[N+1];
		Queue<Integer> que = new LinkedList<>();
		
		que.add(from);
		visited[from] = true;
		
		while(!que.isEmpty()) {			
			int size = que.size();
			
			for (int i = 0; i < size; i++) {
				int now = que.poll();
				
				if(now == to) {
					return cnt;
				}
				
				for(int next : adjList[now]) {
					if(!visited[next]) {
						visited[next] = true;
						que.add(next);
					}
				}
			}
			cnt++;
		}
		
		return -1;
	}

}
