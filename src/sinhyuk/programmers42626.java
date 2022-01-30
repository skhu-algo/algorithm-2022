package sinhyuk;

import java.util.*;
//더 맵게
public class programmers42626 {
    public int solution(int[] scoville, int K) {
        int mixingTime = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(pq::add);
        while (!pq.isEmpty() && pq.peek() < K) {
            if (pq.size() <= 1) {
                return -1;
            }
            pq.add(pq.poll() + (pq.poll() * 2));
            mixingTime++;
        }
        return mixingTime;
    }
}
