package sinhyuk;
//64061_크레인 인형뽑기 게임
import java.util.Stack;

public class programmers64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dolls = new Stack<>();
        for (int i : moves) {
            int col = 0;
            while (col < board.length) {
                if (board[col][i - 1] != 0) {
                    if (!dolls.isEmpty() && dolls.peek() == board[col][i - 1]) {
                        dolls.pop();
                        answer += 2;
                    } else {
                        dolls.add(board[col][i - 1]);
                    }
                    board[col][i - 1] = 0;
                    break;
                }
                col++;
            }
        }
        return answer;
    }
}
