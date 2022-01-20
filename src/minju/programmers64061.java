class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int top = 0;
        int count = 0;
        int[] stack = new int [board.length*board.length];
        for(int i :moves){
            --i;
            for(int j =0; j<board.length; j++){
                if(board[j][i]!=0){
                    if(stack[top]!=board[j][i]){
                        stack[++top]=board[j][i];
                    }else {
                        --top;
                        count+=2;
                     }board[j][i]=0; //게임판에서 인형 제거
                      break; //다음 열로 넘어감
                }
            }
        }
        
        return count;
    }
}