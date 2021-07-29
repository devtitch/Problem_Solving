import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 반례
4 10 100
0 1 1 1 1 2 1 1 1 1
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 0
 */
public class BOJ_17836_공주님을구해라_BFS {
	static int R, C, T;
	static int[][] map;
	static boolean[][][] visited;
	
	static class Point{
		int r;
		int c;
		int hasGram;
		int time;
		
		public Point(int r, int c, int hasGram, int time) {
			this.r = r;
			this.c = c;
			this.hasGram = hasGram;
			this.time = time;
		}
	}
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		R = scann.nextInt();
		C = scann.nextInt();
		T = scann.nextInt();
		
		map = new int[R][C];
		visited = new boolean[R][C][2];
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				map[i][j] = scann.nextInt();
			}
		}//end input
		
		int answer = bfs();
		System.out.println(answer == 0 ? "Fail" : answer);
		
	}
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1}; //상하좌우
	private static int bfs() {
		Queue<Point> que = new LinkedList<Point>();
		que.add(new Point(0, 0, 0, 0));
		visited[0][0][0] = true;
		
		while(!que.isEmpty()) {
			Point p = que.poll();
			if(p.time > T) return 0;
			
			for (int d = 0; d < 4; d++) {
				int nr = p.r + dr[d];
				int nc = p.c + dc[d];
				
				if(!check(nr, nc)) continue; //map 범위 벗어나면
				
				if(nr == R-1 && nc == C-1) return p.time + 1;
				
				if(visited[nr][nc][p.hasGram]) continue; //방문한 곳이면
				if(p.hasGram == 0 && map[nr][nc] == 1) continue; //그람 없는데 벽이면
				
				visited[nr][nc][p.hasGram] = true;
				que.add(new Point(nr, nc, p.hasGram, p.time+1));
				
				if(map[nr][nc] == 2) {
					visited[nr][nc][1] = true;
					que.add(new Point(nr, nc, 1, p.time+1));
				}
			}
		}
		
		return 0;
	}
	
	private static boolean check(int nr, int nc) {
		return nr>=0 && nr<R && nc>=0 && nc<C;
	}

}
