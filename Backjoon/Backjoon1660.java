import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
   public static int fibo(int n){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int result = n;
        for (int i = 1; i < n; i++){
            if (result - fibo(i) >= 0) {
                result = result - fibo(i);
                sum++;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}
