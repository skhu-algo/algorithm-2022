class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum =0; //자릿수 합 저장 변수
        int i= x; //x값 저장
        
        while(x!=0){
            sum+=x%10; 
            x/=10;
        }
        
        if(i%sum==0) return answer;
        else return false;
        
    }
}