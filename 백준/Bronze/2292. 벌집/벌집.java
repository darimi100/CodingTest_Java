import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int end = 1;
        int room = 1;
        int i = 1;
        
        while(n > end) {
            end += (6 * i);
            if(n <= end) {
                room = i+1;
                break;
            }
            i++;
        }
        
        System.out.print(room);
    }
}