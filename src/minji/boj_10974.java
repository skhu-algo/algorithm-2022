import java.util.Scanner;

public class Main{
	static void factorial(int index, int[] arr, boolean[] vistied) {
		if(index ==arr.length){
			for(int num:arr){
				System.out.print(num+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i< arr,length; i++){
			if(!visited[i]){
				visited[i] = true;
				arr[index] = i+1;
				print(index+1,arr, visited);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		boolean[] visited = new boolean[N];
		
		print(0,arr,visited);
		
	}
}
		
			
	