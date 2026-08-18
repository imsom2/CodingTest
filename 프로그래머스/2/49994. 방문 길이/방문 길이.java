import java.util.*;

class Solution {
    public int solution(String dirs) {

        Set<String> path = new HashSet<>();
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        for(char dir:dirs.toCharArray()){
            switch(dir){
                case('U') -> y2++;
                case('D') -> y2--;
                case('R') -> x2++;
                case('L') -> x2--;
            }
            
            // 경계값에 도달한 경우 계산했던 좌표값을 원래대로 복원하고
            // 반복을 건너뛴다.
            if(y2<-5 || y2>5 || x2<-5 || x2>5){
                x2 = x1;
                y2 = y1;
                continue;
            }
            
            path.add(makeKey(x1,y1,x2,y2));
            x1=x2;
            y1=y2;
        }
        return path.size();
    }
    
    // 두 점 중에 무조건 작은 점이 먼저 오도록 순서를 정해서 비교하면
    // A->B, B->A를 같은 경우로 처리할 수 있음
    public String makeKey(int x1,int y1,int x2,int y2){
        if(x1<x2 || (x1==x2 && y1<y2)){
            return x1+","+y1+"->"+x2+","+y2;
        }else{
            return x2+","+y2+"->"+x1+","+y1;
        }
    }
}