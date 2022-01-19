package sinhyuk;
//숫자 문자열과 영단어
import java.util.*;
import java.util.stream.Stream;

public class programmers81301 {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        String tmp = "";
        Map<String, Integer> nums = new HashMap<>();
        Stream.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
                .forEach(el -> nums.put(el, nums.size()));

        for (int i = 0; i < s.length(); i++) {
            answer.append((Character.isDigit((s.charAt(i)))) ? s.charAt(i) : "");
            tmp += (Character.isAlphabetic(s.charAt(i))) ? s.charAt(i) : "";
            if (nums.containsKey(tmp)) {
                answer.append(nums.get(tmp));
                tmp = "";
            }
        }

        return Integer.parseInt(answer.toString());
    }
}
