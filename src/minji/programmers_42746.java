import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] list = new String[numbers.length];
        
        //String배열로 변환
        for (int i =0;i< numbers.length; i++){
            list[i]= String.valueOf(numbers[i]);
        }
        
        //내림차순 정렬_ (o2+o1).compareTo(o1+o2);
        //오름차순 정렬_ (o1+o2).compareTo(o1+o2);
        
        Arrays.sort(list,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return(b+a).compareTo(a+b); //내림차순
            }
        });
        //첫번째값이 0이라면
        if(list[0].equals("0")) return "0";
        
        
        //0이 아니면 문자열을 더해줌
        for(String s:list) answer+=s;
        
        return answer;
    }
}