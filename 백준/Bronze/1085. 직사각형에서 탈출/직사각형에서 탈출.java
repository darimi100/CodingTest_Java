import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = x;
        
        int[] arr = new int[3];
        arr[0] = y;
        arr[1] = w-x;
        arr[2] = h-y;
        
        for(int i = 0; i < 3; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        System.out.print(min);
    }
}