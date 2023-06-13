import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // 배열 값 입력
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 선택 정렬
        for(int i = 0; i < n - 1; i++) {
            
            int tmp = i;
            
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[tmp])
                    tmp = j;
            }
            
            int t = arr[i];
            arr[i] = arr[tmp];
            arr[tmp] = t;
        }
        
        // 출력
        
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}