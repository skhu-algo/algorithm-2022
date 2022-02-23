//부분수열의 합
import java.util.Scanner;
public class boj1182 {
	static int N;
	static int S;
	static int[] A;
	static int solution (int index, int count, int sum){
		if(index == A.length)
			return (sum == S && count >0) ? 1 : 0;
		int r1 = solution(index+1 , count, sum);
		int r2 = solution(index+1, count+1, sum+A[index]);
		return r1+r2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		A = new int[N];
		for(int i =0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(solution(0, 0, 0));
	}
}
