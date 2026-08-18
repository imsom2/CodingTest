class Solution {
    public long solution(int k, int d) {
        long answer = 0;

        // x^2 + y^2 <= d^2
        // y <= sqrt{d^2 - x^2}
        
        for(int x=0; x<=d; x+=k){
            int ymax = (int)Math.sqrt((long)d*d - (long)x*x);
            answer += ymax/k + 1;
        }
        
        return answer;
    }
}