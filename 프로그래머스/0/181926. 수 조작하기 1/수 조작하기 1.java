class Solution {
    public int solution(int n, String control) {        
        char[] change = control.toCharArray();
        for(int i: change){
            switch(i){
                case 'w':
                    n ++;
                    break;
                case 's':
                    n --;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -=10;
                    break;
                default :
                    break;
            }
            
        }
            
        return n;
    }
}