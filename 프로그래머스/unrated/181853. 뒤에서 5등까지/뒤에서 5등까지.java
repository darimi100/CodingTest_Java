class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int n = num_list.length;
        
        // 선택정렬(오름차순)
        for(int i = 0; i < n; i++) {
            
            int min = i;
            
            for(int j = i+1; j < n; j++) {
                if(num_list[j] < num_list[min]) {
                    min = j;
                }
            }
            
            int tmp = num_list[i];
            num_list[i] = num_list[min];
            num_list[min] = tmp;
        }
        
        // answer[]에 가장 작은 5개의 수 넣기    
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
            
        return answer;
    }
}