class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=a; i< a+(included.length*d); i+=d){
            if(included[(i-a)/d]) answer += i;
        }
        
        
        
        return answer;
    }
}