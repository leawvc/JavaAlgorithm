// 이진 탐색 알고리즘
// 입력 값 : 5 3
// 입력 값 : 1 2 3 4 5
// 출력 값 : 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] > target){
                end = mid - 1;
            }
            else end = mid + 1;
        }
        return  -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int [] arr = new int[x];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < x; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = binarySearch(arr, target, 0, x);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }

    }
}
