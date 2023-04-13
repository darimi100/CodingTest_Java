import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            
            if (s.length() < 3) {
                cnt++;
            }
            else {
                boolean isEqual = false;

                for(int j = 1; j < s.length(); j++) {
                    if(s.charAt(j) != s.charAt(j-1)) {                  
                        for(int k = 0; k < j-1; k++) {
                            if(s.charAt(j) == s.charAt(k)) {
                                isEqual = true;
                                break;
                            }
                        }
                    }
                }

                if(!isEqual) {
                    cnt++;
                }
            }
            
        } // i for문 끝
        
        System.out.print(cnt);
    }
}