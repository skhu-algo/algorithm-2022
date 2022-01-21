package sinhyuk;

import java.util.Arrays;
import java.util.stream.IntStream;
//42889_실패율
public class programmers42889 {
    public int[] solution(int N, int[] stages) {
        double[][] answer = new double[N][2];
        IntStream.range(0, N).forEach(i -> {
            double total = Arrays.stream(stages).filter(s -> s >= i + 1).count();
            answer[i][0] = i + 1;
            answer[i][1] = total == 0 ? 0 : Arrays.stream(stages).filter(s -> s == i + 1).count() / total;
        });

        Arrays.sort(answer, (o1, o2) -> o1[1] == o2[1] ? (int) (o1[0] - o2[0]) : (o1[1] > o2[1]) ? -1 : 1);
        return Arrays.stream(answer).mapToInt(el -> (int) el[0]).toArray();
    }
}
