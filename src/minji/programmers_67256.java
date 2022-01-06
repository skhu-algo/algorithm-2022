class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = ?
        int right = ?
            
        for(int n: numbers){
            if (n==1 || n==4 || n==7){
                answer.append("L")
                left = n
            }
            else if(n==3 || n==6 || n==9){
                answer.append("R")
                right = n
            }
            else{
                
            }
        }
        
        
        return answer;
    }
}