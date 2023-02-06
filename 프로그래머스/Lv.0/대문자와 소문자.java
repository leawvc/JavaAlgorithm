class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(!Character.isUpperCase(charArray[i])){
                answer += Character.toUpperCase(my_string.charAt(i));
            }else{
                answer += Character.toLowerCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
