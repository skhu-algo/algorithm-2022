package sinhyuk;
//42576_완주하지 못한 선수
import java.util.*;

public class programmers42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(completion).forEach(el -> map.put(el, map.getOrDefault(el, 0) + 1));
        Arrays.stream(participant).forEach(el -> map.put(el, map.getOrDefault(el, 0) - 1));
        return Arrays.stream(participant).filter(el -> map.get(el) == -1).findFirst().orElseThrow();
    }
}
