import java.util.Scanner;

public class Main{
    
	public static int kick(int S, int T,int kickcount) {
		if(S==T) return kickcount;
		if(S>T) return Integer.MAX_VALUE;
		
		int A = kick(S * 2,T+3, kickcount+1);
		int B = kick(S+12,T,  kickcount+1);

		return Math.min(A,B);
		}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		int C =sc.nextInt();
			
		for(int i=0;i<C;i++){
			int S = sc.nextInt();
			int T = sc.nextInt();
		    int minkick =kick(S[i],T[i],0);
			System.out.println(minkick);
			}
		}
    }