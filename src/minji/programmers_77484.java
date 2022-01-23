import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0}; // 최고.최저 순위 배열 초기화
        int[] score = {6,6,5,4,3,2,1}; //등수 측정 배열

        int zero = 0; // 0으로 표기된 숫자 개수
        int match=0; //배열에 일치하는 숫자 개수
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for (int i= 0;i<lottos.length;i++){
            for(int j=0; j<win_nums.length;j++){
                if(lottos[i]==0){
                    zero++;
                    break;
                }
            
                if(lottos[i]==win_nums[j]){
                    match++;
                    break;
                }
            }
        }
    
        answer[0] = score[zero+match];
        answer[1] = score[match];
    
        return answer;
    }
}