import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        System.out.println(n.multiply(n.multiply(n)));
        System.out.print(3);
    }
}