import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] stack = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        int[] answer = new int[emergency.length];
        Arrays.sort(stack ,Collections.reverseOrder());
        for(int i = 0; i < emergency.length; i++){
            answer[i] = 1 + Arrays.asList(stack).indexOf(emergency[i]);
        }
        return answer;
    }
}
