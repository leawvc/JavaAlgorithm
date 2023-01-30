class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String num = Integer.toString(array[i]);
            String [] len = num.split("");
            for(int j = 0; j < len.length; j++){
                if(len[j].equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
