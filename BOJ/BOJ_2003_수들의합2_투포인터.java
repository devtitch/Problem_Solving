import java.util.Scanner;

public class BOJ_2003_수들의합2 {
	static int N, M;
	static int[] nums;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();
		nums = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = scann.nextInt();
		}//end input
		
		int answer = 0;
		int sum = 0;
		int i = 0;  //투포인터 start
		int j = 0;  //투포인터 end
		
		while(true) {
			if(sum >= M) {
				sum -= nums[i];
				i++;
			}else if(j > N-1) { //포인터 끝에 다다르면
				break;
			}else {
				sum += nums[j];
				j++;
			}
			
			if(sum == M) answer++;
		}
		
		System.out.println(answer);
	}

}
