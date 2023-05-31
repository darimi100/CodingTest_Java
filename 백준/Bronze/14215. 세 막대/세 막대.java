import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[3];
        int maxI = 0;
        int sum = 0;
        
        for(int i = 0; i < 3; i++) {
            l[i] = sc.nextInt();
        }
        
        for(int i = 1; i < 3; i++) {
            if(l[i] > l[maxI])
                maxI = i;
        }
        
        for(int i = 0; i < 3; i++) {
            if(i != maxI) {
                sum += l[i];
            }
        }
        
        if(l[maxI] < sum) {
            System.out.print((sum + l[maxI]));
        }
        else {
            System.out.print(2*sum-1);
        }
    }
}