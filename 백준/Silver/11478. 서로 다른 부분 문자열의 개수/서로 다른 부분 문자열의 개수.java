import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length(); // 문자열 s의 길이
        
        Map<String, Integer> map = new HashMap<>();
        
        // i : 잘라낼 부분 문자열의 길이
        // 1: a, b, c,... | 2: ab, bc, cd,... | 3: abc, bcd,...
        for(int i = 1; i <= l; i++) {
            // # i에 맞춰서 부분 문자 만들기
            // j : 부분 문자열 시작 인덱스
            for(int j = 0; j <= l - i; j++) {
                // KEY : substring(j, j+i) -> 인덱스 j부터 j+i-1까지의 부분 문자열
                // VALUE : 1(키 중복 불가를 위해 Map을 사용하므로 아무 값)
                map.put(s.substring(j, j+i), 1);
            }
        }
        
        System.out.println(map.size());
    }
}