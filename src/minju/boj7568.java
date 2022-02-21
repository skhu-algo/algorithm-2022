//µ¢Ä¡
import java.util.Scanner;
public class boj7568 {
	static int N;
	static int[][] weight;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		weight = new int[N][2];
		for(int i =0; i<N; i++) {
			weight[i][0] = sc.nextInt();
			weight[i][1] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			System.out.println(rank(weight[i][0], weight[i][1]));
		}
	}
	static int rank(int w, int h) {
		count =0;
		for(int j=0; j<N; j++) {
			if( weight[j][0]> w && weight[j][1] > h) {
				count++;
			}continue;
		}
		return count+1;
	}
}
