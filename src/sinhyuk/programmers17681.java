package sinhyuk;
//17681_[1차] 비밀지도
public class programmers17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = getColSecret(n, arr1[i], arr2[i]);
        }
        return answer;
    }

    String getColSecret(int n, int col1, int col2) {
        String colSecret = "";
        String colString1 = extendLengthToN(n, Integer.toBinaryString(col1));
        String colString2 = extendLengthToN(n, Integer.toBinaryString(col2));
        for (int i = 0; i < n; i++) {
            colSecret += (colString1.charAt(i) == '0' && colString2.charAt(i) == '0') ? ' ' : '#';
        }
        return colSecret;
    }

    String extendLengthToN(int n, String str) {
        while (str.length() < n) {
            str = '0' + str;
        }
        return str;
    }
}
