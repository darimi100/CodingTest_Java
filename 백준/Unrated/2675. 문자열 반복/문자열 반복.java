import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
            
            int n = sc.nextInt();
            String s = sc.next();
            
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < n; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}