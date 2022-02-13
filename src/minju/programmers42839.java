import java.util.Arrays;

class Solution {
    
    //주어진 문자열 s에 0~9까지의 숫자가 각각 몇개 들어있는지 구하여 count배열에 넣는다.
    int[] getDigitCount(String s){  
        var count = new int[10];
        for (int i=0; i<s.length(); i++){
            count[s.charAt(i) - '0']++;
        }
        return count;
    }
    //배열 두개를 비교하는 메소드
    boolean compare(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] > b[i]) return false;
        }
        return true;
    }
    
    public int solution(String numbers) {
        int N = (int)Math.pow(10, numbers.length());
        var prime = new boolean[N];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i=2; i<=Math.sqrt(prime.length); ++i){
            if(prime[i])
                for(int j= i+i; j<prime.length; j+=i){
                    prime[j] = false;
                }
        }
        int answer =0;
        int[] count1 = getDigitCount(numbers); //주어진 문자열 numbers에서 각각의 수의 개수가 담긴 배열 count1
        for (int i=2; i<prime.length; ++i){
            if(prime[i] && compare(getDigitCount(String.valueOf(i)), count1))
                ++answer;
        }return answer;
    }
}