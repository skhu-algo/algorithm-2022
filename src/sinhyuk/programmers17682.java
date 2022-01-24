package sinhyuk;

import java.util.Arrays;
//17682_[1차]다트 게임
public class programmers17682 {
    public int solution(String dartResult) {
        int[] scores = new int[3];

        int scoresI = 0;
        int i = 0;
        String numTmp = "";

        while (i < dartResult.length()) {
            char operator = dartResult.charAt(i);

            if (Character.isDigit(operator)) {
                numTmp += operator;
            }
            if (operator == 'S' || operator == 'D' || operator == 'T') {
                scores[scoresI++] = getScore(Integer.parseInt(numTmp), operator);
                numTmp = "";
            }
            if (operator == '#') {
                scores[scoresI - 1] = -scores[scoresI - 1];
            }
            if (operator == '*') {
                scores[scoresI - 1] *= 2;
                if (scoresI - 1 > 0) {
                    scores[scoresI - 2] *= 2;
                }
            }
            i++;
        }
        return Arrays.stream(scores).sum();
    }

    int getScore(int num, char operator) {
        switch (operator) {
            case 'D':
                return (int) Math.pow(num, 2);
            case 'T':
                return (int) Math.pow(num, 3);
            default:
                return num;
        }
    }
}
