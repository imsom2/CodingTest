class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_b = Integer.parseInt(""+a+b);
        answer = 2*a*b > a_b ? 2*a*b : a_b;
        return answer;
    }
}