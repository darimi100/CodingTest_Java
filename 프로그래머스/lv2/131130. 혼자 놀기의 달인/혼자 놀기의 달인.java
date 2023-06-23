import java.util.*;

class Solution {
    static boolean[] opened;
    static int depth;
    
    public int solution(int[] cards) {
        int answer = 0;
        int l = cards.length;
        opened = new boolean[l+1];
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < l; i++) {
            if (!opened[i+1]) {
                // 방문 처리
                opened[i+1] = true;
                depth = 1;
                
                open(cards[i], cards);
                list.add(depth);
            }
        }
        
        // 상자 그룹이 1개인 경우이므로 게임 종료로 0점
        if(list.size() < 2) {
            return 0;
        }
        
        // list(상자 그룹 수) 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        answer = list.get(0) * list.get(1);
        
        return answer;
    }
    
    public void open(int index, int[] cards) {
        if (!opened[index]) {
            // 방문 처리
            opened[index] = true;
            depth++;
            
            // 재귀
            open(cards[index-1], cards);
        }
    }
}