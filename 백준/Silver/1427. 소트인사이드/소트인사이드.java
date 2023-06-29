import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        int[] num = new int[l];
        br.close();
        
        // int 배열로 변환
        for (int i = 0; i < l; i++) {
            num[i] = s.charAt(i) - '0';
        }        
        
        // 버블정렬
        for (int i = l-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i = l-1; i >= 0; i--) {
            sb.append(num[i]);
        }
        System.out.print(sb);
    }
}