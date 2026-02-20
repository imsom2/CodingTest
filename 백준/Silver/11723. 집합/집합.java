import java.io.*;

public class Main {
	static boolean[] val = new boolean[21];
	static int[] ver = new int[21];
	static int curVer = 1;
	static boolean allState = false;

	static boolean get(int x) {
		return (ver[x] == curVer) ? val[x] : allState;
	}

	static void set(int x, boolean v) {
		ver[x] = curVer;
		val[x] = v;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());

		StringBuilder out = new StringBuilder();

		for (int i = 0; i < M; i++) {
			String line = br.readLine();
			char c = line.charAt(0);

			if (c == 'a') {
				if (line.length() == 3) {
					curVer++;
					allState = true;
				} else {
					int x = Integer.parseInt(line.substring(4));
					set(x, true);
				}
			} else if (c == 'r') {
				int x = Integer.parseInt(line.substring(7));
				set(x, false);
			} else if (c == 'c') {
				int x = Integer.parseInt(line.substring(6));
				out.append(get(x) ? 1 : 0).append('\n');
			} else if (c == 't') {
				int x = Integer.parseInt(line.substring(7));
				set(x, !get(x));
			} else {
				curVer++;
				allState = false;
			}
		}

		System.out.print(out.toString());
	}
}
