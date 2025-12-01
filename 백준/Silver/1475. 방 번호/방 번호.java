import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] result = new int[10];
        while(N>0){
            result[N%10]++;
            N/=10;
        }

        int max = result[0];
        int sum = (result[6] + result[9])/2 + (result[6] + result[9])%2;
        for(int i=0 ; i< result.length; i++){
            if(i==6 || i==9) result[i] = sum;
            max = Math.max(max, result[i]);
        }

        System.out.println(max);
    }
}