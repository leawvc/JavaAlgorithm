class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] str = letter.split(" ");
        String [] mail = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < mail.length; j++){
                if(str[i].equals(mail[j])){
                    answer += (char)(j + 97);
                }
            }
        }
        return answer;
    }
}
