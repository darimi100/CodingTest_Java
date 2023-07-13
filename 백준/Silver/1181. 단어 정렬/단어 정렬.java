import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        // next() 다음에 nextLine() 사용할 경우 next() 다음에 남은 개행을 버려주기
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        // 문장 정렬(comparator : 1. 길이 , 2. 사전 순서)
        Arrays.sort(arr, new Comparator<String>() {
           public int compare(String s1, String s2) {
               // 단어 길이가 같은 경우
               if (s1.length() == s2.length()) {
                   return s1.compareTo(s2); // 사전 순으로 정렬
               }
               else {
                   return s1.length() - s2.length();
               }
           } 
        });
        
        // 출력
        System.out.println(arr[0]);
        
        for (int i = 1; i < n; i++) {
            // 중복되지 않으면 출력
            if (!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
        
    }
}