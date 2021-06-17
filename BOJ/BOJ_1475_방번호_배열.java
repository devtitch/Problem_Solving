import java.util.Scanner;

public class BOJ_1475_방번호_배열 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String roomNum = scann.next();
		
		int[] set = new int[10];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<roomNum.length(); i++) {
			int num = Integer.parseInt(roomNum.charAt(i)+"");
			set[num]++;
			if (num == 6 || num == 9) continue;
			
			max = Math.max(max, set[num]);
		}
		
		int sixAndnine = set[6]+set[9];
		if(sixAndnine % 2 == 0) {
			//더해서 짝수이면
			max = Math.max(max, sixAndnine/2);
		}else {
			max = Math.max(max, (sixAndnine+1)/2);
		}
		
		System.out.println(max);
	}

}
