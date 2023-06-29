import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        
        // 입력
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        // 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                // 첫번째 원소(x 좌표)가 같다면 두번째 원소(y 좌표)를 비교
                if(e1[0] == e2[0]) {
                    return e1[1] - e2[1];
                }
                else {
                    return e1[0] - e2[0];
                }
            }    
        });
        
        /*
        [두 수의 비교 결과에 따른 작동 방식] - (기본인 오름차순의 경우)
        arr[i] - arr[i+1] 
        음수일 경우 : 두 원소의 위치를 교환 안함 (앞의 원소가 뒤의 원소보다 작다)
        양수일 경우 : 두 원소의 위치를 교환 함 (앞의 원소가 뒤의 원소보다 크다)
        */
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
        
		System.out.println(sb);
    }
}