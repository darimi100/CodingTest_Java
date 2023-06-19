import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // 리스트 값 초기화
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        /*
        Timesort 방식 (합병 및 삽입정렬이 섞인 알고리즘)
        시간복잡도 O(n) ~ O(nlogn)을 보장
        일반적인 primitive 배열이 아닌 List 계열의 자료구조를 사용하여 정렬 
        */
        Collections.sort(list);
        
        // 값 출력
        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}