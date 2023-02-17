class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String s : dic){
            int n = 0;
            for(String str : spell){
                if(s.contains(str)){
                    n++;
                }
            }
            if(n == spell.length){
                answer = 1;
            }
        }
        return answer;
    }
}
