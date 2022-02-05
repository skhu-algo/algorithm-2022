import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        
        int h =0;
        int w=0;
        
        for(h=3;h<=(int)(brown+4)/2;h++){ //세로블록이 3개 미만 x_ h=3부터 시작
            w=((brown+4)/2)-h;
            if(w<h) break;
            
            
            int yellowNum= (w-2)* (h-2);
            if (yellow == yellowNum) break;
        }
        int[] answer = new int[]{w,h};
        return answer;
    }
}