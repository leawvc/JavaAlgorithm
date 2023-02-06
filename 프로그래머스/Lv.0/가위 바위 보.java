class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            char c = rsp.charAt(i);
            if(c == '2'){
                answer += 0;
            }else if(c == '5'){
                answer += 2;
            }else{
                answer += 5;
            }
        }
        return answer;
    }
}
