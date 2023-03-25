import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        for(int i : arr){
            if(!st.empty()){
                if(st.peek() != i){
                    st.push(i);
                }
            }else{
                st.push(i);
            }
        }
        int[] answer = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            answer[i] = st.pop();
        }
        return answer;
    }
}
