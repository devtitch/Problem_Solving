import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1914_하노이탑_재귀 {
	static ArrayList<int[]> steps;
	static int count;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int n = scann.nextInt();
		
		steps = new ArrayList<int[]>();
		
		System.out.println((long)(Math.pow(2, n)-1));
		if(n <= 20) {
			hanoi(n, 1, 3, 2);
		
			for (int i = 0; i < steps.size(); i++) {
				int[] step = steps.get(i);
				System.out.println(step[0] + " " + step[1]);
			}
		}
	}

	private static void hanoi(int n, int from, int to, int via) {
		if(n == 1) { //하나의 원판만 남았으면 1 -> 3
			steps.add(new int[] {from, to});
			count++;
		}else {
			//1.N-1개의 원판을 1 -> 2
			hanoi(n-1, from, via, to);
			steps.add(new int[] {from, to});
			count++;
			//2.N-1개의 원판을 2 -> 3
			hanoi(n-1, via, to, from);
		}
	}

}
