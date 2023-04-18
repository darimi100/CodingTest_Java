import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int r = sc.nextInt();
        
        System.out.print(Integer.parseInt(s, r));
    }
}