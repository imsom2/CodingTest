import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(br.readLine());

        int[] seq = new int[n];
        Set<Integer> sub = new HashSet<Integer>();
        for(int i =0; i<n; i++){
            seq[i] = Integer.parseInt(st.nextToken());
            sub.add(x-seq[i]);
        }

        int result = 0;
        for(int i=0; i<n; i++){
            if(sub.contains(seq[i])) {
                result++;
            }
        }

        System.out.println(result/2);

    }
}