import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;
        int [] x = new int [len];
        int [] y = new int [len];
        for(int i = 0; i < len; i++){
            x[i] = Math.min(sizes[i][0], sizes[i][1]);
            y[i] = Math.max(sizes[i][0], sizes[i][1]);
        }
        Arrays.sort(x);
        Arrays.sort(y);
        answer = x[len - 1] * y[len - 1];
        return answer;
    }
}

======================================================

class Solution {
    public int solution(int[][] sizes) {
        int x = 0 , y = 0;
        for(int [] i : sizes){
            x = Math.max(x , Math.min(i[0], i[1]));
            y = Math.max(y , Math.max(i[0], i[1]));
        }
        return x * y;
    }
}
