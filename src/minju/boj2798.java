//∫Ì∑¢¿Ë
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class boj2798 {
	static int M;
	static int N;
	static boolean[] visited;
	static int[] arr;
	static PriorityQueue <Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new boolean[N];
		arr = new int[N];
		int[] card = new int[N];
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		sc.close();
		
		dfs(0, card);
		System.out.println(priorityQueue.peek());
		
	}
	static void dfs(int index, int[] card) {
		int sum =0;
		if(index == 3) {
			for(int i : arr) {
				sum += i;
			}
			if(sum <= M) {
				priorityQueue.add(sum);
			}
			return;
		}
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = card[i];
				dfs(index+1, card);
				visited[i] = false;
			}
		}
	}

}
