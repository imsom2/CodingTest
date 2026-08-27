import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        //1. 오름차순 정렬한다음에 비교
        //2. A의 가장 작은 숫자를 B가 이기지 못하면 모든 수가 이기지 못한다는 것
        Arrays.sort(A);
        Arrays.sort(B);
        if(A[0]>B[B.length-1]){return answer;}
        else{
            //3. 오름차순으로는 해결이 어려운 예제 : ( A:2 5 7 10 / B:1 3 6 8 )
            //A의 숫자보다 큰 수중에 가장 작은 수 매치하기
            //매치한 수를 기준으로 다음 숫자부터 비교하기
            int start = 0;
            for(int i=0;i<A.length;i++){
                for(int j=start;j<B.length;j++){
                    if(A[i]<B[j]){
                        answer++;
                        start=j+1;
                        break;
                    }
            }
        }
        return answer;}
    }
}