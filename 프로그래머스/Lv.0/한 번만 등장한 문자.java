class Solution {
    public String solution(String s) {
        String answer ="";
        int[] str = new int[26]; 
        for(int i = 0; i < s.length(); i++){
            str[s.charAt(i) - 97]++;
        }
        for(int i = 0; i < str.length; i++){
            if(str[i] == 1){
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
}
