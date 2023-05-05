import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x, y; // (x/y)
        
        while(n - i > 0) {
            n -= i;
            i++;
        }
        
        int t = i + 1;
        if(t % 2 == 0) {
            // t가 짝수인 경우
            x = t-1;
            y = 1;
            
            x -= (n-1);
            y += (n-1);
        }
        else {
            // t가 홀수인 경우
            x = 1;
            y = t-1;
            
            x += (n-1);
            y -= (n-1);
        }
        
        System.out.print(x + "/" + y);
        
    }
}