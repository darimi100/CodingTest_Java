import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 2) {
                count++;
            }
            else if(x > 2) {
                boolean b = true;
                for(int j = 2; j < x; j++) {
                    if(x % j == 0) {
                        b = false;
                    }
                }
                if(b) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
}