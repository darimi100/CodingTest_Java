import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        
        // arr 배열 초기화
        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        
        // m회 정렬 반복
        for(int i = 0; i < m; i++) {
            int begin = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int mid = sc.nextInt() - 1;
            int[] temp = new int[end-begin+1];
            int k = 0;
            
            for(int j = mid; j <= end; j++) {
                temp[k++] = arr[j];
            }
            
            for(int j = begin; j <= mid - 1; j++) {
                temp[k++] = arr[j];
            }
            
            k = 0;
            for(int j = begin; j <= end; j++) {
                arr[j] = temp[k++];
            }
        }
        sc.close();
        
        // arr 배열 출력
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}