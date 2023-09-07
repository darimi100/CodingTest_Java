import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        // 에라토스테네스의 체 : 2 ~ 1,000,000 사이의 소수 구하기
        boolean[] prime = new boolean[1000001];
        
        prime[0] = prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(1000000); i++) {
            // 이미 합성수로 체크되지 않았다면, 그 수의 배수를 합성수(true)로 표시
            if (!prime[i]) {
                for (int j = 2 * i; j < prime.length; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        
        for(int i = 0; i < t; i++) {
            
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            
            // 중복된 파티션을 제외하기 위해서 입력된 num의 절반까지만 검사
            for (int j = 2; j <= num / 2; j++) {
                if (!prime[j] && !prime[num - j]) {
                    cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
}