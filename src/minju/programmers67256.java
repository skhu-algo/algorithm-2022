import java.util.*;
class Solution {    
    public String solution(int[] numbers, String hand) {
    String answer = "";
        
    int leftHand_location = 10; // *
    int rightHand_location = 11; //#
    
    for(int i=0 ; i<numbers.length; i++){
        if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
            answer += "L";
            leftHand_location = numbers[i];
        }
        else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
            answer += "R";
            rightHand_location = numbers[i];
        }
        else {
            int[] L_Pos = position(leftHand_location);
            int[] R_Pos = position(rightHand_location);
            int[] Pos = position(numbers[i]);
            
            if(distance(L_Pos,Pos) < distance(R_Pos,Pos)){
                answer += "L";
                leftHand_location = numbers[i];
            } else if(distance(L_Pos,Pos) > distance(R_Pos,Pos)){
                answer += "R";
                rightHand_location = numbers[i];
            } else {
                if (hand.equals("right")){
                    answer += "R";
                    rightHand_location = numbers[i];
                } else {
                    answer += "L";
                    leftHand_location = numbers[i];
                     
                }
                    
            }
        }
            
            
    }
    
    return answer;
    }
    public static int[] position(int key){
        int[] array = {0,0};
        switch (key) {
            case 0: array[0] = 3; array[1] =1;
                     break;
            case 1: array[0] = 0; array[1] =0;
                     break;
            case 2:  array[0] = 0; array[1] =1;
                     break;
            case 3:  array[0] = 0; array[1] =2;
                     break;
            case 4:  array[0] = 1; array[1] =0;
                     break;
            case 5:  array[0] = 1; array[1] =1;
                     break;
            case 6:  array[0] = 1; array[1] =2;
                     break;
            case 7:  array[0] = 2; array[1] =0;
                     break;
            case 8:  array[0] = 2; array[1] =1;
                     break;
            case 9:  array[0] = 2; array[1] =2;
                     break;
            case 10: array[0] = 3; array[1] =0;
                     break;
            case 11: array[0] = 3; array[1] =2;
                     break;
        }return array;
    }
    
    public static int distance(int[] array1, int[]array2){
        int x1 = array1[0];
        int y1 = array1[1];
        int x2 = array2[0];
        int y2 = array2[1];
        
        return (Math.abs(x2-x1)+Math.abs(y2-y1));
        
    }
}