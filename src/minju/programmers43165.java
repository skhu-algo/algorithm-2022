class Solution {
    int sol(int[] numbers, int target, int index, int sum){
        if(index == numbers.length) return sum==target ? 1:0;
        int answer = 0;
        answer += sol(numbers, target, index+1, sum + numbers[index]);
        answer += sol(numbers, target, index+1, sum-numbers[index]);
        return answer;
    }
        
    public int solution(int[] numbers, int target) {
        return sol(numbers, target, 0, 0);
    }
}