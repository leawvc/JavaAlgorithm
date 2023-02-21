class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int [] arr = new int[201];
        for(int [] i : lines){
            int a = i[0] + 100;
            int b = i[1] + 100;
            for(int j = a; j < b; j++){
                arr[j]++;
                if(arr[j] == 2){
                    answer++;
                }
            }
        }
        return answer;
    }
}
