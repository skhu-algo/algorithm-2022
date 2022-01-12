package sinhyuk;

import java.util.*;
import java.util.stream.Collectors;

//42862_체육복
public class programmers42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for (int l : lost) {
            for (int r : reserve) {
                if (l == r) {
                    lostList.remove((Integer) l);
                    reserveList.remove((Integer) r);
                }
            }
        }
        return n - lostList.size() + getMaximum(0, lostList, reserveList, 0);
    }

    public int getMaximum(int idx, List<Integer> lost, List<Integer> reserve, int total) {
        int maximum = Integer.MIN_VALUE;
        if (idx == lost.size()) {
            return total;
        }
        for (int i = -1; i < 2; i += 2) {
            if (reserve.contains(lost.get(idx) + i)) {
                reserve.remove((Integer) (lost.get(idx) + i));
                maximum = Math.max(maximum, getMaximum(idx + 1, lost, reserve, total + 1));
                reserve.add(lost.get(idx) + i);
            }
        }
        return Math.max(maximum, getMaximum(idx + 1, lost, reserve, total));
    }
}
