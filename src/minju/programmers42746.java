import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i : numbers)
            list.add(String.valueOf(i));
        Collections.sort(list,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder builder = new StringBuilder();
        for(String s : list)
            builder.append(s);
        String s = builder.toString();
        return (s.charAt(0)=='0')? "0" : s; 
        
    }
}