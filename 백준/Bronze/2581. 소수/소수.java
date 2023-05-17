import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = m; i <= n; i++) {
            boolean isPN = findPrimeNumber(i);
            if(isPN){
                list.add(i);
            }
        }
        
        if(list.isEmpty()) {
            System.out.print(-1);
        } else {
            for(int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            
            System.out.println(sum);
            System.out.println(list.get(0));
        }
        
    }
    
    public static boolean findPrimeNumber(int x) {
        if (x == 2) {
            return true;
        } else if(x > 2) {
            boolean b = true;
            for(int j = 2; j < x; j++) {
                if(x % j == 0)
                    b = false;
            }
            
            if(b) {
                return true;
            }
            else {
                return false;
            }
            
        } else {
            return false;
        }

    }
}