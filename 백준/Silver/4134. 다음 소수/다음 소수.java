import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        BigInteger n;
        StringBuilder sb=new StringBuilder();
        
        for(int i = 0; i < cnt; i++) {
            n = new BigInteger(sc.next());
            if(n.isProbablePrime(100)) {
                sb.append(n + "\n");
            }
            else{
                sb.append(n.nextProbablePrime() + "\n");
            }
        }
        
        System.out.println(sb);
    }
}