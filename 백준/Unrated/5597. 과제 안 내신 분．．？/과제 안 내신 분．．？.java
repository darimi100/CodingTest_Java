import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] student = new boolean[30];
        
        for(int i = 0; i < 30; i++) {
            student[i] = false;
        }
        
        for(int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            student[num-1] = true;
        }
        
        for(int i = 0; i < 30; i++) {
            if(student[i] == false) {
                System.out.println(i+1);
            }
        }
    }
}