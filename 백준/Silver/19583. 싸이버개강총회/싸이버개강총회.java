import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String[] sArr = st.nextToken().split(":");
        String[] eArr = st.nextToken().split(":");
        String[] qArr = st.nextToken().split(":");

        int S = Integer.parseInt(sArr[0]) * 60 + Integer.parseInt(sArr[1]);
        int E = Integer.parseInt(eArr[0]) * 60 + Integer.parseInt(eArr[1]);
        int Q = Integer.parseInt(qArr[0]) * 60 + Integer.parseInt(qArr[1]);

        // 아이디 , 입장 체크
        HashMap<String, Integer> Chatlist = new HashMap<>();
        String line;
        while((line = br.readLine()) != null){
            StringTokenizer stChat = new StringTokenizer(line," ");
            String time = stChat.nextToken();
            String id = stChat.nextToken();

            String[] timeArr = time.split(":");
            int T = Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);

            // 1. 입장 체크 S와 같거나 작은 경우
            // 2. 퇴장 체크 E보다 크고 Q보다 작거나 같은 경우
            if (T <= S) {
                Chatlist.put(id, 1);
            } else if (T >= E && T <= Q) {
                if (Chatlist.containsKey(id) && Chatlist.get(id) == 1) {
                    Chatlist.put(id, 2);
                }
            }
        }

        // map을 돌면서 value가 2인 경우의 수 세기
        int result = 0;
        for(int val: Chatlist.values()){
            if(val==2) result ++;
        }


        System.out.println(result);

    }
}