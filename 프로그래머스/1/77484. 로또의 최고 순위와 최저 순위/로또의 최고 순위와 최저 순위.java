class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        // 1. 확정 일치하는 경우 == 최저순위
        // 2. 아직 어떤 번호인지 모르는 수 == 1번+2번 == 최고순위
        // 3. 확정 불일치하는 경우
        
        int win = 0;
        int hold = 0;
        for(int i=0;i<6;i++){
            if(lottos[i] == 0) {hold++; continue;}
            for(int j=0;j<6;j++){
                if(lottos[i] == win_nums[j]) {win++; break;}
            }
        }
        
        int[] rank = {6,6,5,4,3,2,1};
        int[] answer = new int[]{rank[hold+win], rank[win]};
        
        return answer;
    }
}