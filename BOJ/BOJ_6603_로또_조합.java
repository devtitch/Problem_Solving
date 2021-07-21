import java.util.Arrays;
import java.util.Scanner;

public class BOJ_6603_로또 {
	/*
	 * k 개 중 6개를 뽑는 경우의 수
	 * 순서 상관없이 6개이므로 nCr
	 * 입력의 마지막에는 0
	 */
	static int[] lotto;
	static StringBuilder sb;
	public static void main(String[] args){
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int K = scann.nextInt();
			if(K == 0) break;
			
			int[] nums = new int[K];
			for (int i = 0; i < K; i++) {
				nums[i] = scann.nextInt();
			}

			sb = new StringBuilder();
			lotto = new int[6];
			nCr(nums, 0, 0);
			System.out.println(sb.toString());
		}
		
	
	}

	private static void nCr(int[] nums, int curr, int cnt) {
		if(cnt==6) {
			for (int i = 0; i < lotto.length; i++) {
				sb.append(lotto[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = curr; i < nums.length; i++) {
			lotto[cnt] = nums[i];
			nCr(nums, i+1, cnt+1);
		}
	}

}
