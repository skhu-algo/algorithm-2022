import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int C = sc.nextInt();
       int[] S = new int[C];
       int[] T = new int[C];
       for(int i=0; i<C; i++) {
    	   S[i] = sc.nextInt();
    	   T[i] = sc.nextInt();
       }
       
       for(int i =0; i<C; i++) {
    	  System.out.println(kick(S[i],T[i],0));
       }
    }
    
    public static int kick(int S, int T, int count) {
    	if(S>T) return 100;
    	if(S==T) return count;
    	int A = kick(S*2, T+3, count+1);
    	int B = kick(S+1, T, count+1);
    	return Math.min(A, B);
    }
}

