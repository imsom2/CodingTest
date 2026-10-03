import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> countMap = new HashMap<>();
        
        
        for(int i=0;i<clothes.length;i++){
            String type = clothes[i][1];
            countMap.put(type,countMap.getOrDefault(type,0)+1);
        }
        
        // 각 종류별 개수를 곱하기, 단 해당 종류 안 입을 경우 포함
        for(String j:countMap.keySet()){
            answer *= countMap.get(j)+1;
        }
        
        // 모든 종류를 안 입을 경우 제외
        return answer-1;
    }
}