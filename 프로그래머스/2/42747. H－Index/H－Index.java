import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        // h회 이상 인용된 논문이 h편 이상
        
        // 인덱스 0 0 에서는 5
        // 인덱스 1 1 에서는 4
        // 인덱스 2 3 에서는 3
        // 인덱스 3 5 에서는 2
        // 인덱스 4 6 에서는 1
        
        // 남은 논문 수와 인덱스 번호가 일치하면 !!
        // 오름차순 정렬시 현재위치를 포함한 뒷순서의 논문들은 무조건 인용횟수가 높은 것임
        // 현재 위치와 남은 논문 수가 같다면 h인 것,
        int result = 0;
        for(int i=0; i<citations.length; i++){
            if(citations[i] >= citations.length-i) {
                result = citations.length-i; 
                break;
            }
        }
        return result;
    }
}