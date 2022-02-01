import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int num =0;
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for(int i =0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
            w[i] = sizes[i][0];
            h[i] = sizes[i][1];
        }
        
        Arrays.sort(w);
        Arrays.sort(h);
        answer = w[sizes.length-1] * h[sizes.length-1];
        
        
        return answer;
    }
}