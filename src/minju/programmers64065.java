import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int number = 0;
        for(int i = 0; i<s.length(); i++){
            int digit = s.charAt(i) - '0';
            if(0<=digit && digit <= 9){
                number= number*10 + digit;
            }else if(number>0){
                map.put(number, 1 + map.getOrDefault(number,0));
                number=0;
            }
        }
        int[] answer = new int[map.size()];
        for(int key : map.keySet())
            answer[answer.length - map.get(key)] = key;
        return answer;
    }
}