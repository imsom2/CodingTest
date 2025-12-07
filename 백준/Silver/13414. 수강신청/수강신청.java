import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> list = new HashMap<>();
        for(int i=0; i<L; i++){
            String student = br.readLine();
            if(list.containsKey(student)) // 지우고 대기 목록의 맨 뒤로
                list.remove(student);
            list.put(student, i);
        }

        List<Integer> values = new ArrayList<Integer>(list.values());
        Collections.sort(values); // 신청 순서대로 sort

        HashMap<Integer,String> reverse = new HashMap<>();
        for(Map.Entry<String, Integer> elem : list.entrySet()){
            reverse.put(elem.getValue(),elem.getKey()); // 신청 순서로 학번 찾을 수 있게 위치 바꾸기
        }

        // 신청자 수보다 최대 수강 가능 인원이 많은 경우 처리
        // 둘 중 작은 값만큼 학번 출력
        for(int i=0; i<Math.min(K,values.size());i++){
            System.out.println(reverse.get(values.get(i)));
        }

    }
}