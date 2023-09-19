import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        int nextIndex = 0;
        int[] arr = new int[k];
        int n;
        
        for (int i = 0; i < k; i++) {
            n = Integer.parseInt(br.readLine());
            
            if (n == 0) {
                nextIndex--;
            }
            else {
                arr[nextIndex++] = n;
            }
        }
        
        long sum = 0;
        for (int i = 0; i < nextIndex; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}