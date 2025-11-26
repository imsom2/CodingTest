class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        int sum_double = a*a + b*b + c*c;
        
        if(a != b && b != c && c != a) 
            answer = sum;
        else if(a == b && b == c && c == a) 
            answer = sum * sum_double * (a*a*a + b*b*b + c*c*c);
        else
            answer = sum * sum_double;
        
        
        
        return answer;
    }
}