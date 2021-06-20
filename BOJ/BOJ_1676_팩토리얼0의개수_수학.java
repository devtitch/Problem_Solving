import java.util.Scanner;

public class BOJ_1676_팩토리얼0의개수_수학 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int ans = 0;
		// N <= 500
		for(int i=1; i<=N; i++) {
			if(i%5 == 0) ans++;
			if(i%25 == 0) ans++;
			if(i%125 == 0) ans++;
		}
		
		System.out.println(ans);
	}
}
