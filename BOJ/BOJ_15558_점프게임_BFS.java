import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_15558_점프게임 {
	static int N, k;
	static boolean[][] map, visited;
	static class Point{
		int r;
		int c; 
		
		public Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new boolean[2][N];
		
		for (int i = 0; i < 2; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				if(input.charAt(j) == '1') {
					map[i][j] = true;
				}else {
					map[i][j] = false;
				}
			}
		}//end input
		
		boolean gameClear = bfs();
		System.out.println(gameClear ? 1 : 0);
	}
	private static boolean bfs() {		
		visited = new boolean[2][N];
		
		Queue<Point> que = new LinkedList<>();
		que.add(new Point(0, 0));
		visited[0][0] = true;
		
		int time = 0;
		
		while(!que.isEmpty()) {
			int size = que.size();

			for (int i = 0; i < size; i++) {
				Point now = que.poll();
				int[][] dir = {{now.r, now.c+1}, {now.r, now.c-1}, {(now.r+1)%2, now.c+k}};
				for (int d = 0; d < 3; d++) {
					int nr = dir[d][0];
					int nc = dir[d][1];
					
					if(nc >= N) return true;
					
					if(nc < 0 || visited[nr][nc] || !map[nr][nc]) continue;
					
					if(nc == time) continue; //현재 시간과 같은 c의 칸으로 이동하는 경우는 큐에 넣으면 안된다
					
					visited[nr][nc] = true;
					que.add(new Point(nr,nc));
				}
			}
			
			//시간이 흘러서 앞쪽칸이 사라짐
			visited[0][time] = visited[1][time] = true;
			time++;
		}
		return false;
	}

}
