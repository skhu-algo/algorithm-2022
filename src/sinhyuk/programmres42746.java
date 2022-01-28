package sinhyuk;

import java.util.Arrays;
import java.util.stream.Collectors;
//가장 큰 수
public class programmres42746 {
    public String solution(int[] numbers) {
        String tmp = Arrays.stream(numbers)
                .boxed()
                .sorted((o1, o2) -> (o2 + "" + o1).compareTo(o1 + "" + o2))
                .map(Object::toString)
                .collect(Collectors.joining());
        return tmp.charAt(0) == '0' ? "0" : tmp;
    }
}
