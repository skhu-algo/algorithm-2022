package sinhyuk;

public class programmers12977 {
    public int solution(int[] nums) {
        return getNumOfPrimeNumber(nums, 0, 0, 3);
    }

    public int getNumOfPrimeNumber(int[] nums, int sum, int index, int layer) {
        if (layer == 0) {
            return isPrimeNumber(sum) ? 1 : 0;
        }
        if (index == nums.length) {
            return 0;
        }
        return getNumOfPrimeNumber(nums, sum + nums[index], index + 1, layer - 1) +
                getNumOfPrimeNumber(nums, sum, index + 1, layer);
    }

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
