import java.util.*;
class Solution {
    public long solution(long n) {
        String s = "" + n;
        String [] str = s.split("");
        Arrays.sort(str);
        int j = str.length;
        long answer = 0;
        for(int i = 0; i < j; i++){
            answer = answer * 10 + Integer.parseInt(str[j - i - 1]);
        }
        return answer;
    }
}
