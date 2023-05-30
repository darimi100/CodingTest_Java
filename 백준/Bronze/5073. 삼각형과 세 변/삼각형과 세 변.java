import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l[] = new int[3];
        
        while (true) {
            for(int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
            }

            if(l[0] == 0) {
                break;
            }
            
            int maxI = 0;
            for(int i = 1; i < 3; i++) {
                if(l[i] > l[maxI]) {
                    maxI = i;
                }
            }
            
            int sum = 0;
            for(int i = 0; i < 3; i++) {
                if(i != maxI) {
                    sum += l[i];
                }
            }
        
            if(l[maxI] >= sum) {
                System.out.println("Invalid");
            }
            else if(l[0] == l[1] && l[1] == l[2]) {
                System.out.println("Equilateral");
            }
            else if(l[0] == l[1] || l[1] == l[2] || l[0] == l[2]) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }                
    }
}