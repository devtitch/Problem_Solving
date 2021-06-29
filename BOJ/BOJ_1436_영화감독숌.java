import java.util.Scanner;

public class BOJ_1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		
		String six = "666";
		int answer = 0;
		int i = 666;
		
		while(true) {
			String num = i+"";
			if(num.contains(six)) {
				answer++;
			}
			
			if(answer == N) {
				System.out.println(num);
				break;
			}
			i++;
		}
	}

}
