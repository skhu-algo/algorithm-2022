package sinhyuk;
//42840_모의고사
import java.util.*;
import java.util.stream.IntStream;

public class programmers42840 {
    public int[] solution(int[] answers) {
        int[][] way = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] r = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            r[0] += (answers[i] == way[0][i % way[0].length]) ? 1 : 0;
            r[1] += (answers[i] == way[1][i % way[1].length]) ? 1 : 0;
            r[2] += (answers[i] == way[2][i % way[2].length]) ? 1 : 0;
        }
        return IntStream.range(1, 4).filter(o1->r[o1-1] == Arrays.stream(r).max().getAsInt()).toArray();
    }
}
