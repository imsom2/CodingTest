import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String,Integer> rm = new HashMap<>();
        
        for(String i:participant) rm.put(i,rm.getOrDefault(i,0)+1);
        for(String j:completion) rm.put(j,rm.get(j)-1);
        
        for(String key:rm.keySet()){
            if(rm.get(key)>0) answer = key;
        }
        
        return answer;
    }
}