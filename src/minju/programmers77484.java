import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int match = 0;
        int zero = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[j]!=0 && lottos[j]== win_nums[i]) {
                    match++;
                }
            }
        }
        
        for(int i : lottos){
            if(i==0) zero++;
        }
        
        answer[0] = zero + match;
        answer[1] = match;
        
        for(int i=0; i<answer.length; i++ ){
            switch(answer[i]){
                case 6: answer[i] = 1; 
                        break;
                case 5: answer[i] = 2;
                        break;
                case 4: answer[i] = 3; 
                        break;
                case 3: answer[i] = 4; 
                        break;
                case 2: answer[i] = 5; 
                        break;
                default: answer[i] = 6;
            }
        }
        
        return answer;
    }
}