import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean[] visited = new boolean[n];	
		
		function(0, arr, visited);
		sc.close();
	}
	static void function(int index, int[] arr, boolean[] visited) {
		if(index == arr.length) {
			for(int i=0; i<index; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(visited[i]!=true) {
				visited[i] = true;
				arr[index]=i+1;
				function(index+1, arr, visited);
				visited[i] = false;
			}
				
		}
	}
}
