class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_st = Integer.toString(a);
        String b_st = Integer.toString(b);
        
        StringBuilder sb_ab = new StringBuilder(a_st);
        StringBuilder sb_ba = new StringBuilder(b_st);
        
        int a_b = Integer.parseInt(sb_ab.append(b_st).toString());
        int b_a = Integer.parseInt(sb_ba.append(a_st).toString());
        
        if(a_b<b_a) answer = b_a;
        else answer = a_b;

        return answer;
    }
}