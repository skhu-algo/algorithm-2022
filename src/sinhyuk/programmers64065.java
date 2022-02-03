package sinhyuk;

import java.util.*;
import java.util.stream.Collectors;

//튜플
public class programmers64065 {
    public int[] solution(String s) {
        return Arrays.stream(Arrays.stream(s.replaceAll("\\{\\{|}}", "").split("},\\{"))
                        .sorted((o1, o2) -> o1.length() - o2.length())
                        .collect(Collectors.joining(","))
                        .split(","))
                .distinct()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
