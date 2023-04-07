import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        
        int cnt[] = new int[26];
        for(int i = 0; i < 26; i++) {
            cnt[i] = 0;
        }
        
        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 65]++;
        }
        
        int maxIndex = 0;
        boolean isQ = false;
        for(int i = 1; i < cnt.length; i++) {
            if(cnt[i] > cnt[maxIndex]){
                maxIndex = i;
                isQ= false;
            } else if(cnt[i] == cnt[maxIndex]) {
                isQ = true;
            }
        }
        
        if(isQ) {
            System.out.print("?");
        }
        else {
            System.out.print((char)(maxIndex+65));
        }
    }
}