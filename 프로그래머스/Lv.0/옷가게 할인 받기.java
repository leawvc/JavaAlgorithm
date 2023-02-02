class Solution {
    public int solution(int price) {
        if(price > 500000) return (price * 80 / 100);
        if(price > 300000) return (price * 80 / 100);
        else return (price * 95 / 100);
    }
}
