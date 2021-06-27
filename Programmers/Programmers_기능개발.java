import java.util.*;

public class Programmers_기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		int[] answer = solution(progresses, speeds);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] solution(int[] progresses, int[] speeds) {
		int[] days = new int[progresses.length];
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i < progresses.length; i++) {
			int diff = 100 - progresses[i];
			
			if(diff % speeds[i] == 0) { //나눠 떨어지면
				days[i] = diff / speeds[i];
			}else {
				days[i] = (diff / speeds[i]) + 1; 
			}
		}//작업을 완료하는데 며칠이 걸리는지 
		
		int max = days[0];
		int works = 0;
		
		for (int i = 0; i < days.length; i++) {
			if(days[i]<=max) {
				works++;
			}else {
				ans.add(works);
				works = 1;
				max = days[i];
			}
		}
		
		ans.add(works);
		
		
		int[] answer = new int[ans.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = ans.get(i);
		}
		
		return answer;
	}

}
