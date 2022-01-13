import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer =  n - lost.length;
        
        //배열 순차 정리
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //도난당한경우
        for (int i =0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    answer++;
                    lost[i]=-1; //제외
                    reserve[j]=-1; //제외
                    break;
                }
            }
        }
        
        //빌려주는경우
        for (int i =0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]-1==reserve[j]||lost[i]+1==reserve[j]){
                    answer++;
                    reserve[j]=-1; //도난 대상 제외
                    break;
                }
            }
        }
        return answer;
    }
}