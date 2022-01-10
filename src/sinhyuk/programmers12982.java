package sinhyuk;

import java.util.Arrays;

//12982_예산
public class programmers12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        for(int i = 0; i<d.length; i++){
            if(d[i] > budget){
                return i;
            }
            budget -= d[i];
        }
        return d.length;
    }
}
