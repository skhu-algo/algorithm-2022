class Solution {
    public int[] solution(int[] numbers) {
        //새로운 배열 생성_배열의 합 저장
        List<Integer> list = new ArrayList<Integer>();
            
        //두 수 더하기
        for (int i =0 ; i<numbers.length-1; i++){
            for (int j=i+1; j<numbers.length ; j++){
                int sum = numbers[i] + numbers[j];
                //합이 0보다 크다면 배열 list에 추가 (중복제거) 
                if (list.indexOf(sum)<0){ //indexof _ 특정문자찾기
                    list.add(sum);
                }
            }
            
        }
    
        int[] answer = {};
        //list 안의 값을 answer에 저장
        for (int i =0 ; i<list.size(); i++){
            answer [i]= list.get(i);
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}