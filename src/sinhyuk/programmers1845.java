package sinhyuk;
//1845_폰켓몬
import java.util.*;
import java.util.stream.Collectors;

public class programmers1845 {
    public int solution(int[] nums) {
        Set<Integer> pocketMonster = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return (pocketMonster.size() > nums.length / 2) ? nums.length / 2 : pocketMonster.size();
    }
}
