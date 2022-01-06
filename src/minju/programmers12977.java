class Solution {
    public int solution(int[] nums) {
        int answer = 0;
         boolean check1 = true;
        
        
        for(int i=0; i<nums.length; i++){ //서로 다른 3개를 골라 더하는 반복문
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum >= 2){
                        check1 = primeCheck(sum);
                    }
                    if(check1 == true){
                        answer++;
                    }
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    
    public boolean primeCheck(int sum){ //소수인지 판단하는 메소드
        boolean check2 = true;
        if(sum == 2){
            return check2;
           
        }
        for(int i = 2; i<sum; i++ ){
               if (sum%i == 0){
                   check2 = false;
                    break;
                }
                }
        return check2;
            }
         
            
    
}