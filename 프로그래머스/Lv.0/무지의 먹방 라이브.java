class Solution {
    public int solution(int[] food_times, long k) {
        int n = food_times.length;
        int count = 0;
        int result = 0;
        while (true){
            for (int i = 0; i < n; i++){
                if (food_times[i] > 0) {
                    food_times[i]--;
                }
                else if (food_times[i] == 0) i++;
                if (i >= n){
                    count = -1;
                    break;
                }
                result++;
                if (i == n - 1){
                    count = 1;
                }else count = i + 1;
            }
            if (result == k) break;
        }
        return(count);
    }
}
