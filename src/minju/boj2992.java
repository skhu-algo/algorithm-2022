import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class boj2992 {
	static String x;
	static int[] numbers;
	static int[] arr;
	static boolean[] visited;
	static int num;
	static HashSet<Integer> set = new HashSet<Integer>();
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextLine();
		sc.close();
		arr = new int[x.length()];
		numbers = new int[x.length()];
		visited = new boolean[x.length()];
		for(int i=0; i<x.length(); i++) {
			numbers[i] = (int)(x.charAt(i) - '0');
		}
		dfs(0);
		
		
		boolean check = false;
		if(set.size()==0) {
			System.out.println(0);
		}else {
			List<Integer> list = new ArrayList<>(set);
			Integer min = list.get(0);
			for(Integer i : list) {
				if(min >= i) {
					min = i;
					check = true;
				}
			}System.out.println(check? min : 0); 
		}
		
		
		
	}
	static void dfs(int index) {
		StringBuilder str =  new StringBuilder();
		if(index == x.length()) {
			for(int i : arr) {
				str.append(i);
			}
			if(Integer.parseInt(str.toString()) > Integer.parseInt(x)) {
				set.add(Integer.parseInt(str.toString()));
			}
			return;
		}
		for(int i=0; i<x.length(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = numbers[i];
				dfs(index+1);
				visited[i] = false;
			}
		}
	}

}
