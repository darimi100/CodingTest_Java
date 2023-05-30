import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        
        if(a1+a2+a3 != 180) {
            System.out.print("Error");
        }
        else if(a1 == 60 && a2 ==60 && a3 == 60) {
            System.out.print("Equilateral");
        }
        else if(a1 == a2 || a2 == a3 || a1 == a3) {
            System.out.print("Isosceles");
        }
        else {
            System.out.print("Scalene");
        }
    }
}