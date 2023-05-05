import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        int x = (v - b) / (a - b);
        if((v - b) % (a - b) != 0) {
            x++;
        }
        
        System.out.print(x);
    }
}