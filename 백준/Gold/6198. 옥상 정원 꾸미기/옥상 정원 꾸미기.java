import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] stack = new int[N];
		int top = 0;
		long result = 0;

		for(int i=0; i<N; i++){
			int h = Integer.parseInt(br.readLine());

			// 새로 들어온 값 h보다 작거나 같은 값이면 내보내기
			while(top>0 && h>=stack[top-1]){
				top--;
			}
			// 남아있는 건물들은 h를 무조건 볼수있으므로 result에 건물 개수만큼 +
			result+=top;
			// h 저장 후 top 조정
			stack[top++] = h;
		}
		System.out.println(result);
	}
}
