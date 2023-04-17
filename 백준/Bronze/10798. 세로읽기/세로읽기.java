import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];
       
        for(int i = 0; i < arr.length; i++) {
            String s = sc.next();
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
            for(int j = s.length(); j < 15; j++) {
                arr[i][j] = '-';
            }
        }
        
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i] != '-') {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}