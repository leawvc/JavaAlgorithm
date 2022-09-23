import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[] num = new int[n];
        for (int i = 0; i < n; i++){
        num[i] = sc.nextInt();
    }
        Arrays.sort(num);
    int cnt = (m / (k + 1))*k;
    cnt += (m %( k + 1));
    int sum = 0;
    sum += num[n - 1] * cnt;
    sum += num[n - 2] * (m - cnt);
        System.out.println(sum);
}
