class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int sum = num2 - num1 + 1;
        int[] answer = new int[sum];
        for(int i = 0; i < sum; i++){
            answer[i] = numbers[num1 + i];
        }
        return answer;
    }
}
