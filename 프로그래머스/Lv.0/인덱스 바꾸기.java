class Solution {
    public String solution(String my_string, int num1, int num2) {
        char str = my_string.charAt(num1);
        char str2 = my_string.charAt(num2);
        String answer = my_string.replace(str, str2);
        answer.replace(str2, str);
        System.out.println(str +" " + str2);
        return answer;
    }
}
