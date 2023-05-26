import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        
        for(int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int a = x[0];
        int b = y[0];
        boolean isEqualX = false;
        boolean isEqualY = false;
        
        for(int i = 1; i < 3; i++) {
            if(a == x[i]) {
                isEqualX = true;
            }
            if(b == y[i]) {
                isEqualY = true;
            }
        }
        
        if(isEqualX){
            for(int i = 1; i < 3; i++) {
                if(x[i] != a) {
                    a = x[i];
                    break;
                }
            }
        }
        if(isEqualY){
            for(int i = 1; i < 3; i++) {
                if(y[i] != b) {
                    b = y[i];
                    break;
                }
            } 
        }
        
        System.out.print(a + " " + b);
    }
}