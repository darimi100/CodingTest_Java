import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num / 4;
        
        for(int i = 0; i < x; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}