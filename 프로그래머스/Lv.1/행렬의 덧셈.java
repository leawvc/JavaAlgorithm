class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int k = arr1.length;
        int n = arr1[0].length;
        int[][] answer = new int[k][n];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
