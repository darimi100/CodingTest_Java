import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] arr1 = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        float[] arr2 = {4.5F, 4.0F, 3.5F, 3.0F, 2.5F, 2.0F, 1.5F, 1.0F, 0F};
        float sum1 = 0, sum2 = 0;
        
        for (int i = 0; i < 20; i++) {
            sc.next();
            float credit  = sc.nextFloat();
            String g = sc.next();
            
            if(!g.equals("P")) {
                int index = Arrays.binarySearch(arr1, g);
                sum1 += credit;
                sum2 += credit * arr2[index];
            }
        }
        
        System.out.print((float)Math.round((float)sum2/sum1*1000000) / 1000000);
        
    }
}