import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[][] supoza = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] score = new int [3];
        int max = 0;
        int[] answer = {};
        
        for(int i =0; i<3; i++){
           for(int j=0; j<answers.length; j++){
               if(answers[j]==supoza[i][j%supoza[i].length]){
                   ++score[i];
               }
           }if(max<score[i]){
                   max = score[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(max==score[i]){
                list.add(i+1);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}