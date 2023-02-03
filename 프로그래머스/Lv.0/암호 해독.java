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
