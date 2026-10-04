import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        // 맨앞, 맨뒤가 (///)로 끝나며, (의 개수와 )의 개수가 동일한 경우
        if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')'){
            int startnum = 0;
            int endnum = 0;
            for(int i=0; i<s.length(); i++){
                // 상쇄된 이후에 끝맺음 기호가 시작되면 false ( 순서 바뀐 경우 )
                if(startnum == 0 && s.charAt(i)==')') return answer;
                    
                if(s.charAt(i)=='(') startnum++;
                else if(s.charAt(i)==')') endnum++;
                
                // 상쇄되면 초기화
                if(startnum == endnum) { startnum = 0; endnum = 0;}
            }
            if(startnum == endnum) answer = true;
        }

        return answer;
    }
}