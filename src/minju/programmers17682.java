import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int [] score = new int [3];
        int num = 0;
        String str = "";
        int index =0;
        for(int i =0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if('0'<= c && c<='9'){
                str += String.valueOf(c);
            }else if(c=='S' || c=='D' || c=='T'){
                num = Integer.parseInt(str);
                if(c=='S') {
                    num = (int)Math.pow(num, 1);
                }else if(c=='D') {
                    num = (int)Math.pow(num, 2);
                }else if(c=='T'){
                    num = (int)Math.pow(num, 3);
                }
                str = "";
                score[index++] = num;
            }else {
                if(c=='*'){
                    if(index-1==0){
                        score[index-1] *= 2;
                    }else{
                        score[index-2] *= 2;
                        score[index-1] *= 2;
                    }
                }else if(c=='#'){
                    score[index-1] *= (-1);
                }
            }
        }
        for(int i : score){
            answer += i;
        }
        return answer;
    }
}