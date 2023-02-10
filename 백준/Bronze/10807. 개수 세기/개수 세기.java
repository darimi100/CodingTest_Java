import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int cnt = 0;
        int n[] = new int[c];
        for(int i = 0; i < c; i++) {
            n[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        
        for(int i = 0; i < c; i++) {
            if(n[i] == v) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}