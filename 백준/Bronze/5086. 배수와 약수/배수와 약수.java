import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(a != 0 && b != 0){
            
            if(a % b == 0) {
                System.out.println("multiple");
            } else if (b % a == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
            
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}