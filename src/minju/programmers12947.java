class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int num = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            num += Character.getNumericValue(c);
        }
        
        if(x%num==0) answer = true;
        else answer = false;

        return answer;
    }
}