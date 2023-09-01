import java.util.Scanner;

class Main {
    
    public static boolean[] prime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        makePrime(m);
        
        for(int i = n; i < prime.length; i++) {
            if(prime[i] == false) {
                System.out.println(i);
            }
        }
    }
    
    // 에라토스테네스의 체
    // : k = 2부터 sqrt(n)까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
    
    public static void makePrime(int n) {
        prime = new boolean[n + 1]; //index를 활용하므로 0 + 1~n를 위해서 +1
        
        /*
            boolean의 기본값 : false
            
            소수가 아닌 index : true
            소수인 index : false
        */

        prime[0] = prime[1] = true;

        // 2 미만이면 위(line 27)에서 지정했으므로 바로 return;
        if(n < 2) {
            
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            // 이미 판별된 배열이면 다음 반복문으로 넘어감
            if(prime[i] == true) {
                continue;
            }
            
            // i 의 배수들을 찾아서 true로 체크함
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
    }
}