import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    
    public static int[] card;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 가지고 있는 카드 N개 값 저장
        int n = Integer.parseInt(br.readLine());
        card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        // 주어진 수 M개의 값 저장
        int m = Integer.parseInt(br.readLine());
        int[] num = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        // 이진탐색을 위한 배열 정렬
        Arrays.sort(card);
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            
            int re = binarySearch(num[i]);
            
            // 찾는 값이 있으면 1, 없으면 0을 출력
            if(re >= 0) {
                sb.append(1 + " ");
            }
            else {
                sb.append(0 + " ");
            }
        }
        
        System.out.println(sb);

    }
    
    public static int binarySearch(int key) {
        // 이진탐색을 위한 탐색 범위 변수
        int left = 0;
        int right = card.length - 1;
        
        // 탐색 범위의 오른쪽 끝과 왼쪽 끝이 같을 때까지 탐색
        while(left <= right) {
            
            int mid = (left + right) / 2;
            
            // 찾을 값(key)가 중간 위치의 값보다 작은 경우
            if(key < card[mid]) {
                right = mid - 1; // 범위의 오른쪽 값을 조정
            }
            // 찾을 값(key)가 중간 위치의 값보다 큰 경우
            else if (key > card[mid]) {
                left = mid + 1; // 범위의 왼쪽 값을 조정
            }
            // 찾을 값(key)가 중간 위치의 값과 같은 경우
            else {
                return mid;
            }
        }
        
        // 찾으려는 값이 존재하지 않을 경우
        return -1;
    }
}