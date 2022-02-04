class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String answer[] = new String[n];
        for(int i=0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
        }
        
        for(int i=0; i<n; i++){
            answer[i] = String.format("%"+n+"s",answer[i]); // answer[i].length가 n보다 작을 경우 공백을 추가한다
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
        return answer;
    }
}