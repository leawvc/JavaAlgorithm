import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }
        int [] num = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            num[i] = answer.get(i);
        }
        if(answer.size() == 0){
            int [] num1 = new int[1];
            num1[0] = -1;
            return num1;
        }
        Arrays.sort(num);
        return num;
    }
}
