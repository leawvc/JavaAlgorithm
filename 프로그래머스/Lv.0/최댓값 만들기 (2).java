import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int min = 0;
        int max = 0;
        Arrays.sort(numbers);
        min = numbers[0] * numbers[1];
        max = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if(min > max){
            return min;
        }
        return max;
    }
}
