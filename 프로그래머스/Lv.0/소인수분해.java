import java.util.*;

class Solution {
    public int[] solution(int n) {
        int [] sum = {};
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 2;
        while(n >= 2){
            if(n % i == 0){
                n = n / i;
                answer.add(i);
            }else{
                i++;
            }
        }
        sum =  answer.stream().distinct().mapToInt(Integer::intValue).toArray();
        return sum;
    }
}
