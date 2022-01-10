class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int count = 0; //약수의 개수
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            } if (count%2 == 0){ //짝수면 더하고
                answer += i;
            }else { //홀수면 뺀다
                answer -= i;
            }
        }
        
        
        return answer;
        
    }
}