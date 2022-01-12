import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>(); //중복x_순서x(HashSet)
        //set에 폰켓몬 번호 넣기
        for(int num :nums){
            set.add(num);
        }
        if(set.size()>= nums.length/2){ //set 크기가 폰켓몬수/2 보다 크거나같다면
            answer = nums.length/2; // 폰켓몬수/2 종류 선택 가능
        }
        else{ //아니라면
            answer = set.size(); //set크기 만큼의 종류 선택 가능
        }
        return answer;
    }
}