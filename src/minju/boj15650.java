
import java.util.Scanner;
public class boj15650 {
	static int N;
	static int M;
	static int[] arr;
	static StringBuilder str = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		arr = new int[M];
		dfs(0, 1);
		System.out.println(str);
	}
	static void dfs(int index, int first) {
		
		if(index == M) {
			for(int j : arr) {
				str.append(j).append(" ");
			}
			str.append("\n");
			return;
		}
		
		for(int i=first; i<=N; i++) {
			arr[index] = i;
			dfs(index+1, i+1);
			
		}
	}

}
