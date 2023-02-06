import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : numlist){
            if(i % n == 0){
                arrayList.add(i);
            } 
        }
        // 반환시 int []를 반환해야 하기 때문에 arrayList.stream().mapToInt(Integer::intValue).toArray();으로 arrayList형식으로 int 배열로 바꿔줘야 한다.
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
