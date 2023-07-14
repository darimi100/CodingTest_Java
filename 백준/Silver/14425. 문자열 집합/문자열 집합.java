import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
    
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        
        // 집합 s의 문자열 HaspMap에 값 저장
        // value는 필요 없으므로 1로 통일
        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), 1);
        }
        
        for(int i = 0; i < m; i++) {
            String s = br.readLine();
            if (map.get(s) != null) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}