package sinhyuk;

import java.util.Arrays;
//최소직사각형
public class programmers86491 {
    public int solution(int[][] sizes) {
        return Arrays.stream(sizes).mapToInt(c -> Math.min(c[0], c[1])).max().getAsInt() *
                Arrays.stream(sizes).mapToInt(c -> Math.max(c[0], c[1])).max().getAsInt();
    }
}
