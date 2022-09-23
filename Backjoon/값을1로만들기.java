import java.util.Scanner;

public class 값을1로만들기 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int result = 0;
        while (true){
        if (n % k != 0){
            n -= 1;
        }
        else {
            n = n/k;
        }
        result++;
        if (n == 1){
            break;
        }
    }
        System.out.println(result);
}
