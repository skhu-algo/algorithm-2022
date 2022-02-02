package sinhyuk;
//카펫
public class programmers42842 {
    public int[] solution(int brown, int yellow) {
        for (int i = yellow; i >= 1; i--) {
            if (yellow % i == 0) {
                int yellowHeight = yellow / i;
                if (2 * (i + yellowHeight) + 4 == brown) {
                    return new int[]{i + 2, yellowHeight + 2};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
