class Solution {
    public int solution(String my_string) {
        String[] res = my_string.split(" ");
        int answer = Integer.parseInt(res[0]);

        for(int i = 1; i < res.length; i++){
            if(i%2!=0){
                if(res[i].equals("+")){
                    answer += Integer.parseInt(res[i+1]);
                } else {
                    answer -= Integer.parseInt(res[i+1]);
                }    
            }
        }
        return answer;
    }
}
