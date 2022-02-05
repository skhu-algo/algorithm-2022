import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //자동오름차순정렬
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for(int i=0;i<scoville.length;i++){
            minHeap.add(scoville[i]);
        }
        //제일 작은 두개의 값 빼기
        while(minHeap.peek()<K){
            int min1= minHeap.poll();
            int min2 = minHeap.poll();
        
            //힙에 추가
            minHeap.add(min1+min2*2);
            answer++;

            if(minHeap.peek()>=K) break;

            if(minHeap.peek()<K &&minHeap.size()==1){
                answer=-1;
                break;
            }
        }   
        return answer;
    }
}