import java.util.Scanner;

public class boj19949 {
	static int[] answer;
	static int score;
	static int[] arr;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		answer = new int[10];
		arr = new int[10];
		count =0;
		for(int i =0; i<10; i++) {
			answer[i] = sc.nextInt();
		}
		sc.close();
		dfs(0);
		System.out.println(count);
	}
	//재귀함수
	static void dfs(int index) {
		if(index == 10) {
			check(arr);
			if(score>=5) {
				count++;
			}
			return;
		}
		
		for(int i=0; i<5; i++) {
			if(index>1 && arr[index-1] == arr[index-2] && arr[index-2]== i+1)
				continue;
			arr[index] = i+1;
			dfs(index+1);
			arr[index] =0;
		}
		
	}
	//체점하는 메소드
	static int check(int[] arr) {
		score = 0;
		for(int i =0; i<10; i++) {
			if(answer[i]==arr[i]) {
				score++;
			}
		}
		return score;
	}
}
