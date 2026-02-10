import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	static LinkedList<Character> left = new LinkedList<>();
	static LinkedList<Character> right = new LinkedList<>();

	// L 왼쪽으로 한칸
	// D 오른쪽으로 한칸
	// B 커서의 왼쪽 문자 삭제 ( 위치는 오른쪽 문자 앞 그대로여야함 )
	// P $ $라는 문자를 커서 왼쪽에 추가
	public static void move(char command, char input) {
		switch (command) {
			case 'L':
				if (!left.isEmpty()) { right.addFirst(left.removeLast());}
				break;
			case 'D':
				if (!right.isEmpty()) {left.addLast(right.removeFirst());}
				break;
			case 'B':
				if (!left.isEmpty()) {left.removeLast();}
				break;
			case 'P':
				left.addLast(input);
				break;
			default:
				break;
		}
	}

    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int inputSize = s.length();
		for(int i=0; i<inputSize; i++){
			left.add(s.charAt(i));
		}

		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++){
			String cmd = br.readLine();
			char input = ' ';
			if(cmd.length() > 2){
				input = cmd.charAt(2);
			}
			move(cmd.charAt(0), input);
		}

		StringBuilder sb = new StringBuilder(left.size()+right.size());
		for(char c : left) sb.append(c);
		while(!right.isEmpty()) sb.append(right.removeFirst());
		System.out.print(sb);
	}
}
