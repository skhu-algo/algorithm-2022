import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        var queue = new PriorityQueue<Integer>();
        for(int i : scoville){
            queue.add(i);
        }
        while(queue.peek()<K){
            if(queue.size() < 2) return -1;
            queue.add(queue.remove()+ queue.remove()*2);
        }
        return scoville.length - queue.size();
    }
}