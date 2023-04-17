import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] arr = new boolean[100][100];
        int count = sc.nextInt();
        int black = 0;
        
        // 초기화 (false: 색칠 X / true: 색칠 O)
        for(int i =0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                arr[i][j] = false;
            }
        }
        
        // 색종이 영역 색칠
        for(int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = y; j < y+10; j++) {
                for(int k = x; k < x+10; k++) {
                    arr[j][k] = true;
                }
            }
        }
        
        // 색종이 영역 갯수 검사
        for(int i =0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] == true) {
                    black++;
                }
            }
        }
        
        sc.close();
        System.out.print(black);
    }
}