import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 분수가 xn/xd, 두 번째 분수가 yn/yd
        // 분자: numerator / 분모: denominator
        int xn = sc.nextInt();
        int xd = sc.nextInt();
        int yn = sc.nextInt();
        int yd = sc.nextInt();
        
        // 최대공배수로 분모를 맞춘 후 두 분수를 합산
        int g = gcd(xd, yd); // 최대공약수
        int sumD = xd * yd / g; // 합한 분수의 분모 : 두 분모의 최대공배수
        int sumN = (xn * (sumD/xd)) + (yn * (sumD/yd)); // 합한 분수의 분자
        
        // 기약분수 만들기 : 분자, 분모의 최대공약수로 나누기
        int sumG = gcd(sumN, sumD);
        System.out.println(sumN/sumG + " " + sumD/sumG );
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
}