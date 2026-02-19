import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 오큰수 : 오른쪽에 있으면서 A보다 큰 수 중에 가장 왼쪽에 있는 수
		int[] A = new int[N]; // 원래 리스트
		int[] stack = new int[N]; // 오큰수를 아직 못찾은 값의 인덱스들
		int[] oge = new int[N]; // 결과 오큰수 값
		Arrays.fill(oge,-1); // 못 찾은 경우 -1처리
		int top = 0;

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++){
			A[i] = Integer.parseInt(st.nextToken());

			while(top>0 && A[i] > A[stack[top-1]]){
				oge[stack[--top]] = A[i];
			}
			stack[top++] = i;
		}

		StringBuilder sb = new StringBuilder();
		for(int i: oge) sb.append(i).append(' ');
		System.out.println(sb);
	}
}
