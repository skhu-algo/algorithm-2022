import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    static class Report{
        HashSet<String> report_list = new HashSet<>(); //이 유저가 신고한 ID 목록
        HashSet<String> reported_list = new HashSet<>(); // 이 유저를 신고한 ID 목록
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Report> map = new HashMap<>();
        for(String id : id_list){
            map.put(id, new Report()); // 각 사용자id마다 Report 객체를 등록
        }
        for(String r : report){
            String[] a = r.split(" "); // 공백 기준으로 잘라 배열 a에 넣음
            map.get(a[0]).report_list.add(a[1]); // id가 a[0]인 Report 객체의 신고한 목록 report_list에 id a[1]를 넣는다. (a[0]가 a[1]를 신고했다)
            map.get(a[1]).reported_list.add(a[0]); // a[1]가 a[0]으로부터 신고를 당했다.
        }
        ArrayList<Integer> answer = new ArrayList<>(); //리턴할 배열
        for (String id : id_list){
            int count = 0; // 이 id의 유저가 신고한 사람들 중에서 몇 명이나 실제로 정지당했나
            for(String user : map.get(id).report_list){ //이 id 유저가 신고한 유저 각각에 대해서
                if(map.get(user).reported_list.size() >=k) //그 유저가 신고당한 목록의 크기가 k이상이면(신고당한 횟수가 k이상이면)
                    ++count; // 정지당한 것이므로 id 유저가 받아야할 메일 수를 증가시킨다. 
            }answer.add(count); //id 유저가 받아야할 메일 수를 등록
        }
        
        
        return answer.stream().mapToInt(i->i).toArray(); //ArrayList<Integer> 객체를 int[]로 변환
    }
}