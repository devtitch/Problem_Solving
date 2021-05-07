import java.util.Stack;

public class Programmers_짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		int answer = solution(s);
	}

	public static int solution(String s){
        int answer = 0;
        
        if(s.length() < 2){
            return 0;
        }
        
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.add(s.charAt(i));
                continue;
            }else{
                if(c == stack.peek()){
                    stack.pop();
                }else{
                    stack.add(s.charAt(i));
                }
            }
        }
        
        answer = stack.isEmpty() ? 1 : 0;
        
        return answer;
    }
}
