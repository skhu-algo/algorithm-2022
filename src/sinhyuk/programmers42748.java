package sinhyuk;
//42748
//K번째수
import java.util.Arrays;
import java.util.stream.IntStream;

public class programmers42748 {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands).mapToInt(el->getK(array, el[0],el[1],el[2])).toArray();
    }

    public int getK(int[] array, int start, int end, int k) {
        int[] cutArray = IntStream.range(start - 1, end).map(el -> array[el]).toArray();
        Arrays.sort(cutArray);
        return cutArray[k - 1];
    }
}
