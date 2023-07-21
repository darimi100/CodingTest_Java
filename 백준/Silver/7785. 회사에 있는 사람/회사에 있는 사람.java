import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, state;
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        // enter - 출근(put) / leave - 퇴근(remove)
        for (int i = 0; i < n; i++) {
            name = sc.next();
            state = sc.next();
            sc.nextLine();
            
            if(state.equals("enter")) {
                map.put(name, 1);
            }
            else if(state.equals("leave")){
                map.remove(name);
            }
        }
        
        // Hashmap에 남아있는 키값(회사에 남은 사람 이름)을 리스트에 추가 
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(key);
        }
        
        // 리스트 사전 역순 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i =  0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}