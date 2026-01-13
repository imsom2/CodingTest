import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K;
    static char[][] board;
    static int[] dx = {-1,-1,-1, 0,0, 1,1,1};
    static int[] dy = {-1, 0, 1,-1,1,-1,0,1};

    static Map<String, Integer> cnt = new HashMap<>();
    static char[] path = new char[5]; // 길이 최대 5

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) board[i][j] = line.charAt(j);
        }

        // 모든 시작점에서 길이 1~5 문자열 만들기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dfs(i, j, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            String q = br.readLine();
            sb.append(cnt.getOrDefault(q, 0)).append('\n');
        }
        System.out.print(sb.toString());
    }

    static void dfs(int x, int y, int depth) {
        path[depth - 1] = board[x][y];

        // depth 길이의 문자열을 map에 누적
        String s = new String(path, 0, depth);
        cnt.put(s, cnt.getOrDefault(s, 0) + 1);

        if (depth == 5) return;

        for (int dir = 0; dir < 8; dir++) {
            int nx = (x + dx[dir] + N) % N;
            int ny = (y + dy[dir] + M) % M;
            dfs(nx, ny, depth + 1);
        }
    }
}