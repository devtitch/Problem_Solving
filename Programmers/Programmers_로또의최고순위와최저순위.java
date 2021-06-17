import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<win_nums.length; i++){
            hs.add(win_nums[i]);
        } //HashSet을 이용
        
        int zeroNum = 0;
        int correct = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroNum++;
            }else if(hs.contains(lottos[i])){
                correct++;
            }
        }
        
        //최저 순위
        if(correct <= 1){
            answer[1] = 6;
        }else{
            answer[1] = 7-correct;
        }
        
        //0을 포함한 최고 순위
        if(correct + zeroNum <= 1){
            answer[0] = 6;
        }else{
            answer[0] = 7 - (correct+zeroNum);
        }
        
        return answer;
    }
}