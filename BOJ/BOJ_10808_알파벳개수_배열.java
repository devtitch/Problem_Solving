import java.util.Scanner;

public class BOJ_10808_알파벳개수_배열 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String word = scann.next();
		int[] alphabet = new int[26];
		
		for(int i=0; i<word.length(); i++) {
			alphabet[word.charAt(i) - 'a']++;
		}
		
		for (int i : alphabet) {
			System.out.print(i + " ");
		}
	}
}
