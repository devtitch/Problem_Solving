import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3273_두수의합 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		
		int[] nums = new int[N];
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			int num = scann.nextInt();
			nums[i] = num;
			hs.add(num);
		}
		
		int X = scann.nextInt();
		//end input
		int answer = 0;
		for (int i = 0; i < N; i++) {
			int diff = X - nums[i];
			
			/*
			 * 반례
			 * 1
			 * 2
			 * 4
			 * answer : 0
			 */
			if(diff == nums[i]) continue; //이 조건을 추가해줘야함 추가하지 않으면 답이 1이 나옴
			
			if(hs.contains(diff)) {
				hs.remove(nums[i]);
				hs.remove(diff);
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
