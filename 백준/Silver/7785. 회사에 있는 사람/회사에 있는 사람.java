import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String,String> log = new HashMap<>();
        String[] names = new String[n];
        int i=0;
        while(i<n){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            String check = st.nextToken();
            names[i] = name;
            log.put(name,check);
            i++;
        }
        for(int j=0; j<n; j++){
            if("leave".equals(log.get(names[j]))){
                log.remove(names[j]);
            }
        }

        List<String> keys = new ArrayList<>(log.keySet());
        keys.sort(Collections.reverseOrder());

        for(String key: keys){
            System.out.println(key);
        }

    }
}