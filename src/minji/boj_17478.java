import java.util.Scanner;

public class Main{
    
    static String underbar = ""; //전역변수로 미리 선언해두어 underbar가 초기화 영향을 받지 않게 함
    
				
    public static void recursive(int N){
        
        //처음엔 여백 x
        String tap = underbar;
								
        // 0이 되면 재귀종료
        if(N==0){
            System.out.println(tap + "\"재귀함수가 뭔가요?\"");
            System.out.println(tap + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(tap + "라고 답변하였지.");
            return;
        }
        //0이 되기 전까지 재귀반복
        System.out.println(tap + "\"재귀함수가 뭔가요?\"");
        System.out.println(tap + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(tap + "마을 사람들은 모두 그 선언에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(tap + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날,그 선언에게 한 선비가 찾아와서 물었어.\"");
								
        //재귀 전 줄 생성_크기 증가
        underbar+= "____";
        recursive(N-1);
								
        //탭이 큰 순서부터 출력
        System.out.println(tap+ "라고 답변하였지.");
		
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(N);
    }
}