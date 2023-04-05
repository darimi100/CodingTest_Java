import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n*2-1;
        
        for(int i = 1; i <= cnt; i++) {
            if(i <= n) {
                for(int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j = 1; j <= i % n; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= cnt - 2 * (i % n); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}