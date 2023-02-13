import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int size = i; size <= j; size++){
            StringBuffer sb = new StringBuffer();
            sb.append(size);
            for(int n = 0; n < sb.length(); n++){
                if((sb.charAt(n) - '0')== k){
                    answer++;
                }
            }
        }
        return answer;
    }
}
