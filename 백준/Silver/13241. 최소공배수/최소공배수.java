import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long g = gcd(a, b);
        System.out.println(a * b / g);
        
    }
    
    public static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }
}