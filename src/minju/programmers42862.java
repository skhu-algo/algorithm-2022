import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        answer = n - lost.length;
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for(int k=0; k<lost.length; k++){
            for(int l=0; l<reserve.length; l++){
                if(lost[k]-1 == reserve[l] || lost[k]+1 == reserve[l] ){
                    reserve[l] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}