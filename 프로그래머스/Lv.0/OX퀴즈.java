class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] num = quiz[i].split(" ");
            if(num[1].equals("-")){
                if(Integer.parseInt(num[0]) - Integer.parseInt(num[2]) != Integer.parseInt(num[4])){
                    answer[i] = "X";
;                }
                else{
                    answer[i] = "O";
                }
            }else{
                if(Integer.parseInt(num[0]) + Integer.parseInt(num[2]) != Integer.parseInt(num[4])){
                    answer[i] = "X";
;                }
                else{
                    answer[i] = "O";
                }
            }
        }
        return answer;
    }
}
