class Solution {
    public int[] solution(int num, int total) {
        int [] answer = new int[num];
        
        int nSum = total % num;
        int start = total / num;
        if(num % 2 == 0){
            for(int i = 1; i <= num; i++){
                answer[i - 1] =start - nSum + i;
            }
        }else{
            for(int i = 0; i < num; i++){
                answer[i] =start - num / 2 + i;
            }
        }
        return answer;
    }
}
