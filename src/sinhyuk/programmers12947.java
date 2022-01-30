package sinhyuk;

import java.util.stream.IntStream;
//하샤드 수
public class programmers12947 {
    public boolean solution(int x) {
        return x % IntStream.range(0, (x + "").length())
                .map(i -> Integer.parseInt((x + "").charAt(i) + ""))
                .sum() == 0;
    }
}
