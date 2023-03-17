import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] basket = new int[sc.nextInt()];
        for(int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }
        
        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++) {
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            int tmp = basket[n1];
            basket[n1] = basket[n2];
            basket[n2] = tmp;
        }
        
        for(int i = 0; i < basket.length; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}