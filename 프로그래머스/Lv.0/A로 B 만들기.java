import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String [] be = before.toLowerCase().split("");
        String [] af = after.toLowerCase().split("");
        Arrays.sort(be);
        Arrays.sort(af);
        for(int i = 0; i < be.length; i++){
            if(!be[i].equals(af[i])){
                return 0;
            }
        }
        return 1;
    }
}
