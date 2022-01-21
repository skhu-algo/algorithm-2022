class Solution {
    public int solution(String s) {
        
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
        
        for (int i =0; i<10;i++){
            s= s.replace(words[i],nums[i]);
        }
        
        
        
        return Integer.parseInt(s);
    }
}