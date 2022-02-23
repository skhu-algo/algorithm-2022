//투자의 귀재 배주형
import java.util.Scanner;
public class boj19947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); //금액
		int Y = sc.nextInt(); //기간
		sc.close();
		System.out.println(solution(H,Y));
	}
	
	static int solution(int H, int Y) {
		if(Y == 0)
			return H;
		int max = 0;
		if(Y >=1) max = Math.max(max, solution((int)(H * 1.05), Y-1));
		if(Y >=3) max = Math.max(max, solution((int)(H * 1.2), Y-3));
		if(Y >=5) max = Math.max(max, solution((int)(H * 1.35), Y-5));
		return max;
	}
}
