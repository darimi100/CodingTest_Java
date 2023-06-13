import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        // 버블 정렬
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5 - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        // 출력
        System.out.println(sum/5);
        System.out.print(arr[2]);
    }
}