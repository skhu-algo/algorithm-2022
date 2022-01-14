class Solution {
    public StringBuilder solution(int n) {
        
        StringBuilder answer = new StringBuilder();
        for(int i=1; i<n+1; i++){
            if(i%2==0){
                answer.append("박");
            }else if(i%2==1){
                answer.append("수");
            }
        }
        return answer;
    }
}