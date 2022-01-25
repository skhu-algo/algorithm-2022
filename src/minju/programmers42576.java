import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String i : participant){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(String i : completion){
            map.put(i, map.get(i) - 1);
        }
        
        for(String i : map.keySet()){
            if(map.get(i) != 0)
                answer = i;
        }
        
        return answer;
    }
}