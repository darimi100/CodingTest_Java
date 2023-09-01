import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static boolean[] prime;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n != 0) {
            makePrime(n);
            sb.append(countPrime(n) + "\n");
            n = Integer.parseInt(br.readLine());
        }
        
        System.out.println(sb);
    }
    
    public static void makePrime(int x) {
        int n = 2 * x;
        prime = new boolean[n + 1];
        
        // false : 소수, true : 합성수
        prime[0] = prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            // 이미 체크됐다면 다음 반복으로 넘어가기
            if (prime[i]) {
                continue;
            } 
           
            for(int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
    
    public static int countPrime(int x) {
        int n = 2 * x;
        int cnt = 0;
        for(int i = x + 1; i <= n; i++) {
            // false : 소수, true : 합성수
            if(!prime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}