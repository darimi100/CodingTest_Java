import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(sc.hasNext()) {
            cnt++;
            String a = sc.next();
        }
        
        System.out.print(cnt);
    }
}