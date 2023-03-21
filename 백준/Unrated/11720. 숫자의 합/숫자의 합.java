import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        
        for(int i = 0; i < n; i++) {
            // 아스키코드 '0' == 48
            sum += s.charAt(i) - 48;
        }
        
        System.out.print(sum);
        
    }
}