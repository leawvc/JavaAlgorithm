class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken > 9){
            int n = chicken / 10;
            int m = chicken % 10;
            chicken = n + m;
            
            answer += n;
        }
        return answer;
    }
}
