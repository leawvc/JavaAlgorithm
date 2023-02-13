import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int min = Math.abs(array[0] - n);
        for(int i = 1; i < array.length; i++){
            if(min == Math.abs(array[i] - n)){
                continue;
            }
            else if(min > Math.abs(array[i] - n)){
                min = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        return answer;
    }
}
