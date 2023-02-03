class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] str = cipher.split("");
        for(int i = 1; i <= str.length; i++){
            if(i * code <= str.length){
                answer += str[i * code - 1];   
            }else
                break;
        }
        return answer;
    }
}


==============================================================
    
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }
        return answer;
    }
}
