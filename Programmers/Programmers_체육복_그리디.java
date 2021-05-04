import java.util.*; 

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] cnt = new int[n+1];
        Arrays.fill(cnt, 1);
        cnt[0] = 0;
        
        for(int i=0; i<reserve.length; i++){
            cnt[reserve[i]]++;
        }
        
        for(int i=0; i<lost.length; i++){
            cnt[lost[i]]--;
        }
        
        for(int i=1; i<cnt.length; i++){
            if(cnt[i]==0){
                if(check(i-1, n) && cnt[i-1]>1){
                    cnt[i-1]--;
                    cnt[i]++;
                }else if(check(i+1, n) && cnt[i+1]>1){
                    cnt[i+1]--;
                    cnt[i]++;
                }
            }
        }
        
        for(int i=1; i<cnt.length; i++){
            if(cnt[i]>0){
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean check(int index, int n){
        return index>=1 && index<=n;
    }
}