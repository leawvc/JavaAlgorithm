class Solution {
    public String solution(String my_string) {
        String[] str = {"a", "e", "i", "o", "u"};
        for(String i : str){
            my_string = my_string.replace(i, "");
        }
        return my_string;
    }
}
