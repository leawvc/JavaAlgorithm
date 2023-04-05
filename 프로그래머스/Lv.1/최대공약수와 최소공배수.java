class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 최대공약수 구하기
        int gcd = getGcd(n, m);
        answer[0] = gcd;

        // 최소공배수 구하기
        int lcm = n * m / gcd;
        answer[1] = lcm;

        return answer;
    }

    // 최대공약수를 구하는 함수
    public int getGcd(int a, int b) {
        int mod = a % b;
        while (mod > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        return b;
    }
}
