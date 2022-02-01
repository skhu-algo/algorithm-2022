package sinhyuk;

import java.util.HashSet;
import java.util.Set;
//소수 찾기
public class programmers42839 {
    Set<String> primeNumbers = new HashSet<>();

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        setPrimeNumber(numbers.toCharArray(), visited, "");
        return primeNumbers.size();
    }

    void setPrimeNumber(char[] numbers, boolean[] visited, String tmp) {
        if (tmp.length() > 0 && isPrimeNumber(Integer.parseInt(tmp))) {
            primeNumbers.add(Integer.toString(Integer.parseInt(tmp)));
        }
        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                setPrimeNumber(numbers, visited, tmp + numbers[i]);
                visited[i] = false;
            }
        }
    }

    boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 0 && number != 1;
    }
}
