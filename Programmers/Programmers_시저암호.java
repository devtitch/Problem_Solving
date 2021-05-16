import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] small = new char[26];
        char[] large = new char[26];
        
        char smallA = 'a';
        char largeA = 'A';
        
        for(int i=0; i<small.length; i++){
            small[i] = (char)(smallA+i);
            large[i] = (char)(largeA+i);
        }//초기화
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                answer += " "; 
                continue;
            }
            
            if(c >= 'a' && c <= 'z'){
                int index = c - 'a';
                answer += small[(index + n) % 26] + "";
            }else{
                int index = c - 'A';
                answer += large[(index + n) % 26] + "";
            }
        }
        
        return answer;
    }
}