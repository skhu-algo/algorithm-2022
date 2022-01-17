package sinhyuk;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class programmers12922 {
    public String solution(int n) {
        return IntStream.range(0, n).mapToObj(o1 -> (o1 % 2 == 0) ? "수" : "박").collect(Collectors.joining());
    }
}
