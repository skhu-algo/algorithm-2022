import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        for(int i=0; i<commands.length;i++){
            int[] tmp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]); //배열 자르기
            Arrays.sort(tmp); //정렬
            answer[i]=tmp[commands[i][2]-1];
        }
        return answer;
    }
}