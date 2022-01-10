import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
    
        for(int l=0; l<commands.length; l++){
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];
            int[] cut = new int [j-i+1]; //잘라낸 배열 선언
            int n = 0;
            for(int m=i-1; m<j; m++){ //i번째부터 j번째까지의 배열
                cut[n] = array[m];
                n++;
                
            }
            Arrays.sort(cut);
            answer[l] = cut[k-1];
            
        }
        
        return answer;
    }
}