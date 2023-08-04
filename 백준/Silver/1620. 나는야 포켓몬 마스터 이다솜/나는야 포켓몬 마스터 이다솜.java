import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        
        // 이름 규칙 : map_KEY자료형
        Map<String, Integer> map_str = new HashMap<>();
        Map<Integer, String> map_int = new HashMap<>();
        
        // n개의 포켓몬 도감 1~n번의 이름 입력
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map_str.put(name, i);
            map_int.put(i, name);
        }
        
        // m개의 문제 처리
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if (isNum(q)) {
                sb.append(map_int.get(Integer.parseInt(q)) + "\n");
            }
            else {
                sb.append(map_str.get(q) + "\n");
            }
        }
        
        // StringBuilder sb 값 출력
        System.out.println(sb);
    }
    
    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            // str의 i 번째 문자가 숫자가 아니면 false를 리턴
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        // str 문자열의 끝까지 검사한 결과 모두 숫자였으면 true를 리턴
        return true;
    }
}