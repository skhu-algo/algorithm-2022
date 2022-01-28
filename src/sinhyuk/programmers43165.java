package sinhyuk;
//타겟 넘버
public class programmers43165 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    int dfs(int[] numbers, int target, int sum, int index) {
        if (index == numbers.length) {
            return (sum == target) ? 1 : 0;
        }
        return dfs(numbers, target, sum + numbers[index], index + 1) +
                dfs(numbers, target, sum - numbers[index], index + 1);
    }
}
