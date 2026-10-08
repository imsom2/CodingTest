import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();

        // 1. 각 기능마다 남은 일 수 계산
        Queue<Integer> days = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            int day = (100-progresses[i])/speeds[i];
            // 나머지가 있는 경우 +1
            if((100-progresses[i])%speeds[i]>0){days.add(day+1);}
            else{ days.add(day);}
        }
        
        // 2.앞의 숫자보다 뒤의 숫자가 작은 경우 다 빼면서 answer에 저장
        int max = days.poll();
        int i = 0;
        list.add(1);
        while(!days.isEmpty()){
            int next = days.poll();
            if(max >= next){ list.set(i,list.get(i)+1); }
            else { i++; max = next; list.add(1); }
        }
        
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}