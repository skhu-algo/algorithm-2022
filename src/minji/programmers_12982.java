import java.util.* ;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0; // 지원 개수
        int sum=0; //베열 합 저장
        
        Arrays.sort(d); //배열 오름차순 정렬
        
        for (int i =0; i<d.length; i++){
            if( sum +d[i]>budget){ //배열 합이 예산보다 크면
                break;
            }
            sum +=d[i];
            answer++;
            
        }
        return answer;
    }
}