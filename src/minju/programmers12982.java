import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0; //부서별 신청 금액의 합
        int count =0;// 지원 가능한 부서의 수
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum<=budget){
                count++;
            }
        }
        
        answer = count;
        
        return answer;
    }
}