import java.util.Scanner;
public class boj15649 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int[] arr = new int[N];
		boolean[] visited = new boolean[N];
		function(arr, visited, N,M,0);	
	}
	
	static void function (int[] arr, boolean[] visited, int N, int M, int index) {
		StringBuilder strBuilder = new StringBuilder();
		if(index == M) {
			for(int i=0; i<M; i++) {
				strBuilder.append(arr[i]).append(" ");
			}
			strBuilder.append("\n");
		}
		for(int i = 0; i<N; i++) {
			if(visited[i]!= true) {
				visited[i] = true;
				arr[index] = i+1;
				function(arr,visited,N,M,index+1);
				visited[i] = false;
			}
		}
		System.out.print(strBuilder); 
	}
}
