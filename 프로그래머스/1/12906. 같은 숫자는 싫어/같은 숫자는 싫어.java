import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> numberq = new LinkedList<>();
        
        numberq.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]) numberq.add(arr[i]);
        }
        
        int[] answer = new int[numberq.size()];
        int j=0;
        while(!numberq.isEmpty()){
            answer[j] = numberq.poll();
            j++;
        }

        return answer;
    }
}