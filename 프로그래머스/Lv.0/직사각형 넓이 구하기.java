import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = 0; int y1 = 0;
        
        for(int i = 1; i < 4; i++) {
            if((dots[0][0] != dots[i][0]) && (dots[0][1] != dots[i][1])) {
                x1 = dots[i][0];
                y1 = dots[i][1];
                System.out.println(x1 + " " + y1);
                break;
            }
        }
        return answer;
    }
}
