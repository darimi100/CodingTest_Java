import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        // n이 1이 아닌 소수'인수로 끝난 경우
        if(n != 1){
            System.out.println(n);
        }
    }
}