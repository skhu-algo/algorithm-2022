import java.util.Scanner;
import java.util.HashSet;
public class boj5568 {
	static int[] pick;
	static boolean[] visited;
	static int[] arr;
	static HashSet<String> set = new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		pick = new int[n];
		visited = new boolean[n];
		arr = new int[k];
		for(int i=0; i<n; i++) {
			pick[i] = sc.nextInt();
		}
		sc.close();
		dfs(0 , n, k, arr);
		System.out.println(set.size());
	}
	static void dfs(int index, int n, int k, int[] arr) {
		StringBuilder str = new StringBuilder();
		if(index == k) {
			for(int i=0; i<k; i++) {
				str.append(arr[i]);
			}
			set.add(str.toString());
			return;
		}
		
		for(int i =0; i<n; i++) {
				if(!visited[i]) {
				visited[i] = true;
				arr[index] = pick[i];
				dfs(index+1, n, k, arr);
				visited[i] = false;
			}
		}
			
	}

}
