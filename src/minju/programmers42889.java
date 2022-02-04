import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] 멈춤 = new int[N+1];
        for(int i : stages)
            멈춤[i-1]++;
        int[] 도달 = new int[N+1];
        도달[N] = 멈춤[N]; //마지막 스테이지를 통과한 다음의 도달값과 멈춤값이 같음
        for(int i = N-1; i>=0; --i)
            도달[i] = 도달[i+1] + 멈춤[i];
        double[][] 실패율 = new double[N][2];
        for(int i = 0; i<N; ++i){
            실패율[i][0] = (double)멈춤[i] / (double)도달[i]; //스테이지 i+1의 실패율
            실패율[i][1] = i+1; // 스테이지
        }
        Arrays.sort(실패율, (a,b) -> {
            int r = (int)Math.signum(b[0] - a[0]); //실패율 배열에서의 실패율을 내림차순으로 정렬
            return (r!=0) ? r : (int)(a[1] - b[1]); //실패율이 같은 경우 스테이지의 오름차순으로 정렬
        });
        int[] result = new int[N];
        for(int i = 0; i<N; ++i)
            result[i] = (int)실패율[i][1];
        return result;
    }
}