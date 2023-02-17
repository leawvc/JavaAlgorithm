import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int [] i : score){
            num.add(i[0] + i[1]);
        }
        num.sort(Collections.reverseOrder());
        int[] answer = new int [score.length];
        for(int i = 0; i < score.length; i++){
            answer[i] = num.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}
