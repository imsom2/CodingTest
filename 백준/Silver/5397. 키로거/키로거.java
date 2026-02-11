import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main{
	static Deque<Character> left = new LinkedList<>();
	static Deque<Character> right = new LinkedList<>();

	// 백스페이스 - : 커서 앞에 문자가 존재한다면 그 글자를 지움
	// 화살표 < > : 커서 왼쪽으로 1, 오른쪽으로 1
	public static void move(char command){
		switch(command){
			case '-': if(!left.isEmpty()) left.removeLast(); break;
			case '<': if(!left.isEmpty()) right.addFirst(left.removeLast()); break;
			case '>': if(!right.isEmpty())left.addLast(right.removeFirst()); break;
			default : left.addLast(command); break;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력 문자열 개수 L
		int L = Integer.parseInt(br.readLine());

		String[] result = new String[L];
		for(int i=0; i<L; i++){
			String input = br.readLine();
			for(int j=0;j<input.length();j++){
				move(input.charAt(j));
			}
			StringBuilder sb = new StringBuilder(left.size() + right.size());
			while(!left.isEmpty()) sb.append(left.removeFirst());
			while(!right.isEmpty()) sb.append(right.removeFirst());
			result[i] = String.valueOf(sb);
		}

		for(String i:result){
			System.out.println(i);
		}

	}
}
