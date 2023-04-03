import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        
        int n1 = change(s1);
        int n2 = change(s2);
        
        if(n1 > n2) {
            System.out.print(n1);
        }
        else {
            System.out.print(n2);
        }
    }
    
    public static int change(String s) {
        int n = (s.charAt(2)-'0')*100 + (s.charAt(1)-'0')*10 + (s.charAt(0)-'0');
        return n;
    }
}