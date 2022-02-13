import java.util.Scanner;

public class boj_19949{
	static int result=0;
	static int[] score = new int[10];
	static int[] choice = new int[10];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++){
			score[i] = sc.nextInt();
		}
		dfs(0);
		System.out.println(result);
	}
	static void dfs(int depth){
		if (depth==10){
			int sum=0;
			for(int i=0; i<10;i++){
				if (score[i] ==choice[i]) sum++;
			}
			if(sum>=5) result++;
			return;
		}
		for(int i=1;i<6;i++){
			if(depth>1 && choice[depth-1] ==i &&choice[depth-2] ==i) continue; //3연속 같은 선택 불가능
			
			choice[depth]=i; // 5개 중 하나 선택
			dfs(depth+1); //재귀
			choice[depth]=0; //값 초기화