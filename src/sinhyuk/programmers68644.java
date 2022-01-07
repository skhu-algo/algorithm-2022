package sinhyuk;
//68644
//두 개 뽑아서 더하기
import java.util.HashSet;
import java.util.Set;

public class programmers68644 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        setNumber(numbers, set);
        return set.stream().mapToInt(Number::intValue).sorted().toArray();
    }

    public void setNumber(int[] numbers, Set<Integer> set) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
    }
}
