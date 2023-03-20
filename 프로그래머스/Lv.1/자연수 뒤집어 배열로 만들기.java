class Solution {
    public int[] solution(long n) {
        int m = (int)(Math.log10(n)+1);
        int[] answer = new int[m];
        String [] str = Long.toString(n).split("");
        for(int i = m - 1; i >= 0; i--){
            answer[i] = Integer.valueOf(str[m - i - 1]);
        }
        return answer;
    }
}
