import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1439_뒤집기_그리디 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int one = 0;
		int zero = 0;
		if(s.charAt(0) == '0') zero++;
		else one++;
		
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i-1) != s.charAt(i)) {
				if(s.charAt(i) == '0') zero++;
				else one++;
			}
		}
		
		System.out.println(Math.min(zero, one));
	}

}
