import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            int a = arr[i];
            sum += a*a;
        }
        
        System.out.print(sum%10);
    }
}