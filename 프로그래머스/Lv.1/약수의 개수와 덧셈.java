class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int index = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    index++;
                }
            }
            answer += (index % 2 == 0) ? i : -i;
        }
        return answer;
    }
}
