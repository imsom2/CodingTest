import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] result = new int[N];
		int[] stack = new int[N];
		int[] index = new int[N];
		int top = 0; // 살아남은 탑 개수

		// 자기보다 왼쪽에 있는 수 중, 자기보다 크면서 가장 오른쪽에 존재하는 수와 수신
		// 자기보다 왼쪽에 있는 수 중 자기보다 작다면, 그 이후의 탑들은 어차피 그 탑까지 도달못함
		// 현재 자신이 그 탑보다 크기 때문
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++){
			int max  = Integer.parseInt(st.nextToken());

			while(top>0 && stack[top-1]<=max){
				top--;
			}
			result[i] = top ==0 ? 0: index[top-1];
			stack[top] = max;
			index[top] = i + 1;
			top ++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i:result) sb.append(i).append(' ');
		System.out.println(sb);
	}
}
