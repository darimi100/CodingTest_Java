import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        
        // 상근이가 가진 카드 n개 값 입력
        // KEY : 카드에 적힌 숫자, VALUE : 그 카드 수
        String[] strN = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String num = strN[i];
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        String[] strM = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            String num = strM[i];
            if (map.containsKey(num)) {
                sb.append(map.get(num) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        
        System.out.println(sb);
    }
}