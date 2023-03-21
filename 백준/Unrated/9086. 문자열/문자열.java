import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
            String s = sc.next();
            int l = s.length();
            System.out.println(String.valueOf(s.charAt(0))+String.valueOf(s.charAt(l-1)));
        }
    }
}