// 이진 탐색 알고리즘
// 입력 값 : 5
// 입력 값 : 8 3 7 9 2
// 입력 값 : 3
// 입력 값 : 5 7 9
// 출력 값 : no yes yes
// 실패 출력 값 : no yes no yes no

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++){
            arr[Integer.parseInt(st.nextToken())] = 1;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < m; i++){
            if (arr[Integer.parseInt(st.nextToken())] == 1){
                System.out.print("yes ");
            }else
                System.out.printf("no ");
        }
    }
}
