import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = board[0] / 2;
        int y = board[1] / 2;
        int [] answer = new int[2];
        for(String s : keyinput){
            if(answer[0] > -x){
                if(s.equals("left")){
                answer[0]--;
                }
            }if(answer[0] < x){
                if(s.equals("right")){
                answer[0]++;
                }
            }if(answer[1] < y){
                if(s.equals("up")){
                answer[1]++;
                }
            }if(answer[1] > -y){
                if(s.equals("down")){
                answer[1]--;
                }
            }
        }
        return answer;
    }
}
