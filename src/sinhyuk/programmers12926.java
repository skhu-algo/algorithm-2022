package sinhyuk;
//12926_시저암호
import java.util.stream.*;

public class programmers12926 {
    public String solution(String s, int n) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> {
                    char c = s.charAt(i);
                    return c == ' ' ? " " : Character.toString(c < 91 ? (c + n - 13) % 26 + 65 : (c + n - 19) % 26 + 97);
                })
                .collect(Collectors.joining());
    }
}
