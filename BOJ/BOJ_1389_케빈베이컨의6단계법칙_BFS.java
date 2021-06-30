import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1389_케빈베이컨의6단계법칙 {
	static int N, M;
	static boolean[][] adj;
	static int[][] kevin;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		adj = new boolean[N+1][N+1];
		kevin = new int[N+1][N+1]; //유저 1부터
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int user1 = Integer.parseInt(st.nextToken());
			int user2 = Integer.parseInt(st.nextToken());
			
			adj[user1][user2] = adj[user2][user1] = true;
		} //연결관계
		
		for (int i = 1; i <= N; i++) {
			bfs(i);
		}
		
		int min = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				sum += kevin[i][j];
			}
			
			if(min > sum) {
				ans = i;
				min = sum;
			}
		}
		
		System.out.println(ans);
		
	}
	private static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		boolean[] visited = new boolean[N+1]; //BFS 들어올때마다 visited 배열 초기화

		que.add(start);
		visited[start] = true;
		
		int cnt = 1;
		while(!que.isEmpty()) {
			int size = que.size();
			
			for (int i = 0; i < size; i++) {
				int now = que.poll();
				kevin[start][now] = kevin[now][start] = cnt;
				
				for (int j = 1; j < adj.length; j++) {
					if(adj[now][j] && !visited[j]) { //연결되어 있으면서 아직 방문안했으면
						visited[j] = true; //BFS는 들어갈때 방문 처리!!!!
						que.add(j);
					}
				}
			}
			cnt++;
		}
	}

}
