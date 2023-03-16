import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] basket = new int[sc.nextInt()];
        int count = sc.nextInt();
        
        for(int k = 0; k < basket.length; k++) {
            basket[k] = 0;
        }
        
        for (int i = 0; i < count; i++) {
            int start = sc.nextInt() - 1;
            int finish = sc.nextInt() - 1;
            int value = sc.nextInt();
            
            for(int j = start; j <= finish; j++) {
                basket[j] = value;
            }
        }
        
        for(int k = 0; k < basket.length; k++) {
            System.out.print(basket[k]+" ");
        }
    }
}