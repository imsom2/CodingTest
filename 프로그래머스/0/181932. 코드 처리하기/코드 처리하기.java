class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        // 문자열에서 1을 만나면 mode를 짝수추가 0 false <-> 홀수추가 1 true 로 바꾸는 것
        
        boolean mode = false;
        for(int idx=0; idx<code.length();idx++){
            if(code.charAt(idx) == '1') mode = !mode;
            else{
                if(mode){
                    if(idx%2!=0) answer = sb.append(code.charAt(idx)).toString();
                }else{
                    if(idx%2==0) answer = sb.append(code.charAt(idx)).toString();
                }
            }
            
        }
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}
