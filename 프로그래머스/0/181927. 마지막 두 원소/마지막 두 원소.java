class Solution {
    public int[] solution(int[] num_list) {
        int i = num_list.length;
        int[] result = new int[i+1];
        for(int j=0; j<i; j++ ) result[j] = num_list[j];
        
        
        result[i] = (num_list[i-1]>num_list[i-2] ? num_list[i-1] - num_list[i-2] : num_list[i-1]*2 );
        
        return result;
    }
}