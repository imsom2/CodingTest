class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);
        for(int count=0; count<overwrite_string.length(); count++){
            sb.setCharAt(count+s,overwrite_string.charAt(count));
        }
        
        return sb.toString();
    }
}