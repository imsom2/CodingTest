import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main{
	public static void main(String[] args) throws IOException {
		Deque<Integer> list = new ArrayDeque<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());

		for(int i=0; i<K; i++){
			int input = Integer.parseInt(br.readLine());
			if(input == 0 && !list.isEmpty()) list.pop();
			else list.push(input);
		}

		System.out.println(list.stream().reduce(Integer::sum).orElse(0));


	}
}
