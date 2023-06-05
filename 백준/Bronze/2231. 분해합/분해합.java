import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n의 자릿수를 구하기 위헤 String으로 입력받기
        String strN = sc.nextLine();
        int l = strN.length();
        // 정수형으로 변환
        int n = Integer.parseInt(strN);
        int result = 0;
        
        // for 생성자 찾기
        for(int i = n - (l*9); i < n; i++) {
            int x = i;
            int sum = 0;
            
            while(x != 0) {
                sum += x % 10; //각 자릿수 더하기
                x /= 10; // sum에 더한 뒷 자릿수 지우기
            }
            
            // i 값이 생성자인 경우
            if(sum + i == n) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}