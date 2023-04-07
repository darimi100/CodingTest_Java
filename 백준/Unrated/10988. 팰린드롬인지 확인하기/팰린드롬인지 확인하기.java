import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = s.length() / 2;
        int l = s.length() - 1;
        int isP = 1;
        
        for(int i = 0; i < cnt; i++) {
            if(s.charAt(i) != s.charAt(l--)) {
                isP = 0;
            }
        }
        
        System.out.print(isP);
    }
}