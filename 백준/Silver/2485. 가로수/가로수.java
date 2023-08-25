import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        
        // 기존 나무 간격 입력 받기
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }
        
        // 나무 간격들의 g(최대공약수) 구하기
        int g = tree[1] - tree[0];
        for (int i = 2; i < n; i++) {
            g = gcd(tree[i] - tree[i-1], g);
        }
        
        // total : 간격 맞춰 심고 난 후의 전체 나무 수
        int total = (tree[n-1] - tree[0]) / g + 1;
        // 새로 심은 나무 수 = 모든 나무의 수(total) - 기존의 나무 수(n)
        System.out.println(total - n);
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
}