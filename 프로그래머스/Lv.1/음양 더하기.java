class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

=======================================================================================================
삼항 연산자 활용

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}
