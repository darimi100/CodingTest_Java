import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        sc.close();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt++;
            
            if (c == 'c') {
               if (i+1 < s.length()) {
                   if (s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                       i++;
                   }
               }
            }
            
            else if (c == 'd') {
                if(i+1 < s.length()) {
                    if (s.charAt(i+1) == 'z') {
                        if (i+2 < s.length()) {
                            if(s.charAt(i+2) == '=') {
                                i += 2;
                            }
                        }
                    }
                    else if (s.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }
            
            else if (c == 'l') {
               if (i+1 < s.length()) {
                   if (s.charAt(i+1) == 'j') {
                       i++;
                   }
               }
            }
            
            else if (c == 'n') {
               if (i+1 < s.length()) {
                   if (s.charAt(i+1) == 'j') {
                       i++;
                   }
               }
            }
            
            else if (c == 's') {
               if (i+1 < s.length()) {
                   if (s.charAt(i+1) == '=') {
                       i++;
                   }
               }
            }
            
            else if (c == 'z') {
               if (i+1 < s.length()) {
                   if (s.charAt(i+1) == '=') {
                       i++;
                   }
               }
            }
        }
        
        System.out.print(cnt);
    }
}