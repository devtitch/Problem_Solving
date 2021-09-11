import java.util.Scanner;

public class BOJ_1543_문서검색_그리디 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String doc = scann.next();
		String word = scann.next();
		
		int answer = 0;
		
		for (int i = 0; i < doc.length(); i++) {
			if(word.charAt(0) != doc.charAt(i)) continue;
			if(i+word.length() > doc.length()) continue;
			
			boolean flag = true;
			for (int j = 0; j < word.length(); j++) {
				if(doc.charAt(i+j) != word.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer++;
				i += word.length();
			}
		}
		System.out.println(answer);
	}

}
