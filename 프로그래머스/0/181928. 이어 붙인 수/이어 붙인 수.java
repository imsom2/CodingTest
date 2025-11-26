class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        String odd = "";
        String even = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] %2 != 0 ) 
                odd = sb1.append(Integer.toString(num_list[i])).toString();
            else 
                even = sb2.append(Integer.toString(num_list[i])).toString();
        }
        
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}