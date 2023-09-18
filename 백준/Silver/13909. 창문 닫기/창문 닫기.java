import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 약수가 홀수여야 창문이 열리고 끝남.
        // 약수가 홀수(3개인 수) 1, 4, 9, 16, 25, ...
        // => 제곱근인 수를 기준으로 열린 창문의 수가 증가
        int count = 0;
        for(int i = 1; i*i <= n; i++) {
            count++;
        }
        
        System.out.println(count);
    }
}