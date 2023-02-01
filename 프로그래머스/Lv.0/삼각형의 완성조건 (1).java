class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int max = sides[0];
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += sides[i];
            if(max < sides[i]){
                max = sides[i];
            }
        }
        if(max >= sum - max){
            answer = 2;
        }
        return answer;
    }
}
