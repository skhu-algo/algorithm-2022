package sinhyuk;
//72410_신규 아이디 추천
public class programmers72410 {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
                .replaceAll("[^\\w0-9-_.]", "")
                .replaceAll("\\.{2,}", ".")
                .replaceAll("\\A\\.|\\.\\Z", "");
        new_id = new_id.length() == 0 ? "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("\\.\\Z", "") : new_id;
        while (new_id.length() <= 2) new_id += new_id.charAt(new_id.length() - 1);
        return new_id;
    }
}
