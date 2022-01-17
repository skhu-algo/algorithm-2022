import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] p1= {1,2,3,4,5};//1번 수포자 
        int[] p2= {2,1,2,3,2,4,2,5};//2번 수포자 
        int[] p3= {3,3,1,1,2,2,4,4,5,5};//3번 수포자
        
        //각 1,2,3 수포자가 맞춘 정답 수
        int num1=0; 
        int num2=0;
        int num3=0;
        
        for(int i=0;i<answer.length;i++){
            if(p1[i]==answer[i]){
                num1++;
            }
            if(p2[i]==answer[i]){
                num2++;
            }
            if(p3[i]==answer[i]){
                num3++;
            }
            
        }
        
        int max = Math.max(Math.max(num1,num2),num3);//세 사람 중 최고 점수 구하기
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        if(max==num1){
            list.add(1); 
        }
        if(max==num2){
            list.add(2);
        }
        if(max==num3){
            list.add(3);
        }
        
        for(int i=0; i<answer.length;i++){
            answer[i]= list.get(i); //ArrayList 배열 인덱스_get(index)
        }
        

            
        
        return answer;
    }
}