class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] a = my_string.split("");
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(letter)){
                answer += a[i];
            }
        }
        return answer;
    }
}

============================

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}
