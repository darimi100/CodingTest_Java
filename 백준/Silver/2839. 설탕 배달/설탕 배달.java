import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        while(n % 5 != 0) {
            n -= 3;
            if(n < 0) {
                count = -1;
                break;
            }
            else
                count++;
        }
        
        if(n > 0) {
            count += (n/5);
        }
        
        System.out.println(count);
        
        
        /*
        if (n == 4 || n == 7) {
			System.out.println(-1);
		}
		else if (n % 5 == 0) {
			System.out.println(n / 5);
		}
		else if (n % 5 == 1 || n % 5 == 3) {
			System.out.println((n / 5) + 1);
		}
		else if (n % 5 == 2 || n % 5 == 4) {
			System.out.println((n / 5) + 2);
		}
        */
    }
}