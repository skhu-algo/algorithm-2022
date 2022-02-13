class Solution { 
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = brown + yellow;
        
        for(int i=1; i<=w; i++){
            int row = i ; //세로
            int col= w/row; //가로
            if((row-2)*(col-2)==yellow){
                answer[0] = row;
                answer[1] = col;
            }
        }
        return answer;
    }
}