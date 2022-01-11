
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        for(int i=0;i<n;i++){
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]); //2진수 변환
            //replace(a , b) _a를 b로 대체
            answer[i]= answer[i].replace("0",""); //0은 공백으로
            answer[i]=answer[i].replace("1","#"); //1은 #(벽)으로

        }
        
        return answer;
    }
}