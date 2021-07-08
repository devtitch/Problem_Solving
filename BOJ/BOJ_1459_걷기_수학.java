import java.util.Scanner;

public class BOJ_1459_걷기_수학 {
	static int X, Y, W, S;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		long X = scann.nextInt();
		long Y = scann.nextInt();
		long W = scann.nextInt();
		long S = scann.nextInt();
		
		//자료형때문에 계속 틀렸다 --> scanner로 받을 때도 long을 사용해줄것
		// long = int + int --> 오버플로우 발생한 것을 long 자료형에 넣는 것
		// long = long + long 으로 처리
		long garosero = (X+Y) * W;
		long daegak = (Math.min(X, Y)*S + Math.abs(X-Y)*W);
		long ans = Math.min(garosero, daegak);
		
		if((X+Y) % 2 == 0) { //짝수이면 대각선만으로 이동 가능
			//대각선 이동과 가로세로 이동 비교
			ans = Math.min(ans, Math.max(X, Y) * S);
		}else {
			ans = Math.min(ans,  (Math.max(X, Y) - 1)*S+W);
		}
		
		System.out.println(ans);
	}

}
