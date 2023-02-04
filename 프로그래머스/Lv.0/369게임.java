class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 1){
            if(((order % 10) != 0) && ((order % 10) % 3 == 0)){
                answer++;
            }
            order = order / 10;
        }
        return answer;
    }
}
