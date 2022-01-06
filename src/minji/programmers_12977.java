class Solution {
    public int solution(int[] nums) {
        int answer = 0; //경우의 수 
        
        for (int i = 0; i< nums.length; i++){
            for (int j= i+1 ; j<nums.length; j++){
                for(int k = j+1 ; k< nums.length;k++){
                    int n= nums[i]+nums[j]+nums[k] //세 수 더하기
                    
                }
            }
        }
        
        
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}