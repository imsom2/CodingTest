class Solution {
    public int solution(int n) {
        int sum_odd = 0;
        int sum_even = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 == 0) sum_even += i*i;
            else sum_odd += i;
        }
        int answer = n % 2 == 0 ? sum_even : sum_odd;
        return answer;
    }
}