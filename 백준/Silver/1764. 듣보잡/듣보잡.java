import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] cnts = br.readLine().split(" ");
        int n = Integer.parseInt(cnts[0]); // 듣도 못한 사람 수
        int m = Integer.parseInt(cnts[1]); // 보도 못한 사람 수
        int count = 0; // 듣도 보도 못한 사람 수
        
        Map<String, Integer> map = new HashMap<>();
        
        // 듣도 못한 사람 n명을 map에 입력
        // KEY : 듣도 못한 사람 이름
        // VALUE : 1(키가 존재하는지만 판별하므로 아무거나 상관없음)
        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), 1);
        }
        
        List<String> list = new ArrayList<>();
        
        // 듣도 못한 사람 목록(map)에 보도 못한 사람(name)이 있으면,
        // 듣도 보도 못한 사람 목록(list)에 추가하고 count 값 1 추가
        for(int i = 0; i < m; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                list.add(name);
                count++;
            }
        }
        
        // 배열로 변환 후 정렬
        String[] str = list.toArray(new String[list.size()]);
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();
        sb.append(count + "\n");
        for(String name : str) {
            sb.append(name + "\n");
        }
        
        System.out.println(sb);
    }
}