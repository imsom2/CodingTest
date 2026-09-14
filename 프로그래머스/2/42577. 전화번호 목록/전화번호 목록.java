import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        // 한번호가 다른 번호 시작에 있으면 false
        
        Arrays.sort(phone_book);
        
        String before = "*";
        for(String num:phone_book){
            if(num.startsWith(before)) answer = false;
            before = num;
        }
        
        return answer;
    }
}