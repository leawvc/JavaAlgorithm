import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> codes = new HashMap<String, Integer>();
        for(int i = 0; i < name.length; i++){
            codes.put(name[i], yearning[i]);
        }
        for(int i = 0; i < photo.length; i++){
            for(String str : photo[i]){
                if(codes.containsKey(str)){
                    answer[i] += codes.get(str);
                }
            }
        }
        return answer;
    }
}
