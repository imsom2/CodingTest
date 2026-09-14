import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> caseSet = new HashSet<>();
        for(int i:nums) caseSet.add(i);
        answer = Math.min(nums.length/2,caseSet.size());
        
        return answer;
    }
}