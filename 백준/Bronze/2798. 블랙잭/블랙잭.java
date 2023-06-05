import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] card = new int[n];
        int diff = m;
        
        for(int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        
        for(int i = 0; i <= n - 3; i++) {
            for(int j = i+1; j <= n - 2; j++) {
                for(int k = j+1; k <= n - 1; k++) {
                    int sum = card[i]+card[j]+card[k];
                    if(sum <= m && (m - sum) < diff) {
                        diff = m - sum;
                    }
                }
            }
        }
        
        System.out.println(m - diff);
        
    }
}