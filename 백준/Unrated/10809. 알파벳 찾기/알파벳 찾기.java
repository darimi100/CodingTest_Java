import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] cnt = new int[26];
        
        for(int i = 0; i < 26; i++) {
            cnt[i] = -1;
        }
        
        int l = s.length();
        for(int i = 0; i < l; i++) {
            int n = (int)s.charAt(i);
            if(cnt[n - 97] == -1) {
                cnt[n - 97] = i;
            }
        }
        
        for(int i = 0; i < cnt.length; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}