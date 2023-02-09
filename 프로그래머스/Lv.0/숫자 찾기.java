class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        if(str.contains(Integer.toString(k))){
            return str.indexOf(Integer.toString(k)) + 1;
        }
        return -1;
    }
}

========================================
  
class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
