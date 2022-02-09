package sinhyuk;

import java.util.Scanner;

//19949_영재의 시험
public class boj19949 {
    static int getPossibleSubmit(int[] correctAnswer, int beforePrevAnswer, int prevAnswer, int i, int score) {
        int total = 0;
        if (i == 10) {
            return score >= 5 ? 1 : 0;
        }
        for (int j = 1; j <= 5; j++) {
            if (!(beforePrevAnswer == prevAnswer && prevAnswer == j)) {
                int newScore = (correctAnswer[i] == j) ? score + 1 : score;
                total += getPossibleSubmit(correctAnswer, prevAnswer, j, i + 1, newScore);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] correctAnswer = new int[10];
        for (int i = 0; i < 10; i++) {
            correctAnswer[i] = s.nextInt();
        }
        System.out.println(getPossibleSubmit(correctAnswer, -1, -1, 0, 0));
    }
}

