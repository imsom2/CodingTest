import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		LinkedList<Integer> queue = new LinkedList<>();
		for(int i=1; i<N+1; i++) queue.addLast(i);

		int result = 0;

		//원소를 뽑아내는데 드는 2,3번 연산의 최솟값 출력
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<M; i++){
			int index = Integer.parseInt(st2.nextToken());

			int indexPos = queue.indexOf(index);
			if(indexPos <= queue.size() / 2) {
				// 앞에서 pop -> 뒤로 push 하면서 왼쪽 회전
				for(int j=0; j<indexPos; j++){
					queue.addLast(queue.removeFirst());
					result ++;
				}
			}
			else{
				// 뒤로 pop -> 앞으로 push 하면서 오른쪽 회전
				for(int k = 0; k < queue.size() - indexPos; k++){
					queue.addFirst(queue.removeLast());
					result ++;
				}
			}
			queue.removeFirst();
		}
		System.out.println(result);
	}
}
