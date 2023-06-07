import java.util.Scanner;

class Main {
    public static boolean[][] arr;
    public static int min = 64; // 8*8칸을 모두 틀렸을 경우의 최댓값
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        arr = new boolean[n][m];
        
        // 배열 초기화
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            for (int j = 0; j < m; j++) {
                if(s.charAt(j) == 'W') {
                    arr[i][j] = true; // 'W' == true;
                }
                else {
                    arr[i][j] = false; // 'B' == false;
                }
                
            }
        }
        
        // 8*8 보드의 시작점 인덱스 범위의 끝을 지정 (0 ~ end_n - 1, 0 ~ end_m - 1)
        int end_n = n - 7;
        int end_m = m - 7;
        
        for (int i = 0; i < end_n; i++) {
            for (int j = 0; j < end_m; j++) {
                // 지정된 8*8 보드 안에서 변경할 칸 수를 찾아주는 메소드
                find(i, j);
            }
        } 
        
        //최소 변경 칸 수를 출력
        System.out.println(min);
    }
    
    public static void find(int x, int y) {
        // 8*8 보드
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;
        
        boolean TF = arr[x][y]; // 첫 번째 칸의 색
        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                
                // 올바른 색이 아닌 경우 cnt 1 증가
                if(arr[i][j] != TF) {
                    cnt++;
                }
                
                // 다음 칸은 색이 반대이므로
                // 값을 반대로 변경
                TF = !TF;
            }
            
            // 행의 마지막 칸과 다음 행의 시작 칸은
            // 같은 색상이어야 하므로 다시 값을 변경
            TF = !TF; 
        }
        
        // 시작 'B'일 때의 값 = 64 - 시작 'W'일 때의 값
        cnt = Math.min(cnt, 64 - cnt);
        // 최솟값 비교 후 갱신
        min = Math.min(min, cnt);
    }
}