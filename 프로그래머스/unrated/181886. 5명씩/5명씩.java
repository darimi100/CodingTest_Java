class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        int l = names.length;
        
        if (l % 5 == 0) {
            l = l / 5;
        } else {
            l = (l / 5) + 1;
        }
        
        answer = new String[l];
        
        for(int i = 0; i < l; i++) {
            answer[i] = names[i*5];
        }
        
        return answer;
    }
}