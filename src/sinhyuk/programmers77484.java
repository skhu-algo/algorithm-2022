package sinhyuk;
//로또의 최고 순위와 최저 순위
import java.util.*;
import java.util.stream.Collectors;

public class programmers77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winNumsSet = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        int commons = (int) Arrays.stream(lottos).filter(winNumsSet::contains).count();
        int zeros = (int) Arrays.stream(lottos).filter(el -> el == 0).count();

        return new int[]{commons + zeros == 0 ? 6 : 7 - commons - zeros, commons == 0 ? 6 : 7 - commons};
    }
}
