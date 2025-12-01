import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        int[] result = new int[10];
        int multiple = A*B*C;
        while(multiple>0){
            result[multiple%10]++;
            multiple/=10;
        }

        for(int i:result){
            System.out.println(i);
        }

        
    }
}