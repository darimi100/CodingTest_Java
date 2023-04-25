import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        String s = "";
        while(n > 0) {
            int rest = n % b;
            
            if(rest < 10) {
                // 3 + '0' = '3'
                s += (char)(rest + '0');
            }
            else {
                // 10(A) - 10 + 'A' = 0 + 'A' = 'A'
                // 11(B) - 10 + 'A' = 1 + 'A' = 'B'
                s += (char)(rest - 10 + 'A');
            }
            
            n /= b;
        }
        
        for(int i = s.length() - 1; i > -1; i--) {
            System.out.print(s.charAt(i));
        }
    }
}