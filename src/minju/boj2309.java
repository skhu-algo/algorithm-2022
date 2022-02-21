//ÀÏ°ö ³­ÀïÀÌ
import java.util.Arrays;
import java.util.Scanner;

public class boj2309 {
	static int[] numbers = new int[9];
	static int[] ³­ÀïÀÌ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean check = false;
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		sc.close();
		for(int i=0; i<numbers.length; i++) {
			if(check) break;
			for(int j =0; j<numbers.length; j++) {
				if(j==i) continue;
				if(sum - numbers[i] - numbers[j] == 100) {
					numbers[i] = 0;
					numbers[j] = 0;
					check= true;
					break;
					
				}
			}
		}
		Arrays.sort(numbers);
		for(int i : numbers) {
			if(i != 0) {
				System.out.println(i);
			}
		}	
	}
}
