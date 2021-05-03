import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] correct = new int[3+1]; //index 1부터 사용
        
        int max_score = 0; // 가장 높은 점수
        
        for(int i=0; i<answers.length; i++){
            int ans = answers[i];
            if(ans == supo1[i%supo1.length]) correct[1]++;     
            if(ans == supo2[i%supo2.length]) correct[2]++;
            if(ans == supo3[i%supo3.length]) correct[3]++;
        }
        
        max_score = Math.max(correct[1], Math.max(correct[2], correct[3]));
        
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i=1; i<4; i++){
            if(correct[i] == max_score) {
                answerList.add(i);
            }
        }
        
        int[] answer = new int[answerList.size()];
        int index = 0;
        for(Integer i : answerList){
            answer[index] = i;
            index++;
        }
        
        return answer;
    }
}