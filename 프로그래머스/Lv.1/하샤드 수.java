class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s =  Integer.toString(x);
        int m = 0;
        for(int i = 0; i < s.length(); i++){
            m += s.charAt(i) -'0';
        }
        if(x % m != 0){
            answer = false;
        }
        return answer;
    }
}
