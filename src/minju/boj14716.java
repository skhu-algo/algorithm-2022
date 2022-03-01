//현수막
import java.util.Scanner;
public class boj14716 {
	static int[][] map;
	static int M,N;
	static boolean[][] visited;
	static void DFS(int m, int n) {
		if(m < 0 || n < 0 || m >= M || n >= N) return;
		if(map[m][n] == 0) return;
		if(visited[m][n]) return;
		
		visited[m][n] = true;
		DFS(m+1,n);
		DFS(m, n+1);
		DFS(m+1, n+1);
		DFS(m-1, n+1);
		DFS(m-1, n);
		DFS(m+1, n-1);
		DFS(m, n-1);
		DFS(m-1, n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); //행
		N = sc.nextInt(); //열
		map = new int[M][N];
		visited = new boolean[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int count =0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && visited[i][j]==false) {
					DFS(i,j);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
