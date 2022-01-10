package sinhyuk;

import java.util.stream.IntStream;
//77884_약수의 개수와 덧셈
public class programmers77884 {
    public int solution(int left, int right) {
        return IntStream.range(left, right + 1).reduce(0, (x, y) -> getNumOfDivisors(y) % 2 == 0 ? x + y : x - y);
    }

    int getNumOfDivisors(int number) {
        return IntStream.range(1, number + 1).reduce(0, (x, y) -> number % y == 0 ? x + 1 : x);
    }
}
