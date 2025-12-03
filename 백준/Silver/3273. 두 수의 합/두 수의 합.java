import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(br.readLine());

        int[] seq = new int[n];
        for(int i =0; i<n; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(seq);

        int start = 0;
        int end = n-1;
        int result = 0;
        while(start<end){
            if(seq[start]+seq[end]==x) result++;

            if(seq[start]+seq[end]<x) start++;
            else end--;
        }

        System.out.println(result);

    }
}