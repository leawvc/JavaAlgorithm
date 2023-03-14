class Solution {
    boolean solution(String s) {
        int n = 0;
        int m = 0;
        boolean answer = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                n++;
            }if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                m++;
            }
        }
        if(n != m){
            answer = false;
        }
        return answer;
    }
}
