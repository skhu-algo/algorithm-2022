//분해합
import java.util.PriorityQueue;
import java.util.Scanner;
public class boj2231 {
	static int length;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		length = (int)(Math.log10(N)+1);
		for(int i =0; i<N; i++) {
			if(number(i)==N) {
				queue.add(i);
			}	
		}
		System.out.println((queue.size()==0)? 0 : queue.peek());
		
	}
	
	static int number (int n) {
		int l = (int)(Math.log10(n)+1);
		int sum = n;
		double num =0; // 각 자리의 수
		for(int i=1; i<=l; i++) {
			if(i==1) {
				sum += (double) n / Math.pow(10, l-i);
				num = (double) n % Math.pow(10, l-i);
			}else {
				sum += (double) num / Math.pow(10, l-i);
				num = (double) num % Math.pow(10, l-i);
			}
		} return sum;	
	}
}
