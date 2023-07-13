import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] origin = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < n; i++) {
            origin[i] = sc.nextInt();
            sorted[i] = origin[i];
        }
        
        // 정렬
        Arrays.sort(sorted);
        
        int rank = 0;
        for(int v : sorted) {
            // 중복되지 않도록 이미 순위를 매겼다면(map에 들어가 있다면) 제외
            if(!map.containsKey(v)) {
                map.put(v, rank);
                rank++; // map에 넣고나면 다음 순위를 가르키도록 rank 값을 1 증가
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            // 원본 배열의 원소(key)에 대한 순위(value)를 가져와서 sb에 추가
            sb.append(map.get(key)).append(' ');
        }
        
        System.out.println(sb);
    } 
}